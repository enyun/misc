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

public class StoryAddingRequest implements org.apache.thrift.TBase<StoryAddingRequest, StoryAddingRequest._Fields>, java.io.Serializable, Cloneable, Comparable<StoryAddingRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StoryAddingRequest");

  private static final org.apache.thrift.protocol.TField STORY_FIELD_DESC = new org.apache.thrift.protocol.TField("story", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StoryAddingRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StoryAddingRequestTupleSchemeFactory());
  }

  public StoryProfile story; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STORY((short)1, "story");

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
        case 1: // STORY
          return STORY;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STORY, new org.apache.thrift.meta_data.FieldMetaData("story", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StoryProfile.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StoryAddingRequest.class, metaDataMap);
  }

  public StoryAddingRequest() {
  }

  public StoryAddingRequest(
    StoryProfile story)
  {
    this();
    this.story = story;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StoryAddingRequest(StoryAddingRequest other) {
    if (other.isSetStory()) {
      this.story = new StoryProfile(other.story);
    }
  }

  public StoryAddingRequest deepCopy() {
    return new StoryAddingRequest(this);
  }

  @Override
  public void clear() {
    this.story = null;
  }

  public StoryProfile getStory() {
    return this.story;
  }

  public StoryAddingRequest setStory(StoryProfile story) {
    this.story = story;
    return this;
  }

  public void unsetStory() {
    this.story = null;
  }

  /** Returns true if field story is set (has been assigned a value) and false otherwise */
  public boolean isSetStory() {
    return this.story != null;
  }

  public void setStoryIsSet(boolean value) {
    if (!value) {
      this.story = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STORY:
      if (value == null) {
        unsetStory();
      } else {
        setStory((StoryProfile)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STORY:
      return getStory();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STORY:
      return isSetStory();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StoryAddingRequest)
      return this.equals((StoryAddingRequest)that);
    return false;
  }

  public boolean equals(StoryAddingRequest that) {
    if (that == null)
      return false;

    boolean this_present_story = true && this.isSetStory();
    boolean that_present_story = true && that.isSetStory();
    if (this_present_story || that_present_story) {
      if (!(this_present_story && that_present_story))
        return false;
      if (!this.story.equals(that.story))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(StoryAddingRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStory()).compareTo(other.isSetStory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.story, other.story);
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
    StringBuilder sb = new StringBuilder("StoryAddingRequest(");
    boolean first = true;

    sb.append("story:");
    if (this.story == null) {
      sb.append("null");
    } else {
      sb.append(this.story);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (story == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'story' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (story != null) {
      story.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StoryAddingRequestStandardSchemeFactory implements SchemeFactory {
    public StoryAddingRequestStandardScheme getScheme() {
      return new StoryAddingRequestStandardScheme();
    }
  }

  private static class StoryAddingRequestStandardScheme extends StandardScheme<StoryAddingRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StoryAddingRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.story = new StoryProfile();
              struct.story.read(iprot);
              struct.setStoryIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StoryAddingRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.story != null) {
        oprot.writeFieldBegin(STORY_FIELD_DESC);
        struct.story.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StoryAddingRequestTupleSchemeFactory implements SchemeFactory {
    public StoryAddingRequestTupleScheme getScheme() {
      return new StoryAddingRequestTupleScheme();
    }
  }

  private static class StoryAddingRequestTupleScheme extends TupleScheme<StoryAddingRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StoryAddingRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.story.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StoryAddingRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.story = new StoryProfile();
      struct.story.read(iprot);
      struct.setStoryIsSet(true);
    }
  }

}

