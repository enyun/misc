#  author: baigang
#
#

#OPT ?= -O2 -DNDEBUG       # (A) Production use (optimized mode)
#OPT ?= -g2              # (B) Debug mode, w/ full line-level debugging symbols
OPT ?= -O2 -g2 -DNDEBUG # (C) Profiling mode: opt, but w/debugging symbols

CC=gcc
CXX=g++

#PLATFORM_CCFLAGS= -fno-builtin-malloc -fno-builtin-calloc -fno-builtin-realloc -fno-builtin-free -fno-builtin-memcmp -pthread -DOS_LINUX -D_REENTRANT
PLATFORM_CCFLAGS= -pthread -DOS_LINUX -D_REENTRANT
#PLATFORM_CXXFLAGS= -fno-builtin-malloc -fno-builtin-calloc -fno-builtin-realloc -fno-builtin-free -fno-builtin-memcmp -pthread -DOS_LINUX -D_REENTRANT
PLATFORM_CXXFLAGS= -pthread -DOS_LINUX -D_REENTRANT
PLATFORM_LDFLAGS= -pthread -L/usr/local/lib
PLATFORM_LIBS= #-ltcmalloc_and_profiler

CFLAGS += -I./ -I./include -I./src -I/usr/local/include $(PLATFORM_CCFLAGS) $(OPT)
CXXFLAGS += -I./ -I./include -I./src -I/usr/local/include $(PLATFORM_CXXFLAGS) $(OPT)

LDFLAGS += $(PLATFORM_LDFLAGS) -L./lib/libmemcached -L./lib -L/usr/local/lib
#LIBS += $(PLATFORM_LIBS) -lboost_system -lboost_thread -lboost_regex -lunwind -lgflags -lglog -lmem_db
LIBS += $(PLATFORM_LIBS) -lpthread -lboost_system -lboost_thread -lboost_regex -lboost_filesystem -lboost_program_options \
				-lgflags -lglog -lcityhash


SOURCES= \
	src/redis_cluster.cc \
	src/redispp.cc \
	src/hiredis/async.cc \
	src/hiredis/hiredis.cc \
	src/hiredis/net.cc \
	src/hiredis/sds.cc 


LIBOBJECTS = $(SOURCES:.cc=.o)

all: redis_cluster_test 


check:
	python cpplint.py ./src/*.cpp ./src/*.c ./src/*.h

clean:
	rm -f $(LIBOBJECTS) redis_cluster_test

redis_cluster_test: $(LIBOBJECTS)
	$(CXX) $(LDFLAGS) $(LIBOBJECTS) test/test.cc -o redis_cluster_test $(CXXFLAGS) $(LIBS)

.cc.o: 
	$(CXX) $(CXXFLAGS) -c $< -o $@

.c.o:
	$(CC) $(CFLAGS) -c $< -o $@
