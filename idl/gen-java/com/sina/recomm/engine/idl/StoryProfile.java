/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sina.recomm.engine.idl;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StoryProfile implements org.apache.thrift.TBase<StoryProfile, StoryProfile._Fields>, java.io.Serializable, Cloneable, Comparable<StoryProfile> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StoryProfile");

  private static final org.apache.thrift.protocol.TField STORY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("story_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField KEYWORDS_FIELD_DESC = new org.apache.thrift.protocol.TField("keywords", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField TOPICS_FIELD_DESC = new org.apache.thrift.protocol.TField("topics", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField SIGNATURE_FIELD_DESC = new org.apache.thrift.protocol.TField("signature", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StoryProfileStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StoryProfileTupleSchemeFactory());
  }

  public String story_id; // required
  public Map<Long,Integer> keywords; // required
  public List<Integer> topics; // optional
  public long signature; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STORY_ID((short)1, "story_id"),
    KEYWORDS((short)2, "keywords"),
    TOPICS((short)3, "topics"),
    SIGNATURE((short)4, "signature");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STORY_ID
          return STORY_ID;
        case 2: // KEYWORDS
          return KEYWORDS;
        case 3: // TOPICS
          return TOPICS;
        case 4: // SIGNATURE
          return SIGNATURE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SIGNATURE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.TOPICS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STORY_ID, new org.apache.thrift.meta_data.FieldMetaData("story_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEYWORDS, new org.apache.thrift.meta_data.FieldMetaData("keywords", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.TOPICS, new org.apache.thrift.meta_data.FieldMetaData("topics", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.SIGNATURE, new org.apache.thrift.meta_data.FieldMetaData("signature", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StoryProfile.class, metaDataMap);
  }

  public StoryProfile() {
  }

  public StoryProfile(
    String story_id,
    Map<Long,Integer> keywords,
    long signature)
  {
    this();
    this.story_id = story_id;
    this.keywords = keywords;
    this.signature = signature;
    setSignatureIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StoryProfile(StoryProfile other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStory_id()) {
      this.story_id = other.story_id;
    }
    if (other.isSetKeywords()) {
      Map<Long,Integer> __this__keywords = new HashMap<Long,Integer>(other.keywords);
      this.keywords = __this__keywords;
    }
    if (other.isSetTopics()) {
      List<Integer> __this__topics = new ArrayList<Integer>(other.topics);
      this.topics = __this__topics;
    }
    this.signature = other.signature;
  }

  public StoryProfile deepCopy() {
    return new StoryProfile(this);
  }

  @Override
  public void clear() {
    this.story_id = null;
    this.keywords = null;
    this.topics = null;
    setSignatureIsSet(false);
    this.signature = 0;
  }

  public String getStory_id() {
    return this.story_id;
  }

  public StoryProfile setStory_id(String story_id) {
    this.story_id = story_id;
    return this;
  }

  public void unsetStory_id() {
    this.story_id = null;
  }

  /** Returns true if field story_id is set (has been assigned a value) and false otherwise */
  public boolean isSetStory_id() {
    return this.story_id != null;
  }

  public void setStory_idIsSet(boolean value) {
    if (!value) {
      this.story_id = null;
    }
  }

  public int getKeywordsSize() {
    return (this.keywords == null) ? 0 : this.keywords.size();
  }

  public void putToKeywords(long key, int val) {
    if (this.keywords == null) {
      this.keywords = new HashMap<Long,Integer>();
    }
    this.keywords.put(key, val);
  }

  public Map<Long,Integer> getKeywords() {
    return this.keywords;
  }

  public StoryProfile setKeywords(Map<Long,Integer> keywords) {
    this.keywords = keywords;
    return this;
  }

  public void unsetKeywords() {
    this.keywords = null;
  }

  /** Returns true if field keywords is set (has been assigned a value) and false otherwise */
  public boolean isSetKeywords() {
    return this.keywords != null;
  }

  public void setKeywordsIsSet(boolean value) {
    if (!value) {
      this.keywords = null;
    }
  }

  public int getTopicsSize() {
    return (this.topics == null) ? 0 : this.topics.size();
  }

  public java.util.Iterator<Integer> getTopicsIterator() {
    return (this.topics == null) ? null : this.topics.iterator();
  }

  public void addToTopics(int elem) {
    if (this.topics == null) {
      this.topics = new ArrayList<Integer>();
    }
    this.topics.add(elem);
  }

  public List<Integer> getTopics() {
    return this.topics;
  }

  public StoryProfile setTopics(List<Integer> topics) {
    this.topics = topics;
    return this;
  }

  public void unsetTopics() {
    this.topics = null;
  }

  /** Returns true if field topics is set (has been assigned a value) and false otherwise */
  public boolean isSetTopics() {
    return this.topics != null;
  }

  public void setTopicsIsSet(boolean value) {
    if (!value) {
      this.topics = null;
    }
  }

  public long getSignature() {
    return this.signature;
  }

  public StoryProfile setSignature(long signature) {
    this.signature = signature;
    setSignatureIsSet(true);
    return this;
  }

  public void unsetSignature() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SIGNATURE_ISSET_ID);
  }

  /** Returns true if field signature is set (has been assigned a value) and false otherwise */
  public boolean isSetSignature() {
    return EncodingUtils.testBit(__isset_bitfield, __SIGNATURE_ISSET_ID);
  }

  public void setSignatureIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SIGNATURE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STORY_ID:
      if (value == null) {
        unsetStory_id();
      } else {
        setStory_id((String)value);
      }
      break;

    case KEYWORDS:
      if (value == null) {
        unsetKeywords();
      } else {
        setKeywords((Map<Long,Integer>)value);
      }
      break;

    case TOPICS:
      if (value == null) {
        unsetTopics();
      } else {
        setTopics((List<Integer>)value);
      }
      break;

    case SIGNATURE:
      if (value == null) {
        unsetSignature();
      } else {
        setSignature((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STORY_ID:
      return getStory_id();

    case KEYWORDS:
      return getKeywords();

    case TOPICS:
      return getTopics();

    case SIGNATURE:
      return Long.valueOf(getSignature());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STORY_ID:
      return isSetStory_id();
    case KEYWORDS:
      return isSetKeywords();
    case TOPICS:
      return isSetTopics();
    case SIGNATURE:
      return isSetSignature();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StoryProfile)
      return this.equals((StoryProfile)that);
    return false;
  }

  public boolean equals(StoryProfile that) {
    if (that == null)
      return false;

    boolean this_present_story_id = true && this.isSetStory_id();
    boolean that_present_story_id = true && that.isSetStory_id();
    if (this_present_story_id || that_present_story_id) {
      if (!(this_present_story_id && that_present_story_id))
        return false;
      if (!this.story_id.equals(that.story_id))
        return false;
    }

    boolean this_present_keywords = true && this.isSetKeywords();
    boolean that_present_keywords = true && that.isSetKeywords();
    if (this_present_keywords || that_present_keywords) {
      if (!(this_present_keywords && that_present_keywords))
        return false;
      if (!this.keywords.equals(that.keywords))
        return false;
    }

    boolean this_present_topics = true && this.isSetTopics();
    boolean that_present_topics = true && that.isSetTopics();
    if (this_present_topics || that_present_topics) {
      if (!(this_present_topics && that_present_topics))
        return false;
      if (!this.topics.equals(that.topics))
        return false;
    }

    boolean this_present_signature = true;
    boolean that_present_signature = true;
    if (this_present_signature || that_present_signature) {
      if (!(this_present_signature && that_present_signature))
        return false;
      if (this.signature != that.signature)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(StoryProfile other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStory_id()).compareTo(other.isSetStory_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStory_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.story_id, other.story_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKeywords()).compareTo(other.isSetKeywords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeywords()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keywords, other.keywords);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopics()).compareTo(other.isSetTopics());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopics()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topics, other.topics);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSignature()).compareTo(other.isSetSignature());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSignature()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.signature, other.signature);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("StoryProfile(");
    boolean first = true;

    sb.append("story_id:");
    if (this.story_id == null) {
      sb.append("null");
    } else {
      sb.append(this.story_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("keywords:");
    if (this.keywords == null) {
      sb.append("null");
    } else {
      sb.append(this.keywords);
    }
    first = false;
    if (isSetTopics()) {
      if (!first) sb.append(", ");
      sb.append("topics:");
      if (this.topics == null) {
        sb.append("null");
      } else {
        sb.append(this.topics);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("signature:");
    sb.append(this.signature);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (story_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'story_id' was not present! Struct: " + toString());
    }
    if (keywords == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'keywords' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'signature' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StoryProfileStandardSchemeFactory implements SchemeFactory {
    public StoryProfileStandardScheme getScheme() {
      return new StoryProfileStandardScheme();
    }
  }

  private static class StoryProfileStandardScheme extends StandardScheme<StoryProfile> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StoryProfile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STORY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.story_id = iprot.readString();
              struct.setStory_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KEYWORDS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.keywords = new HashMap<Long,Integer>(2*_map8.size);
                for (int _i9 = 0; _i9 < _map8.size; ++_i9)
                {
                  long _key10;
                  int _val11;
                  _key10 = iprot.readI64();
                  _val11 = iprot.readI32();
                  struct.keywords.put(_key10, _val11);
                }
                iprot.readMapEnd();
              }
              struct.setKeywordsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOPICS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list12 = iprot.readListBegin();
                struct.topics = new ArrayList<Integer>(_list12.size);
                for (int _i13 = 0; _i13 < _list12.size; ++_i13)
                {
                  int _elem14;
                  _elem14 = iprot.readI32();
                  struct.topics.add(_elem14);
                }
                iprot.readListEnd();
              }
              struct.setTopicsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SIGNATURE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.signature = iprot.readI64();
              struct.setSignatureIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetSignature()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'signature' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StoryProfile struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.story_id != null) {
        oprot.writeFieldBegin(STORY_ID_FIELD_DESC);
        oprot.writeString(struct.story_id);
        oprot.writeFieldEnd();
      }
      if (struct.keywords != null) {
        oprot.writeFieldBegin(KEYWORDS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.I32, struct.keywords.size()));
          for (Map.Entry<Long, Integer> _iter15 : struct.keywords.entrySet())
          {
            oprot.writeI64(_iter15.getKey());
            oprot.writeI32(_iter15.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.topics != null) {
        if (struct.isSetTopics()) {
          oprot.writeFieldBegin(TOPICS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.topics.size()));
            for (int _iter16 : struct.topics)
            {
              oprot.writeI32(_iter16);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(SIGNATURE_FIELD_DESC);
      oprot.writeI64(struct.signature);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StoryProfileTupleSchemeFactory implements SchemeFactory {
    public StoryProfileTupleScheme getScheme() {
      return new StoryProfileTupleScheme();
    }
  }

  private static class StoryProfileTupleScheme extends TupleScheme<StoryProfile> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StoryProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.story_id);
      {
        oprot.writeI32(struct.keywords.size());
        for (Map.Entry<Long, Integer> _iter17 : struct.keywords.entrySet())
        {
          oprot.writeI64(_iter17.getKey());
          oprot.writeI32(_iter17.getValue());
        }
      }
      oprot.writeI64(struct.signature);
      BitSet optionals = new BitSet();
      if (struct.isSetTopics()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTopics()) {
        {
          oprot.writeI32(struct.topics.size());
          for (int _iter18 : struct.topics)
          {
            oprot.writeI32(_iter18);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StoryProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.story_id = iprot.readString();
      struct.setStory_idIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map19 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.keywords = new HashMap<Long,Integer>(2*_map19.size);
        for (int _i20 = 0; _i20 < _map19.size; ++_i20)
        {
          long _key21;
          int _val22;
          _key21 = iprot.readI64();
          _val22 = iprot.readI32();
          struct.keywords.put(_key21, _val22);
        }
      }
      struct.setKeywordsIsSet(true);
      struct.signature = iprot.readI64();
      struct.setSignatureIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.topics = new ArrayList<Integer>(_list23.size);
          for (int _i24 = 0; _i24 < _list23.size; ++_i24)
          {
            int _elem25;
            _elem25 = iprot.readI32();
            struct.topics.add(_elem25);
          }
        }
        struct.setTopicsIsSet(true);
      }
    }
  }

}

