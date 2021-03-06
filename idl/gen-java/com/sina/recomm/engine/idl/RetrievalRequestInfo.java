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

public class RetrievalRequestInfo implements org.apache.thrift.TBase<RetrievalRequestInfo, RetrievalRequestInfo._Fields>, java.io.Serializable, Cloneable, Comparable<RetrievalRequestInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RetrievalRequestInfo");

  private static final org.apache.thrift.protocol.TField KEYWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("keyword", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("weight", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RetrievalRequestInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RetrievalRequestInfoTupleSchemeFactory());
  }

  public long keyword; // required
  public int weight; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEYWORD((short)1, "keyword"),
    WEIGHT((short)2, "weight");

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
        case 1: // KEYWORD
          return KEYWORD;
        case 2: // WEIGHT
          return WEIGHT;
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
  private static final int __KEYWORD_ISSET_ID = 0;
  private static final int __WEIGHT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.WEIGHT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEYWORD, new org.apache.thrift.meta_data.FieldMetaData("keyword", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("weight", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RetrievalRequestInfo.class, metaDataMap);
  }

  public RetrievalRequestInfo() {
    this.weight = 0;

  }

  public RetrievalRequestInfo(
    long keyword)
  {
    this();
    this.keyword = keyword;
    setKeywordIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RetrievalRequestInfo(RetrievalRequestInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.keyword = other.keyword;
    this.weight = other.weight;
  }

  public RetrievalRequestInfo deepCopy() {
    return new RetrievalRequestInfo(this);
  }

  @Override
  public void clear() {
    setKeywordIsSet(false);
    this.keyword = 0;
    this.weight = 0;

  }

  public long getKeyword() {
    return this.keyword;
  }

  public RetrievalRequestInfo setKeyword(long keyword) {
    this.keyword = keyword;
    setKeywordIsSet(true);
    return this;
  }

  public void unsetKeyword() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __KEYWORD_ISSET_ID);
  }

  /** Returns true if field keyword is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyword() {
    return EncodingUtils.testBit(__isset_bitfield, __KEYWORD_ISSET_ID);
  }

  public void setKeywordIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __KEYWORD_ISSET_ID, value);
  }

  public int getWeight() {
    return this.weight;
  }

  public RetrievalRequestInfo setWeight(int weight) {
    this.weight = weight;
    setWeightIsSet(true);
    return this;
  }

  public void unsetWeight() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  /** Returns true if field weight is set (has been assigned a value) and false otherwise */
  public boolean isSetWeight() {
    return EncodingUtils.testBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  public void setWeightIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WEIGHT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEYWORD:
      if (value == null) {
        unsetKeyword();
      } else {
        setKeyword((Long)value);
      }
      break;

    case WEIGHT:
      if (value == null) {
        unsetWeight();
      } else {
        setWeight((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEYWORD:
      return Long.valueOf(getKeyword());

    case WEIGHT:
      return Integer.valueOf(getWeight());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEYWORD:
      return isSetKeyword();
    case WEIGHT:
      return isSetWeight();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RetrievalRequestInfo)
      return this.equals((RetrievalRequestInfo)that);
    return false;
  }

  public boolean equals(RetrievalRequestInfo that) {
    if (that == null)
      return false;

    boolean this_present_keyword = true;
    boolean that_present_keyword = true;
    if (this_present_keyword || that_present_keyword) {
      if (!(this_present_keyword && that_present_keyword))
        return false;
      if (this.keyword != that.keyword)
        return false;
    }

    boolean this_present_weight = true && this.isSetWeight();
    boolean that_present_weight = true && that.isSetWeight();
    if (this_present_weight || that_present_weight) {
      if (!(this_present_weight && that_present_weight))
        return false;
      if (this.weight != that.weight)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(RetrievalRequestInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetKeyword()).compareTo(other.isSetKeyword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyword, other.keyword);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWeight()).compareTo(other.isSetWeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.weight, other.weight);
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
    StringBuilder sb = new StringBuilder("RetrievalRequestInfo(");
    boolean first = true;

    sb.append("keyword:");
    sb.append(this.keyword);
    first = false;
    if (isSetWeight()) {
      if (!first) sb.append(", ");
      sb.append("weight:");
      sb.append(this.weight);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'keyword' because it's a primitive and you chose the non-beans generator.
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

  private static class RetrievalRequestInfoStandardSchemeFactory implements SchemeFactory {
    public RetrievalRequestInfoStandardScheme getScheme() {
      return new RetrievalRequestInfoStandardScheme();
    }
  }

  private static class RetrievalRequestInfoStandardScheme extends StandardScheme<RetrievalRequestInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RetrievalRequestInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEYWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.keyword = iprot.readI64();
              struct.setKeywordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.weight = iprot.readI32();
              struct.setWeightIsSet(true);
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
      if (!struct.isSetKeyword()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'keyword' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RetrievalRequestInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(KEYWORD_FIELD_DESC);
      oprot.writeI64(struct.keyword);
      oprot.writeFieldEnd();
      if (struct.isSetWeight()) {
        oprot.writeFieldBegin(WEIGHT_FIELD_DESC);
        oprot.writeI32(struct.weight);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RetrievalRequestInfoTupleSchemeFactory implements SchemeFactory {
    public RetrievalRequestInfoTupleScheme getScheme() {
      return new RetrievalRequestInfoTupleScheme();
    }
  }

  private static class RetrievalRequestInfoTupleScheme extends TupleScheme<RetrievalRequestInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RetrievalRequestInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.keyword);
      BitSet optionals = new BitSet();
      if (struct.isSetWeight()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetWeight()) {
        oprot.writeI32(struct.weight);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RetrievalRequestInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.keyword = iprot.readI64();
      struct.setKeywordIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.weight = iprot.readI32();
        struct.setWeightIsSet(true);
      }
    }
  }

}

