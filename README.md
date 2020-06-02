## OS Information

`lsb_release -a`
Distributor ID:	Ubuntu
Description:	Ubuntu 18.04.4 LTS
Release:	18.04
Codename:	bionic

`uname -a`
Linux karan 4.15.0-99-generic #100-Ubuntu SMP Wed Apr 22 20:32:56 UTC 2020 x86_64 x86_64 x86_64 GNU/Linux

## Java Information

`java -version`
java version "1.8.0_181"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)

## MySQL Information

`mysql> status`
mysql  Ver 14.14 Distrib 5.7.30, for Linux (x86_64) using  EditLine wrapper

Connection id:		5
Current database:	
Current user:		root@localhost
SSL:			Not in use
Current pager:		stdout
Using outfile:		''
Using delimiter:	;
Server version:		5.7.30-0ubuntu0.18.04.1 (Ubuntu)
Protocol version:	10
Connection:		Localhost via UNIX socket
Server characterset:	latin1
Db     characterset:	latin1
Client characterset:	utf8
Conn.  characterset:	utf8
UNIX socket:		/var/run/mysqld/mysqld.sock
Uptime:			11 hours 29 min 34 sec

Threads: 1  Questions: 10  Slow queries: 0  Opens: 105  Flush tables: 1  Open tables: 98  Queries per second avg: 0.000

`mysql> show databases;`
| Database           |
|--------------------|
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| university         |

## Redis Information

`127.0.0.1:6379> INFO`

# Server
redis_version:5.0.8
redis_git_sha1:00000000
redis_git_dirty:0
redis_build_id:129cf1a0751f12a
redis_mode:standalone
os:Linux 4.15.0-99-generic x86_64
arch_bits:64
multiplexing_api:epoll
atomicvar_api:atomic-builtin
gcc_version:7.5.0
process_id:13211
run_id:f36a18ac97875c99f9269b0eec0f20bb887739fc
tcp_port:6379
uptime_in_seconds:42471
uptime_in_days:0
hz:10
configured_hz:10
lru_clock:14063752
executable:/usr/bin/redis-server
config_file:/etc/redis/redis.conf

# Clients
connected_clients:1
client_recent_max_input_buffer:2
client_recent_max_output_buffer:0
blocked_clients:0

# Memory
used_memory:854464
used_memory_human:834.44K
used_memory_rss:4534272
used_memory_rss_human:4.32M
used_memory_peak:4954240
used_memory_peak_human:4.72M
used_memory_peak_perc:17.25%
used_memory_overhead:841086
used_memory_startup:791392
used_memory_dataset:13378
used_memory_dataset_perc:21.21%
allocator_allocated:1258408
allocator_active:1536000
allocator_resident:8626176
total_system_memory:8110579712
total_system_memory_human:7.55G
used_memory_lua:37888
used_memory_lua_human:37.00K
used_memory_scripts:0
used_memory_scripts_human:0B
number_of_cached_scripts:0
maxmemory:0
maxmemory_human:0B
maxmemory_policy:noeviction
allocator_frag_ratio:1.22
allocator_frag_bytes:277592
allocator_rss_ratio:5.62
allocator_rss_bytes:7090176
rss_overhead_ratio:0.53
rss_overhead_bytes:-4091904
mem_fragmentation_ratio:5.58
mem_fragmentation_bytes:3721808
mem_not_counted_for_evict:0
mem_replication_backlog:0
mem_clients_slaves:0
mem_clients_normal:49694
mem_aof_buffer:0
mem_allocator:jemalloc-5.1.0
active_defrag_running:0
lazyfree_pending_objects:0

# Persistence
loading:0
rdb_changes_since_last_save:0
rdb_bgsave_in_progress:0
rdb_last_save_time:1591079585
rdb_last_bgsave_status:ok
rdb_last_bgsave_time_sec:-1
rdb_current_bgsave_time_sec:-1
rdb_last_cow_size:0
aof_enabled:0
aof_rewrite_in_progress:0
aof_rewrite_scheduled:0
aof_last_rewrite_time_sec:-1
aof_current_rewrite_time_sec:-1
aof_last_bgrewrite_status:ok
aof_last_write_status:ok
aof_last_cow_size:0

# Stats
total_connections_received:1
total_commands_processed:1
instantaneous_ops_per_sec:0
total_net_input_bytes:31
total_net_output_bytes:11468
instantaneous_input_kbps:0.00
instantaneous_output_kbps:0.00
rejected_connections:0
sync_full:0
sync_partial_ok:0
sync_partial_err:0
expired_keys:0
expired_stale_perc:0.00
expired_time_cap_reached_count:0
evicted_keys:0
keyspace_hits:0
keyspace_misses:0
pubsub_channels:0
pubsub_patterns:0
latest_fork_usec:0
migrate_cached_sockets:0
slave_expires_tracked_keys:0
active_defrag_hits:0
active_defrag_misses:0
active_defrag_key_hits:0
active_defrag_key_misses:0

# Replication
role:master
connected_slaves:0
master_replid:d375270df79b42de41005b49d64942c7f51cec92
master_replid2:0000000000000000000000000000000000000000
master_repl_offset:0
second_repl_offset:-1
repl_backlog_active:0
repl_backlog_size:1048576
repl_backlog_first_byte_offset:0
repl_backlog_histlen:0

# CPU
used_cpu_sys:18.707136
used_cpu_user:14.628342
used_cpu_sys_children:0.000000
used_cpu_user_children:0.000000

# Cluster
cluster_enabled:0

# Keyspace
127.0.0.1:6379> 



