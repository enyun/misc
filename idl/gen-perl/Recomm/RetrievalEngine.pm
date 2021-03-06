#
# Autogenerated by Thrift Compiler (0.9.1)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
require 5.6.0;
use strict;
use warnings;
use Thrift;

use Recomm::Types;

# HELPER FUNCTIONS AND STRUCTURES

package Recomm::RetrievalEngine_search_args;
use base qw(Class::Accessor);
Recomm::RetrievalEngine_search_args->mk_accessors( qw( request ) );

sub new {
      my $classname = shift;
      my $self      = {};
      my $vals      = shift || {};
      $self->{request} = undef;
      if (UNIVERSAL::isa($vals,'HASH')) {
        if (defined $vals->{request}) {
          $self->{request} = $vals->{request};
        }
      }
      return bless ($self, $classname);
}

sub getName {
      return 'RetrievalEngine_search_args';
    }

sub read {
      my ($self, $input) = @_;
      my $xfer  = 0;
      my $fname;
      my $ftype = 0;
      my $fid   = 0;
      $xfer += $input->readStructBegin(\$fname);
      while (1) 
      {
        $xfer += $input->readFieldBegin(\$fname, \$ftype, \$fid);
        if ($ftype == TType::STOP) {
          last;
        }
        SWITCH: for($fid)
        {
          /^1$/ && do{          if ($ftype == TType::STRUCT) {
            $self->{request} = new Recomm::RetrievalRequest();
            $xfer += $self->{request}->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
            $xfer += $input->skip($ftype);
        }
        $xfer += $input->readFieldEnd();
      }
      $xfer += $input->readStructEnd();
      return $xfer;
    }

sub write {
      my ($self, $output) = @_;
      my $xfer   = 0;
      $xfer += $output->writeStructBegin('RetrievalEngine_search_args');
      if (defined $self->{request}) {
        $xfer += $output->writeFieldBegin('request', TType::STRUCT, 1);
        $xfer += $self->{request}->write($output);
        $xfer += $output->writeFieldEnd();
      }
      $xfer += $output->writeFieldStop();
      $xfer += $output->writeStructEnd();
      return $xfer;
    }

package Recomm::RetrievalEngine_search_result;
use base qw(Class::Accessor);
Recomm::RetrievalEngine_search_result->mk_accessors( qw( success ) );

sub new {
      my $classname = shift;
      my $self      = {};
      my $vals      = shift || {};
      $self->{success} = undef;
      if (UNIVERSAL::isa($vals,'HASH')) {
        if (defined $vals->{success}) {
          $self->{success} = $vals->{success};
        }
      }
      return bless ($self, $classname);
}

sub getName {
      return 'RetrievalEngine_search_result';
    }

sub read {
      my ($self, $input) = @_;
      my $xfer  = 0;
      my $fname;
      my $ftype = 0;
      my $fid   = 0;
      $xfer += $input->readStructBegin(\$fname);
      while (1) 
      {
        $xfer += $input->readFieldBegin(\$fname, \$ftype, \$fid);
        if ($ftype == TType::STOP) {
          last;
        }
        SWITCH: for($fid)
        {
          /^0$/ && do{          if ($ftype == TType::STRUCT) {
            $self->{success} = new Recomm::RetrievalResponse();
            $xfer += $self->{success}->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          last; };
            $xfer += $input->skip($ftype);
        }
        $xfer += $input->readFieldEnd();
      }
      $xfer += $input->readStructEnd();
      return $xfer;
    }

sub write {
      my ($self, $output) = @_;
      my $xfer   = 0;
      $xfer += $output->writeStructBegin('RetrievalEngine_search_result');
      if (defined $self->{success}) {
        $xfer += $output->writeFieldBegin('success', TType::STRUCT, 0);
        $xfer += $self->{success}->write($output);
        $xfer += $output->writeFieldEnd();
      }
      $xfer += $output->writeFieldStop();
      $xfer += $output->writeStructEnd();
      return $xfer;
    }

package Recomm::RetrievalEngineIf;

use strict;


sub search{
  my $self = shift;
  my $request = shift;

  die 'implement interface';
}

package Recomm::RetrievalEngineRest;

use strict;


sub new {
      my ($classname, $impl) = @_;
      my $self     ={ impl => $impl };

      return bless($self,$classname);
}

sub search{
      my ($self, $request) = @_;

      my $request = ($request->{'request'}) ? $request->{'request'} : undef;
      return $self->{impl}->search($request);
    }

package Recomm::RetrievalEngineClient;


use base qw(Recomm::RetrievalEngineIf);
sub new {
      my ($classname, $input, $output) = @_;
      my $self      = {};
      $self->{input}  = $input;
      $self->{output} = defined $output ? $output : $input;
      $self->{seqid}  = 0;
      return bless($self,$classname);
}

sub search{
  my $self = shift;
  my $request = shift;

            $self->send_search($request);
      return $self->recv_search();
}

sub send_search{
  my $self = shift;
  my $request = shift;

      $self->{output}->writeMessageBegin('search', TMessageType::CALL, $self->{seqid});
      my $args = new Recomm::RetrievalEngine_search_args();
      $args->{request} = $request;
      $args->write($self->{output});
      $self->{output}->writeMessageEnd();
      $self->{output}->getTransport()->flush();
}

sub recv_search{
  my $self = shift;

      my $rseqid = 0;
      my $fname;
      my $mtype = 0;

      $self->{input}->readMessageBegin(\$fname, \$mtype, \$rseqid);
      if ($mtype == TMessageType::EXCEPTION) {
        my $x = new TApplicationException();
        $x->read($self->{input});
        $self->{input}->readMessageEnd();
        die $x;
      }
      my $result = new Recomm::RetrievalEngine_search_result();
      $result->read($self->{input});
      $self->{input}->readMessageEnd();

      if (defined $result->{success} ) {
        return $result->{success};
      }
      die "search failed: unknown result";
}
package Recomm::RetrievalEngineProcessor;

use strict;


sub new {
        my ($classname, $handler) = @_;
        my $self      = {};
        $self->{handler} = $handler;
        return bless ($self, $classname);
}

sub process {
        my ($self, $input, $output) = @_;
        my $rseqid = 0;
        my $fname  = undef;
        my $mtype  = 0;

        $input->readMessageBegin(\$fname, \$mtype, \$rseqid);
        my $methodname = 'process_'.$fname;
        if (!$self->can($methodname)) {
          $input->skip(TType::STRUCT);
          $input->readMessageEnd();
          my $x = new TApplicationException('Function '.$fname.' not implemented.', TApplicationException::UNKNOWN_METHOD);
          $output->writeMessageBegin($fname, TMessageType::EXCEPTION, $rseqid);
          $x->write($output);
          $output->writeMessageEnd();
          $output->getTransport()->flush();
          return;
        }
        $self->$methodname($rseqid, $input, $output);
        return 1;
}

sub process_search {
        my ($self, $seqid, $input, $output) = @_;
        my $args = new Recomm::RetrievalEngine_search_args();
        $args->read($input);
        $input->readMessageEnd();
        my $result = new Recomm::RetrievalEngine_search_result();
        $result->{success} = $self->{handler}->search($args->request);
        $output->writeMessageBegin('search', TMessageType::REPLY, $seqid);
        $result->write($output);
        $output->writeMessageEnd();
        $output->getTransport()->flush();
}

1;
