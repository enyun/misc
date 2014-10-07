#include <map>
#include <string>
#include <iostream>
#include <fstream>

#include "redis_cluster.h"
#include "redispp.h"

using namespace redis;
using namespace redis_cluster;

DEFINE_string(redis_cluster_config_file, "./conf/redis_cluster.conf", "redis cluster config file");


int main(int argc, char* argv[]) {
  google::ParseCommandLineFlags(&argc, &argv, true);
  google::InitGoogleLogging(argv[0]);

  std::string redis_cluster_config_file;
  redis_cluster_config_file = FLAGS_redis_cluster_config_file;

  RedisCluster redis_handle;
  redis_handle.Initialize(redis_cluster_config_file);

  std::string line;
  std::string uid;
  std::string profile;
  int32 profile_num;
  size_t split_offset = 0;
  while(getline(std::cin, line)) {
    split_offset = line.find_first_of('\t');
    uid = line.substr(0, split_offset);
    profile = line.substr(split_offset + 1, -1);
		std::string node_name = redis_handle.GetRedisNode(uid);
		std::cout << "Map " << uid << " " << profile << " on server " << node_name << std::endl;
		std::cout << uid.size() << "--" << profile.size()<< std::endl;

    bool is_ok = false;
    redis::Client *redis;
    pthread_mutex_t *mutex;
    is_ok = redis_handle.GetRedisNode(uid, &redis, &mutex);
    pthread_mutex_lock(mutex);
    if (is_ok) {
      redis->Set(uid.c_str(), uid.size(), profile.c_str(), profile.size());
    }
    pthread_mutex_unlock(mutex);
  }

	return 0;
}
