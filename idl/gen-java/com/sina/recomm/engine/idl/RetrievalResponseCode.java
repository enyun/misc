/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sina.recomm.engine.idl;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum RetrievalResponseCode implements org.apache.thrift.TEnum {
  STATE_OK(0),
  STATE_ERROR(1),
  STATE_KEYWORD_NOT_FOUND(2);

  private final int value;

  private RetrievalResponseCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static RetrievalResponseCode findByValue(int value) { 
    switch (value) {
      case 0:
        return STATE_OK;
      case 1:
        return STATE_ERROR;
      case 2:
        return STATE_KEYWORD_NOT_FOUND;
      default:
        return null;
    }
  }
}
