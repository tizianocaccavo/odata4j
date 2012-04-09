package org.odata4j.test.integration.expressions;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.odata4j.core.Guid;
import org.odata4j.core.UnsignedByte;

public class PojoWithAllTypes {

  private final byte[] binary;
  private final boolean boolean_;
  private final UnsignedByte byte_;
  private final byte sbyte;
  private final LocalDateTime dateTime;
  private final BigDecimal decimal;
  private final double double_;
  private final Guid guid;
  private final short int16;
  private final int int32;
  private final long int64;
  private final float single;
  private final String string;
  private final LocalTime time;
  private final DateTime dateTimeOffset;
  
  public PojoWithAllTypes(byte[] binary, boolean boolean_, UnsignedByte byte_, byte sbyte, LocalDateTime dateTime, BigDecimal decimal,
      double double_, Guid guid, short int16, int int32, long int64, float single, String string, LocalTime time, DateTime dateTimeOffset) {
    this.binary = binary;
    this.boolean_ = boolean_;
    this.byte_ = byte_;
    this.sbyte = sbyte;
    this.dateTime = dateTime;
    this.decimal = decimal;
    this.double_ = double_;
    this.guid = guid;
    this.int16 = int16;
    this.int32 = int32;
    this.int64 = int64;
    this.single = single;
    this.time = time;
    this.string = string;
    this.dateTimeOffset = dateTimeOffset;
  }

  public byte[] getBinary() {
    return binary;
  }

  public boolean getBoolean() {
    return boolean_;
  }

  public UnsignedByte getByte() {
    return byte_;
  }

  public byte getSByte() {
    return sbyte;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public BigDecimal getDecimal() {
    return decimal;
  }

  public double getDouble() {
    return double_;
  }

  public Guid getGuid() {
    return guid;
  }

  public short getInt16() {
    return int16;
  }

  public int getInt32() {
    return int32;
  }

  public long getInt64() {
    return int64;
  }

  public float getSingle() {
    return single;
  }

  public String getString() {
    return string;
  }

  public LocalTime getTime() {
    return time;
  }

  public DateTime getDateTimeOffset() {
    return dateTimeOffset;
  }

  
}