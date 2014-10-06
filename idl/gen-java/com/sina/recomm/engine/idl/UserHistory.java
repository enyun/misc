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

public class UserHistory implements org.apache.thrift.TBase<UserHistory, UserHistory._Fields>, java.io.Serializable, Cloneable, Comparable<UserHistory> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserHistory");

  private static final org.apache.thrift.protocol.TField HISTORY_ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("history_items", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserHistoryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserHistoryTupleSchemeFactory());
  }

  public List<UserHistoryItem> history_items; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HISTORY_ITEMS((short)1, "history_items");

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
        case 1: // HISTORY_ITEMS
          return HISTORY_ITEMS;
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
    tmpMap.put(_Fields.HISTORY_ITEMS, new org.apache.thrift.meta_data.FieldMetaData("history_items", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, UserHistoryItem.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserHistory.class, metaDataMap);
  }

  public UserHistory() {
  }

  public UserHistory(
    List<UserHistoryItem> history_items)
  {
    this();
    this.history_items = history_items;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserHistory(UserHistory other) {
    if (other.isSetHistory_items()) {
      List<UserHistoryItem> __this__history_items = new ArrayList<UserHistoryItem>(other.history_items.size());
      for (UserHistoryItem other_element : other.history_items) {
        __this__history_items.add(new UserHistoryItem(other_element));
      }
      this.history_items = __this__history_items;
    }
  }

  public UserHistory deepCopy() {
    return new UserHistory(this);
  }

  @Override
  public void clear() {
    this.history_items = null;
  }

  public int getHistory_itemsSize() {
    return (this.history_items == null) ? 0 : this.history_items.size();
  }

  public java.util.Iterator<UserHistoryItem> getHistory_itemsIterator() {
    return (this.history_items == null) ? null : this.history_items.iterator();
  }

  public void addToHistory_items(UserHistoryItem elem) {
    if (this.history_items == null) {
      this.history_items = new ArrayList<UserHistoryItem>();
    }
    this.history_items.add(elem);
  }

  public List<UserHistoryItem> getHistory_items() {
    return this.history_items;
  }

  public UserHistory setHistory_items(List<UserHistoryItem> history_items) {
    this.history_items = history_items;
    return this;
  }

  public void unsetHistory_items() {
    this.history_items = null;
  }

  /** Returns true if field history_items is set (has been assigned a value) and false otherwise */
  public boolean isSetHistory_items() {
    return this.history_items != null;
  }

  public void setHistory_itemsIsSet(boolean value) {
    if (!value) {
      this.history_items = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HISTORY_ITEMS:
      if (value == null) {
        unsetHistory_items();
      } else {
        setHistory_items((List<UserHistoryItem>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HISTORY_ITEMS:
      return getHistory_items();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HISTORY_ITEMS:
      return isSetHistory_items();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserHistory)
      return this.equals((UserHistory)that);
    return false;
  }

  public boolean equals(UserHistory that) {
    if (that == null)
      return false;

    boolean this_present_history_items = true && this.isSetHistory_items();
    boolean that_present_history_items = true && that.isSetHistory_items();
    if (this_present_history_items || that_present_history_items) {
      if (!(this_present_history_items && that_present_history_items))
        return false;
      if (!this.history_items.equals(that.history_items))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(UserHistory other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHistory_items()).compareTo(other.isSetHistory_items());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHistory_items()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.history_items, other.history_items);
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
    StringBuilder sb = new StringBuilder("UserHistory(");
    boolean first = true;

    sb.append("history_items:");
    if (this.history_items == null) {
      sb.append("null");
    } else {
      sb.append(this.history_items);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserHistoryStandardSchemeFactory implements SchemeFactory {
    public UserHistoryStandardScheme getScheme() {
      return new UserHistoryStandardScheme();
    }
  }

  private static class UserHistoryStandardScheme extends StandardScheme<UserHistory> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserHistory struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HISTORY_ITEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list52 = iprot.readListBegin();
                struct.history_items = new ArrayList<UserHistoryItem>(_list52.size);
                for (int _i53 = 0; _i53 < _list52.size; ++_i53)
                {
                  UserHistoryItem _elem54;
                  _elem54 = new UserHistoryItem();
                  _elem54.read(iprot);
                  struct.history_items.add(_elem54);
                }
                iprot.readListEnd();
              }
              struct.setHistory_itemsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserHistory struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.history_items != null) {
        oprot.writeFieldBegin(HISTORY_ITEMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.history_items.size()));
          for (UserHistoryItem _iter55 : struct.history_items)
          {
            _iter55.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserHistoryTupleSchemeFactory implements SchemeFactory {
    public UserHistoryTupleScheme getScheme() {
      return new UserHistoryTupleScheme();
    }
  }

  private static class UserHistoryTupleScheme extends TupleScheme<UserHistory> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserHistory struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHistory_items()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetHistory_items()) {
        {
          oprot.writeI32(struct.history_items.size());
          for (UserHistoryItem _iter56 : struct.history_items)
          {
            _iter56.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserHistory struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list57 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.history_items = new ArrayList<UserHistoryItem>(_list57.size);
          for (int _i58 = 0; _i58 < _list57.size; ++_i58)
          {
            UserHistoryItem _elem59;
            _elem59 = new UserHistoryItem();
            _elem59.read(iprot);
            struct.history_items.add(_elem59);
          }
        }
        struct.setHistory_itemsIsSet(true);
      }
    }
  }

}
