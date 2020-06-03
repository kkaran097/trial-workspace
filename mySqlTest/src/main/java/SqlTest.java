import java.sql.*;
import java.util.logging.*;

public class SqlTest {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/university";
        String user = "testuser";
        String password = "testuser";

        String query = "select name from instructor I where I.Id=(select i_ID from advisor A where A.s_ID=1827);";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            if (rs.next()) {

                System.out.println(rs.getString(1));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
