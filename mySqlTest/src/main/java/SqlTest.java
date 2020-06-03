import java.sql.*;
import java.util.logging.*;

public class SqlTest {
    private static final String url = "jdbc:mysql://localhost:3306/university";
    private static final String user = "testuser";
    private static final String password = "testuser";
    private Connection con;

    public Connection getCon(){
        return this.con;
    }

    public void connectToMySql() throws SQLException{
        this.con = DriverManager.getConnection(url,user,password);
    }

    public ResultSet getQueryResult(String query) throws SQLException {
        Statement st = this.con.createStatement();
        return st.executeQuery(query);
    }

    public void writeData(String query, String[] params) throws SQLException
    {
        PreparedStatement ps=this.con.prepareStatement(query);
        for (int i = 0;i < params.length;i++) {
            ps.setString(i + 1, params[i]);
        }
        ps.executeUpdate();
    }

    public static void main(String[] args) throws SQLException{
        SqlTest sqlTest = new SqlTest();
        sqlTest.connectToMySql();

        //---------Create
        String courseTitle = "Game Programming";
        String prereqTitle = "Game Design";
        String dept_name = "Comp. Sci.";
        String insertQuery = "insert into prereq values((select course_id from course where title=? and dept_name=?),"+
                "(select course_id from course where title=? and dept_name=?));";
        String[] insertParams = {courseTitle,dept_name,prereqTitle,dept_name};
        try {
            sqlTest.writeData(insertQuery, insertParams);
            System.out.println("Inserted successfully");
        }catch (SQLException e) {
            Logger lgr = Logger.getLogger(SqlTest.class.getName());
            lgr.log(Level.SEVERE, e.getMessage(), e);
        }

        //---------Read
        String query = "select name from instructor I where I.Id=(select i_ID from advisor A where A.s_ID=1827);";

        try (ResultSet rs = sqlTest.getQueryResult(query)) {
            if (rs.next()) {
                System.out.println("Read the data: '"+rs.getString(1)+"' from database");
            }
        } catch (SQLException e) {
            Logger lgr = Logger.getLogger(SqlTest.class.getName());
            lgr.log(Level.SEVERE, e.getMessage(), e);
        }

        //---------Update
        String prevgrade = "C-";
        String newgrade = "B+";
        String student = "Colin";
        String course = "Greek Tragedy";
        String dept = "Psychology";
        String updateQuery= "Update takes set grade = ? where id=(select id from student S where S.name=?) "+
                "AND course_id=(select course_id from course where title=? and dept_name =?) AND grade=? ;";
        String[] updateParams = {newgrade,student,course,dept,prevgrade};
        try{
            sqlTest.writeData(updateQuery,updateParams);
            System.out.println("Updated successfully");
        }catch (SQLException e) {
            Logger lgr = Logger.getLogger(SqlTest.class.getName());
            lgr.log(Level.SEVERE, e.getMessage(), e);
        }

        //---------Delete
        String deleteQuery = "delete from prereq where course_id=(select course_id from course where title=? and dept_name=?) "+
                "and prereq_id=(select course_id from course where title=? and dept_name=?)";
        try {
            sqlTest.writeData(deleteQuery, insertParams);
            System.out.println("Deleted successfully");
        }catch (SQLException e) {
            Logger lgr = Logger.getLogger(SqlTest.class.getName());
            lgr.log(Level.SEVERE, e.getMessage(), e);
        }
    }
}
