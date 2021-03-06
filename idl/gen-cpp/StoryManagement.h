/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef StoryManagement_H
#define StoryManagement_H

#include <thrift/TDispatchProcessor.h>
#include "recomm_engine_types.h"

namespace recomm_engine { namespace idl {

class StoryManagementIf {
 public:
  virtual ~StoryManagementIf() {}
  virtual void add_story(StoryAddingResponse& _return, const StoryAddingRequest& request) = 0;
};

class StoryManagementIfFactory {
 public:
  typedef StoryManagementIf Handler;

  virtual ~StoryManagementIfFactory() {}

  virtual StoryManagementIf* getHandler(const ::apache::thrift::TConnectionInfo& connInfo) = 0;
  virtual void releaseHandler(StoryManagementIf* /* handler */) = 0;
};

class StoryManagementIfSingletonFactory : virtual public StoryManagementIfFactory {
 public:
  StoryManagementIfSingletonFactory(const boost::shared_ptr<StoryManagementIf>& iface) : iface_(iface) {}
  virtual ~StoryManagementIfSingletonFactory() {}

  virtual StoryManagementIf* getHandler(const ::apache::thrift::TConnectionInfo&) {
    return iface_.get();
  }
  virtual void releaseHandler(StoryManagementIf* /* handler */) {}

 protected:
  boost::shared_ptr<StoryManagementIf> iface_;
};

class StoryManagementNull : virtual public StoryManagementIf {
 public:
  virtual ~StoryManagementNull() {}
  void add_story(StoryAddingResponse& /* _return */, const StoryAddingRequest& /* request */) {
    return;
  }
};

typedef struct _StoryManagement_add_story_args__isset {
  _StoryManagement_add_story_args__isset() : request(false) {}
  bool request;
} _StoryManagement_add_story_args__isset;

class StoryManagement_add_story_args {
 public:

  StoryManagement_add_story_args() {
  }

  virtual ~StoryManagement_add_story_args() throw() {}

  StoryAddingRequest request;

  _StoryManagement_add_story_args__isset __isset;

  void __set_request(const StoryAddingRequest& val) {
    request = val;
  }

  bool operator == (const StoryManagement_add_story_args & rhs) const
  {
    if (!(request == rhs.request))
      return false;
    return true;
  }
  bool operator != (const StoryManagement_add_story_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const StoryManagement_add_story_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class StoryManagement_add_story_pargs {
 public:


  virtual ~StoryManagement_add_story_pargs() throw() {}

  const StoryAddingRequest* request;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _StoryManagement_add_story_result__isset {
  _StoryManagement_add_story_result__isset() : success(false) {}
  bool success;
} _StoryManagement_add_story_result__isset;

class StoryManagement_add_story_result {
 public:

  StoryManagement_add_story_result() {
  }

  virtual ~StoryManagement_add_story_result() throw() {}

  StoryAddingResponse success;

  _StoryManagement_add_story_result__isset __isset;

  void __set_success(const StoryAddingResponse& val) {
    success = val;
  }

  bool operator == (const StoryManagement_add_story_result & rhs) const
  {
    if (!(success == rhs.success))
      return false;
    return true;
  }
  bool operator != (const StoryManagement_add_story_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const StoryManagement_add_story_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _StoryManagement_add_story_presult__isset {
  _StoryManagement_add_story_presult__isset() : success(false) {}
  bool success;
} _StoryManagement_add_story_presult__isset;

class StoryManagement_add_story_presult {
 public:


  virtual ~StoryManagement_add_story_presult() throw() {}

  StoryAddingResponse* success;

  _StoryManagement_add_story_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

class StoryManagementClient : virtual public StoryManagementIf {
 public:
  StoryManagementClient(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) :
    piprot_(prot),
    poprot_(prot) {
    iprot_ = prot.get();
    oprot_ = prot.get();
  }
  StoryManagementClient(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, boost::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) :
    piprot_(iprot),
    poprot_(oprot) {
    iprot_ = iprot.get();
    oprot_ = oprot.get();
  }
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> getInputProtocol() {
    return piprot_;
  }
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> getOutputProtocol() {
    return poprot_;
  }
  void add_story(StoryAddingResponse& _return, const StoryAddingRequest& request);
  void send_add_story(const StoryAddingRequest& request);
  void recv_add_story(StoryAddingResponse& _return);
 protected:
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> piprot_;
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> poprot_;
  ::apache::thrift::protocol::TProtocol* iprot_;
  ::apache::thrift::protocol::TProtocol* oprot_;
};

class StoryManagementProcessor : public ::apache::thrift::TDispatchProcessor {
 protected:
  boost::shared_ptr<StoryManagementIf> iface_;
  virtual bool dispatchCall(::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, const std::string& fname, int32_t seqid, void* callContext);
 private:
  typedef  void (StoryManagementProcessor::*ProcessFunction)(int32_t, ::apache::thrift::protocol::TProtocol*, ::apache::thrift::protocol::TProtocol*, void*);
  typedef std::map<std::string, ProcessFunction> ProcessMap;
  ProcessMap processMap_;
  void process_add_story(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
 public:
  StoryManagementProcessor(boost::shared_ptr<StoryManagementIf> iface) :
    iface_(iface) {
    processMap_["add_story"] = &StoryManagementProcessor::process_add_story;
  }

  virtual ~StoryManagementProcessor() {}
};

class StoryManagementProcessorFactory : public ::apache::thrift::TProcessorFactory {
 public:
  StoryManagementProcessorFactory(const ::boost::shared_ptr< StoryManagementIfFactory >& handlerFactory) :
      handlerFactory_(handlerFactory) {}

  ::boost::shared_ptr< ::apache::thrift::TProcessor > getProcessor(const ::apache::thrift::TConnectionInfo& connInfo);

 protected:
  ::boost::shared_ptr< StoryManagementIfFactory > handlerFactory_;
};

class StoryManagementMultiface : virtual public StoryManagementIf {
 public:
  StoryManagementMultiface(std::vector<boost::shared_ptr<StoryManagementIf> >& ifaces) : ifaces_(ifaces) {
  }
  virtual ~StoryManagementMultiface() {}
 protected:
  std::vector<boost::shared_ptr<StoryManagementIf> > ifaces_;
  StoryManagementMultiface() {}
  void add(boost::shared_ptr<StoryManagementIf> iface) {
    ifaces_.push_back(iface);
  }
 public:
  void add_story(StoryAddingResponse& _return, const StoryAddingRequest& request) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->add_story(_return, request);
    }
    ifaces_[i]->add_story(_return, request);
    return;
  }

};

}} // namespace

#endif
