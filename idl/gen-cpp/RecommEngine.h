/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef RecommEngine_H
#define RecommEngine_H

#include <thrift/TDispatchProcessor.h>
#include "recomm_engine_types.h"
#include "FacebookService.h"

namespace recomm_engine { namespace idl {

class RecommEngineIf : virtual public  ::facebook::fb303::FacebookServiceIf {
 public:
  virtual ~RecommEngineIf() {}
  virtual void query(RecommendationResponse& _return, const RecommendationRequest& request) = 0;
};

class RecommEngineIfFactory : virtual public  ::facebook::fb303::FacebookServiceIfFactory {
 public:
  typedef RecommEngineIf Handler;

  virtual ~RecommEngineIfFactory() {}

  virtual RecommEngineIf* getHandler(const ::apache::thrift::TConnectionInfo& connInfo) = 0;
  virtual void releaseHandler( ::facebook::fb303::FacebookServiceIf* /* handler */) = 0;
};

class RecommEngineIfSingletonFactory : virtual public RecommEngineIfFactory {
 public:
  RecommEngineIfSingletonFactory(const boost::shared_ptr<RecommEngineIf>& iface) : iface_(iface) {}
  virtual ~RecommEngineIfSingletonFactory() {}

  virtual RecommEngineIf* getHandler(const ::apache::thrift::TConnectionInfo&) {
    return iface_.get();
  }
  virtual void releaseHandler( ::facebook::fb303::FacebookServiceIf* /* handler */) {}

 protected:
  boost::shared_ptr<RecommEngineIf> iface_;
};

class RecommEngineNull : virtual public RecommEngineIf , virtual public  ::facebook::fb303::FacebookServiceNull {
 public:
  virtual ~RecommEngineNull() {}
  void query(RecommendationResponse& /* _return */, const RecommendationRequest& /* request */) {
    return;
  }
};

typedef struct _RecommEngine_query_args__isset {
  _RecommEngine_query_args__isset() : request(false) {}
  bool request;
} _RecommEngine_query_args__isset;

class RecommEngine_query_args {
 public:

  RecommEngine_query_args() {
  }

  virtual ~RecommEngine_query_args() throw() {}

  RecommendationRequest request;

  _RecommEngine_query_args__isset __isset;

  void __set_request(const RecommendationRequest& val) {
    request = val;
  }

  bool operator == (const RecommEngine_query_args & rhs) const
  {
    if (!(request == rhs.request))
      return false;
    return true;
  }
  bool operator != (const RecommEngine_query_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const RecommEngine_query_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class RecommEngine_query_pargs {
 public:


  virtual ~RecommEngine_query_pargs() throw() {}

  const RecommendationRequest* request;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _RecommEngine_query_result__isset {
  _RecommEngine_query_result__isset() : success(false) {}
  bool success;
} _RecommEngine_query_result__isset;

class RecommEngine_query_result {
 public:

  RecommEngine_query_result() {
  }

  virtual ~RecommEngine_query_result() throw() {}

  RecommendationResponse success;

  _RecommEngine_query_result__isset __isset;

  void __set_success(const RecommendationResponse& val) {
    success = val;
  }

  bool operator == (const RecommEngine_query_result & rhs) const
  {
    if (!(success == rhs.success))
      return false;
    return true;
  }
  bool operator != (const RecommEngine_query_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const RecommEngine_query_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _RecommEngine_query_presult__isset {
  _RecommEngine_query_presult__isset() : success(false) {}
  bool success;
} _RecommEngine_query_presult__isset;

class RecommEngine_query_presult {
 public:


  virtual ~RecommEngine_query_presult() throw() {}

  RecommendationResponse* success;

  _RecommEngine_query_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

class RecommEngineClient : virtual public RecommEngineIf, public  ::facebook::fb303::FacebookServiceClient {
 public:
  RecommEngineClient(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) :
     ::facebook::fb303::FacebookServiceClient(prot, prot) {}
  RecommEngineClient(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, boost::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) :
     ::facebook::fb303::FacebookServiceClient(iprot, oprot) {}
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> getInputProtocol() {
    return piprot_;
  }
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> getOutputProtocol() {
    return poprot_;
  }
  void query(RecommendationResponse& _return, const RecommendationRequest& request);
  void send_query(const RecommendationRequest& request);
  void recv_query(RecommendationResponse& _return);
};

class RecommEngineProcessor : public  ::facebook::fb303::FacebookServiceProcessor {
 protected:
  boost::shared_ptr<RecommEngineIf> iface_;
  virtual bool dispatchCall(::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, const std::string& fname, int32_t seqid, void* callContext);
 private:
  typedef  void (RecommEngineProcessor::*ProcessFunction)(int32_t, ::apache::thrift::protocol::TProtocol*, ::apache::thrift::protocol::TProtocol*, void*);
  typedef std::map<std::string, ProcessFunction> ProcessMap;
  ProcessMap processMap_;
  void process_query(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
 public:
  RecommEngineProcessor(boost::shared_ptr<RecommEngineIf> iface) :
     ::facebook::fb303::FacebookServiceProcessor(iface),
    iface_(iface) {
    processMap_["query"] = &RecommEngineProcessor::process_query;
  }

  virtual ~RecommEngineProcessor() {}
};

class RecommEngineProcessorFactory : public ::apache::thrift::TProcessorFactory {
 public:
  RecommEngineProcessorFactory(const ::boost::shared_ptr< RecommEngineIfFactory >& handlerFactory) :
      handlerFactory_(handlerFactory) {}

  ::boost::shared_ptr< ::apache::thrift::TProcessor > getProcessor(const ::apache::thrift::TConnectionInfo& connInfo);

 protected:
  ::boost::shared_ptr< RecommEngineIfFactory > handlerFactory_;
};

class RecommEngineMultiface : virtual public RecommEngineIf, public  ::facebook::fb303::FacebookServiceMultiface {
 public:
  RecommEngineMultiface(std::vector<boost::shared_ptr<RecommEngineIf> >& ifaces) : ifaces_(ifaces) {
    std::vector<boost::shared_ptr<RecommEngineIf> >::iterator iter;
    for (iter = ifaces.begin(); iter != ifaces.end(); ++iter) {
       ::facebook::fb303::FacebookServiceMultiface::add(*iter);
    }
  }
  virtual ~RecommEngineMultiface() {}
 protected:
  std::vector<boost::shared_ptr<RecommEngineIf> > ifaces_;
  RecommEngineMultiface() {}
  void add(boost::shared_ptr<RecommEngineIf> iface) {
     ::facebook::fb303::FacebookServiceMultiface::add(iface);
    ifaces_.push_back(iface);
  }
 public:
  void query(RecommendationResponse& _return, const RecommendationRequest& request) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->query(_return, request);
    }
    ifaces_[i]->query(_return, request);
    return;
  }

};

}} // namespace

#endif