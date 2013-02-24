/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

namespace OpenZWave
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class GetAllScenesReturnStruct : TBase
  {
    private byte _retval;
    private List<byte> __sceneIds;

    public byte Retval
    {
      get
      {
        return _retval;
      }
      set
      {
        __isset.retval = true;
        this._retval = value;
      }
    }

    public List<byte> _sceneIds
    {
      get
      {
        return __sceneIds;
      }
      set
      {
        __isset._sceneIds = true;
        this.__sceneIds = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool retval;
      public bool _sceneIds;
    }

    public GetAllScenesReturnStruct() {
    }

    public void Read (TProtocol iprot)
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.Byte) {
              Retval = iprot.ReadByte();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                _sceneIds = new List<byte>();
                TList _list20 = iprot.ReadListBegin();
                for( int _i21 = 0; _i21 < _list20.Count; ++_i21)
                {
                  byte _elem22 = 0;
                  _elem22 = iprot.ReadByte();
                  _sceneIds.Add(_elem22);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("GetAllScenesReturnStruct");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.retval) {
        field.Name = "retval";
        field.Type = TType.Byte;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(Retval);
        oprot.WriteFieldEnd();
      }
      if (_sceneIds != null && __isset._sceneIds) {
        field.Name = "_sceneIds";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Byte, _sceneIds.Count));
          foreach (byte _iter23 in _sceneIds)
          {
            oprot.WriteByte(_iter23);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("GetAllScenesReturnStruct(");
      sb.Append("Retval: ");
      sb.Append(Retval);
      sb.Append(",_sceneIds: ");
      sb.Append(_sceneIds);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
