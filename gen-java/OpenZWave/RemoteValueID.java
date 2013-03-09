/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package OpenZWave;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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

public class RemoteValueID implements org.apache.thrift.TBase<RemoteValueID, RemoteValueID._Fields>, java.io.Serializable, Cloneable, Comparable<RemoteValueID> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RemoteValueID");

  private static final org.apache.thrift.protocol.TField _HOME_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("_homeId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField _NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("_nodeId", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField _GENRE_FIELD_DESC = new org.apache.thrift.protocol.TField("_genre", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField _COMMAND_CLASS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("_commandClassId", org.apache.thrift.protocol.TType.BYTE, (short)4);
  private static final org.apache.thrift.protocol.TField _INSTANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("_instance", org.apache.thrift.protocol.TType.BYTE, (short)5);
  private static final org.apache.thrift.protocol.TField _VALUE_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("_valueIndex", org.apache.thrift.protocol.TType.BYTE, (short)6);
  private static final org.apache.thrift.protocol.TField _TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("_type", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RemoteValueIDStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RemoteValueIDTupleSchemeFactory());
  }

  public int _homeId; // required
  public byte _nodeId; // required
  /**
   * 
   * @see RemoteValueGenre
   */
  public RemoteValueGenre _genre; // required
  public byte _commandClassId; // required
  public byte _instance; // required
  public byte _valueIndex; // required
  /**
   * 
   * @see RemoteValueType
   */
  public RemoteValueType _type; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    _HOME_ID((short)1, "_homeId"),
    _NODE_ID((short)2, "_nodeId"),
    /**
     * 
     * @see RemoteValueGenre
     */
    _GENRE((short)3, "_genre"),
    _COMMAND_CLASS_ID((short)4, "_commandClassId"),
    _INSTANCE((short)5, "_instance"),
    _VALUE_INDEX((short)6, "_valueIndex"),
    /**
     * 
     * @see RemoteValueType
     */
    _TYPE((short)7, "_type");

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
        case 1: // _HOME_ID
          return _HOME_ID;
        case 2: // _NODE_ID
          return _NODE_ID;
        case 3: // _GENRE
          return _GENRE;
        case 4: // _COMMAND_CLASS_ID
          return _COMMAND_CLASS_ID;
        case 5: // _INSTANCE
          return _INSTANCE;
        case 6: // _VALUE_INDEX
          return _VALUE_INDEX;
        case 7: // _TYPE
          return _TYPE;
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
  private static final int ___HOMEID_ISSET_ID = 0;
  private static final int ___NODEID_ISSET_ID = 1;
  private static final int ___COMMANDCLASSID_ISSET_ID = 2;
  private static final int ___INSTANCE_ISSET_ID = 3;
  private static final int ___VALUEINDEX_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields._HOME_ID, new org.apache.thrift.meta_data.FieldMetaData("_homeId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields._NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("_nodeId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields._GENRE, new org.apache.thrift.meta_data.FieldMetaData("_genre", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, RemoteValueGenre.class)));
    tmpMap.put(_Fields._COMMAND_CLASS_ID, new org.apache.thrift.meta_data.FieldMetaData("_commandClassId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields._INSTANCE, new org.apache.thrift.meta_data.FieldMetaData("_instance", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields._VALUE_INDEX, new org.apache.thrift.meta_data.FieldMetaData("_valueIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields._TYPE, new org.apache.thrift.meta_data.FieldMetaData("_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, RemoteValueType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RemoteValueID.class, metaDataMap);
  }

  public RemoteValueID() {
  }

  public RemoteValueID(
    int _homeId,
    byte _nodeId,
    RemoteValueGenre _genre,
    byte _commandClassId,
    byte _instance,
    byte _valueIndex,
    RemoteValueType _type)
  {
    this();
    this._homeId = _homeId;
    set_homeIdIsSet(true);
    this._nodeId = _nodeId;
    set_nodeIdIsSet(true);
    this._genre = _genre;
    this._commandClassId = _commandClassId;
    set_commandClassIdIsSet(true);
    this._instance = _instance;
    set_instanceIsSet(true);
    this._valueIndex = _valueIndex;
    set_valueIndexIsSet(true);
    this._type = _type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RemoteValueID(RemoteValueID other) {
    __isset_bitfield = other.__isset_bitfield;
    this._homeId = other._homeId;
    this._nodeId = other._nodeId;
    if (other.isSet_genre()) {
      this._genre = other._genre;
    }
    this._commandClassId = other._commandClassId;
    this._instance = other._instance;
    this._valueIndex = other._valueIndex;
    if (other.isSet_type()) {
      this._type = other._type;
    }
  }

  public RemoteValueID deepCopy() {
    return new RemoteValueID(this);
  }

  @Override
  public void clear() {
    set_homeIdIsSet(false);
    this._homeId = 0;
    set_nodeIdIsSet(false);
    this._nodeId = 0;
    this._genre = null;
    set_commandClassIdIsSet(false);
    this._commandClassId = 0;
    set_instanceIsSet(false);
    this._instance = 0;
    set_valueIndexIsSet(false);
    this._valueIndex = 0;
    this._type = null;
  }

  public int get_homeId() {
    return this._homeId;
  }

  public RemoteValueID set_homeId(int _homeId) {
    this._homeId = _homeId;
    set_homeIdIsSet(true);
    return this;
  }

  public void unset_homeId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, ___HOMEID_ISSET_ID);
  }

  /** Returns true if field _homeId is set (has been assigned a value) and false otherwise */
  public boolean isSet_homeId() {
    return EncodingUtils.testBit(__isset_bitfield, ___HOMEID_ISSET_ID);
  }

  public void set_homeIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, ___HOMEID_ISSET_ID, value);
  }

  public byte get_nodeId() {
    return this._nodeId;
  }

  public RemoteValueID set_nodeId(byte _nodeId) {
    this._nodeId = _nodeId;
    set_nodeIdIsSet(true);
    return this;
  }

  public void unset_nodeId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, ___NODEID_ISSET_ID);
  }

  /** Returns true if field _nodeId is set (has been assigned a value) and false otherwise */
  public boolean isSet_nodeId() {
    return EncodingUtils.testBit(__isset_bitfield, ___NODEID_ISSET_ID);
  }

  public void set_nodeIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, ___NODEID_ISSET_ID, value);
  }

  /**
   * 
   * @see RemoteValueGenre
   */
  public RemoteValueGenre get_genre() {
    return this._genre;
  }

  /**
   * 
   * @see RemoteValueGenre
   */
  public RemoteValueID set_genre(RemoteValueGenre _genre) {
    this._genre = _genre;
    return this;
  }

  public void unset_genre() {
    this._genre = null;
  }

  /** Returns true if field _genre is set (has been assigned a value) and false otherwise */
  public boolean isSet_genre() {
    return this._genre != null;
  }

  public void set_genreIsSet(boolean value) {
    if (!value) {
      this._genre = null;
    }
  }

  public byte get_commandClassId() {
    return this._commandClassId;
  }

  public RemoteValueID set_commandClassId(byte _commandClassId) {
    this._commandClassId = _commandClassId;
    set_commandClassIdIsSet(true);
    return this;
  }

  public void unset_commandClassId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, ___COMMANDCLASSID_ISSET_ID);
  }

  /** Returns true if field _commandClassId is set (has been assigned a value) and false otherwise */
  public boolean isSet_commandClassId() {
    return EncodingUtils.testBit(__isset_bitfield, ___COMMANDCLASSID_ISSET_ID);
  }

  public void set_commandClassIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, ___COMMANDCLASSID_ISSET_ID, value);
  }

  public byte get_instance() {
    return this._instance;
  }

  public RemoteValueID set_instance(byte _instance) {
    this._instance = _instance;
    set_instanceIsSet(true);
    return this;
  }

  public void unset_instance() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, ___INSTANCE_ISSET_ID);
  }

  /** Returns true if field _instance is set (has been assigned a value) and false otherwise */
  public boolean isSet_instance() {
    return EncodingUtils.testBit(__isset_bitfield, ___INSTANCE_ISSET_ID);
  }

  public void set_instanceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, ___INSTANCE_ISSET_ID, value);
  }

  public byte get_valueIndex() {
    return this._valueIndex;
  }

  public RemoteValueID set_valueIndex(byte _valueIndex) {
    this._valueIndex = _valueIndex;
    set_valueIndexIsSet(true);
    return this;
  }

  public void unset_valueIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, ___VALUEINDEX_ISSET_ID);
  }

  /** Returns true if field _valueIndex is set (has been assigned a value) and false otherwise */
  public boolean isSet_valueIndex() {
    return EncodingUtils.testBit(__isset_bitfield, ___VALUEINDEX_ISSET_ID);
  }

  public void set_valueIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, ___VALUEINDEX_ISSET_ID, value);
  }

  /**
   * 
   * @see RemoteValueType
   */
  public RemoteValueType get_type() {
    return this._type;
  }

  /**
   * 
   * @see RemoteValueType
   */
  public RemoteValueID set_type(RemoteValueType _type) {
    this._type = _type;
    return this;
  }

  public void unset_type() {
    this._type = null;
  }

  /** Returns true if field _type is set (has been assigned a value) and false otherwise */
  public boolean isSet_type() {
    return this._type != null;
  }

  public void set_typeIsSet(boolean value) {
    if (!value) {
      this._type = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case _HOME_ID:
      if (value == null) {
        unset_homeId();
      } else {
        set_homeId((Integer)value);
      }
      break;

    case _NODE_ID:
      if (value == null) {
        unset_nodeId();
      } else {
        set_nodeId((Byte)value);
      }
      break;

    case _GENRE:
      if (value == null) {
        unset_genre();
      } else {
        set_genre((RemoteValueGenre)value);
      }
      break;

    case _COMMAND_CLASS_ID:
      if (value == null) {
        unset_commandClassId();
      } else {
        set_commandClassId((Byte)value);
      }
      break;

    case _INSTANCE:
      if (value == null) {
        unset_instance();
      } else {
        set_instance((Byte)value);
      }
      break;

    case _VALUE_INDEX:
      if (value == null) {
        unset_valueIndex();
      } else {
        set_valueIndex((Byte)value);
      }
      break;

    case _TYPE:
      if (value == null) {
        unset_type();
      } else {
        set_type((RemoteValueType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case _HOME_ID:
      return Integer.valueOf(get_homeId());

    case _NODE_ID:
      return Byte.valueOf(get_nodeId());

    case _GENRE:
      return get_genre();

    case _COMMAND_CLASS_ID:
      return Byte.valueOf(get_commandClassId());

    case _INSTANCE:
      return Byte.valueOf(get_instance());

    case _VALUE_INDEX:
      return Byte.valueOf(get_valueIndex());

    case _TYPE:
      return get_type();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case _HOME_ID:
      return isSet_homeId();
    case _NODE_ID:
      return isSet_nodeId();
    case _GENRE:
      return isSet_genre();
    case _COMMAND_CLASS_ID:
      return isSet_commandClassId();
    case _INSTANCE:
      return isSet_instance();
    case _VALUE_INDEX:
      return isSet_valueIndex();
    case _TYPE:
      return isSet_type();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RemoteValueID)
      return this.equals((RemoteValueID)that);
    return false;
  }

  public boolean equals(RemoteValueID that) {
    if (that == null)
      return false;

    boolean this_present__homeId = true;
    boolean that_present__homeId = true;
    if (this_present__homeId || that_present__homeId) {
      if (!(this_present__homeId && that_present__homeId))
        return false;
      if (this._homeId != that._homeId)
        return false;
    }

    boolean this_present__nodeId = true;
    boolean that_present__nodeId = true;
    if (this_present__nodeId || that_present__nodeId) {
      if (!(this_present__nodeId && that_present__nodeId))
        return false;
      if (this._nodeId != that._nodeId)
        return false;
    }

    boolean this_present__genre = true && this.isSet_genre();
    boolean that_present__genre = true && that.isSet_genre();
    if (this_present__genre || that_present__genre) {
      if (!(this_present__genre && that_present__genre))
        return false;
      if (!this._genre.equals(that._genre))
        return false;
    }

    boolean this_present__commandClassId = true;
    boolean that_present__commandClassId = true;
    if (this_present__commandClassId || that_present__commandClassId) {
      if (!(this_present__commandClassId && that_present__commandClassId))
        return false;
      if (this._commandClassId != that._commandClassId)
        return false;
    }

    boolean this_present__instance = true;
    boolean that_present__instance = true;
    if (this_present__instance || that_present__instance) {
      if (!(this_present__instance && that_present__instance))
        return false;
      if (this._instance != that._instance)
        return false;
    }

    boolean this_present__valueIndex = true;
    boolean that_present__valueIndex = true;
    if (this_present__valueIndex || that_present__valueIndex) {
      if (!(this_present__valueIndex && that_present__valueIndex))
        return false;
      if (this._valueIndex != that._valueIndex)
        return false;
    }

    boolean this_present__type = true && this.isSet_type();
    boolean that_present__type = true && that.isSet_type();
    if (this_present__type || that_present__type) {
      if (!(this_present__type && that_present__type))
        return false;
      if (!this._type.equals(that._type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(RemoteValueID other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSet_homeId()).compareTo(other.isSet_homeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet_homeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this._homeId, other._homeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet_nodeId()).compareTo(other.isSet_nodeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet_nodeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this._nodeId, other._nodeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet_genre()).compareTo(other.isSet_genre());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet_genre()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this._genre, other._genre);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet_commandClassId()).compareTo(other.isSet_commandClassId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet_commandClassId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this._commandClassId, other._commandClassId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet_instance()).compareTo(other.isSet_instance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet_instance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this._instance, other._instance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet_valueIndex()).compareTo(other.isSet_valueIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet_valueIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this._valueIndex, other._valueIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet_type()).compareTo(other.isSet_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this._type, other._type);
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
    StringBuilder sb = new StringBuilder("RemoteValueID(");
    boolean first = true;

    sb.append("_homeId:");
    sb.append(this._homeId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("_nodeId:");
    sb.append(this._nodeId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("_genre:");
    if (this._genre == null) {
      sb.append("null");
    } else {
      sb.append(this._genre);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("_commandClassId:");
    sb.append(this._commandClassId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("_instance:");
    sb.append(this._instance);
    first = false;
    if (!first) sb.append(", ");
    sb.append("_valueIndex:");
    sb.append(this._valueIndex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("_type:");
    if (this._type == null) {
      sb.append("null");
    } else {
      sb.append(this._type);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RemoteValueIDStandardSchemeFactory implements SchemeFactory {
    public RemoteValueIDStandardScheme getScheme() {
      return new RemoteValueIDStandardScheme();
    }
  }

  private static class RemoteValueIDStandardScheme extends StandardScheme<RemoteValueID> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RemoteValueID struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // _HOME_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct._homeId = iprot.readI32();
              struct.set_homeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // _NODE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct._nodeId = iprot.readByte();
              struct.set_nodeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // _GENRE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct._genre = RemoteValueGenre.findByValue(iprot.readI32());
              struct.set_genreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // _COMMAND_CLASS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct._commandClassId = iprot.readByte();
              struct.set_commandClassIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // _INSTANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct._instance = iprot.readByte();
              struct.set_instanceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // _VALUE_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct._valueIndex = iprot.readByte();
              struct.set_valueIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // _TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct._type = RemoteValueType.findByValue(iprot.readI32());
              struct.set_typeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RemoteValueID struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(_HOME_ID_FIELD_DESC);
      oprot.writeI32(struct._homeId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(_NODE_ID_FIELD_DESC);
      oprot.writeByte(struct._nodeId);
      oprot.writeFieldEnd();
      if (struct._genre != null) {
        oprot.writeFieldBegin(_GENRE_FIELD_DESC);
        oprot.writeI32(struct._genre.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(_COMMAND_CLASS_ID_FIELD_DESC);
      oprot.writeByte(struct._commandClassId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(_INSTANCE_FIELD_DESC);
      oprot.writeByte(struct._instance);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(_VALUE_INDEX_FIELD_DESC);
      oprot.writeByte(struct._valueIndex);
      oprot.writeFieldEnd();
      if (struct._type != null) {
        oprot.writeFieldBegin(_TYPE_FIELD_DESC);
        oprot.writeI32(struct._type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RemoteValueIDTupleSchemeFactory implements SchemeFactory {
    public RemoteValueIDTupleScheme getScheme() {
      return new RemoteValueIDTupleScheme();
    }
  }

  private static class RemoteValueIDTupleScheme extends TupleScheme<RemoteValueID> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RemoteValueID struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSet_homeId()) {
        optionals.set(0);
      }
      if (struct.isSet_nodeId()) {
        optionals.set(1);
      }
      if (struct.isSet_genre()) {
        optionals.set(2);
      }
      if (struct.isSet_commandClassId()) {
        optionals.set(3);
      }
      if (struct.isSet_instance()) {
        optionals.set(4);
      }
      if (struct.isSet_valueIndex()) {
        optionals.set(5);
      }
      if (struct.isSet_type()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSet_homeId()) {
        oprot.writeI32(struct._homeId);
      }
      if (struct.isSet_nodeId()) {
        oprot.writeByte(struct._nodeId);
      }
      if (struct.isSet_genre()) {
        oprot.writeI32(struct._genre.getValue());
      }
      if (struct.isSet_commandClassId()) {
        oprot.writeByte(struct._commandClassId);
      }
      if (struct.isSet_instance()) {
        oprot.writeByte(struct._instance);
      }
      if (struct.isSet_valueIndex()) {
        oprot.writeByte(struct._valueIndex);
      }
      if (struct.isSet_type()) {
        oprot.writeI32(struct._type.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RemoteValueID struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct._homeId = iprot.readI32();
        struct.set_homeIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct._nodeId = iprot.readByte();
        struct.set_nodeIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct._genre = RemoteValueGenre.findByValue(iprot.readI32());
        struct.set_genreIsSet(true);
      }
      if (incoming.get(3)) {
        struct._commandClassId = iprot.readByte();
        struct.set_commandClassIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct._instance = iprot.readByte();
        struct.set_instanceIsSet(true);
      }
      if (incoming.get(5)) {
        struct._valueIndex = iprot.readByte();
        struct.set_valueIndexIsSet(true);
      }
      if (incoming.get(6)) {
        struct._type = RemoteValueType.findByValue(iprot.readI32());
        struct.set_typeIsSet(true);
      }
    }
  }

}
