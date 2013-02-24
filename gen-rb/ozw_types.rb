#
# Autogenerated by Thrift Compiler (0.9.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'

module OpenZWave
  module RemoteValueGenre
    ValueGenre_Basic = 0
    ValueGenre_User = 1
    ValueGenre_Config = 2
    ValueGenre_System = 3
    ValueGenre_Count = 4
    VALUE_MAP = {0 => "ValueGenre_Basic", 1 => "ValueGenre_User", 2 => "ValueGenre_Config", 3 => "ValueGenre_System", 4 => "ValueGenre_Count"}
    VALID_VALUES = Set.new([ValueGenre_Basic, ValueGenre_User, ValueGenre_Config, ValueGenre_System, ValueGenre_Count]).freeze
  end

  module RemoteValueType
    ValueType_Bool = 0
    ValueType_Byte = 1
    ValueType_Decimal = 2
    ValueType_Int = 3
    ValueType_List = 4
    ValueType_Schedule = 5
    ValueType_Short = 6
    ValueType_String = 7
    ValueType_Button = 8
    ValueType_Max = 8
    VALUE_MAP = {0 => "ValueType_Bool", 1 => "ValueType_Byte", 2 => "ValueType_Decimal", 3 => "ValueType_Int", 4 => "ValueType_List", 5 => "ValueType_Schedule", 6 => "ValueType_Short", 7 => "ValueType_String", 8 => "ValueType_Button", 8 => "ValueType_Max"}
    VALID_VALUES = Set.new([ValueType_Bool, ValueType_Byte, ValueType_Decimal, ValueType_Int, ValueType_List, ValueType_Schedule, ValueType_Short, ValueType_String, ValueType_Button, ValueType_Max]).freeze
  end

  module DriverControllerCommand
    ControllerCommand_None = 0
    # < No command.
    ControllerCommand_AddController = 1
    # < Add a new controller to the Z-Wave network.  The new controller will be a secondary.
    ControllerCommand_AddDevice = 2
    # < Add a new device (but not a controller) to the Z-Wave network.
    ControllerCommand_CreateNewPrimary = 3
    # < Add a new controller to the Z-Wave network.  The new controller will be the primary, and the current primary will become a secondary controller.
    ControllerCommand_ReceiveConfiguration = 4
    # < Receive Z-Wave network configuration information from another controller.
    ControllerCommand_RemoveController = 5
    # < Remove a controller from the Z-Wave network.
    ControllerCommand_RemoveDevice = 6
    # < Remove a new device (but not a controller) from the Z-Wave network.
    ControllerCommand_RemoveFailedNode = 7
    # < Move a node to the controller's failed nodes list. This command will only work if the node cannot respond.
    ControllerCommand_HasNodeFailed = 8
    # < Check whether a node is in the controller's failed nodes list.
    ControllerCommand_ReplaceFailedNode = 9
    # < Replace a non-responding node with another. The node must be in the controller's list of failed nodes for this command to succeed.
    ControllerCommand_TransferPrimaryRole = 10
    # < Make a different controller the primary.
    ControllerCommand_RequestNetworkUpdate = 11
    # < Request network information from the SUC/SIS.
    ControllerCommand_RequestNodeNeighborUpdate = 12
    # < Get a node to rebuild its neighbour list.  This method also does ControllerCommand_RequestNodeNeighbors
    ControllerCommand_AssignReturnRoute = 13
    # < Assign a network return routes to a device.
    ControllerCommand_DeleteAllReturnRoutes = 14
    # < Delete all return routes from a device.
    ControllerCommand_CreateButton = 15
    # Create a handheld button id.
    ControllerCommand_DeleteButton = 16
    VALUE_MAP = {0 => "ControllerCommand_None", 1 => "ControllerCommand_AddController", 2 => "ControllerCommand_AddDevice", 3 => "ControllerCommand_CreateNewPrimary", 4 => "ControllerCommand_ReceiveConfiguration", 5 => "ControllerCommand_RemoveController", 6 => "ControllerCommand_RemoveDevice", 7 => "ControllerCommand_RemoveFailedNode", 8 => "ControllerCommand_HasNodeFailed", 9 => "ControllerCommand_ReplaceFailedNode", 10 => "ControllerCommand_TransferPrimaryRole", 11 => "ControllerCommand_RequestNetworkUpdate", 12 => "ControllerCommand_RequestNodeNeighborUpdate", 13 => "ControllerCommand_AssignReturnRoute", 14 => "ControllerCommand_DeleteAllReturnRoutes", 15 => "ControllerCommand_CreateButton", 16 => "ControllerCommand_DeleteButton"}
    VALID_VALUES = Set.new([ControllerCommand_None, ControllerCommand_AddController, ControllerCommand_AddDevice, ControllerCommand_CreateNewPrimary, ControllerCommand_ReceiveConfiguration, ControllerCommand_RemoveController, ControllerCommand_RemoveDevice, ControllerCommand_RemoveFailedNode, ControllerCommand_HasNodeFailed, ControllerCommand_ReplaceFailedNode, ControllerCommand_TransferPrimaryRole, ControllerCommand_RequestNetworkUpdate, ControllerCommand_RequestNodeNeighborUpdate, ControllerCommand_AssignReturnRoute, ControllerCommand_DeleteAllReturnRoutes, ControllerCommand_CreateButton, ControllerCommand_DeleteButton]).freeze
  end

  # Delete a handheld button id.
  class RemoteValueID
    include ::Thrift::Struct, ::Thrift::Struct_Union
    _HOMEID = 1
    _NODEID = 2
    _GENRE = 3
    _COMMANDCLASSID = 4
    _INSTANCE = 5
    _VALUEINDEX = 6
    _TYPE = 7

    FIELDS = {
      _HOMEID => {:type => ::Thrift::Types::I32, :name => '_homeId'},
      _NODEID => {:type => ::Thrift::Types::BYTE, :name => '_nodeId'},
      _GENRE => {:type => ::Thrift::Types::I32, :name => '_genre', :enum_class => ::OpenZWave::RemoteValueGenre},
      _COMMANDCLASSID => {:type => ::Thrift::Types::BYTE, :name => '_commandClassId'},
      _INSTANCE => {:type => ::Thrift::Types::BYTE, :name => '_instance'},
      _VALUEINDEX => {:type => ::Thrift::Types::BYTE, :name => '_valueIndex'},
      _TYPE => {:type => ::Thrift::Types::I32, :name => '_type', :enum_class => ::OpenZWave::RemoteValueType}
    }

    def struct_fields; FIELDS; end

    def validate
      unless @_genre.nil? || ::OpenZWave::RemoteValueGenre::VALID_VALUES.include?(@_genre)
        raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field _genre!')
      end
      unless @_type.nil? || ::OpenZWave::RemoteValueType::VALID_VALUES.include?(@_type)
        raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field _type!')
      end
    end

    ::Thrift::Struct.generate_accessors self
  end

  class DriverData
    include ::Thrift::Struct, ::Thrift::Struct_Union
    S_SOFCNT = 1
    S_ACKWAITING = 2
    S_READABORTS = 3
    S_BADCHECKSUM = 4
    S_READCNT = 5
    S_WRITECNT = 6
    S_CANCNT = 7
    S_NAKCNT = 8
    S_ACKCNT = 9
    S_OOFCNT = 10
    S_DROPPED = 11
    S_RETRIES = 12
    S_CONTROLLERREADCNT = 13
    S_CONTROLLERWRITECNT = 14

    FIELDS = {
      S_SOFCNT => {:type => ::Thrift::Types::I32, :name => 's_SOFCnt'},
      S_ACKWAITING => {:type => ::Thrift::Types::I32, :name => 's_ACKWaiting'},
      S_READABORTS => {:type => ::Thrift::Types::I32, :name => 's_readAborts'},
      S_BADCHECKSUM => {:type => ::Thrift::Types::I32, :name => 's_badChecksum'},
      S_READCNT => {:type => ::Thrift::Types::I32, :name => 's_readCnt'},
      S_WRITECNT => {:type => ::Thrift::Types::I32, :name => 's_writeCnt'},
      S_CANCNT => {:type => ::Thrift::Types::I32, :name => 's_CANCnt'},
      S_NAKCNT => {:type => ::Thrift::Types::I32, :name => 's_NAKCnt'},
      S_ACKCNT => {:type => ::Thrift::Types::I32, :name => 's_ACKCnt'},
      S_OOFCNT => {:type => ::Thrift::Types::I32, :name => 's_OOFCnt'},
      S_DROPPED => {:type => ::Thrift::Types::I32, :name => 's_dropped'},
      S_RETRIES => {:type => ::Thrift::Types::I32, :name => 's_retries'},
      S_CONTROLLERREADCNT => {:type => ::Thrift::Types::I32, :name => 's_controllerReadCnt'},
      S_CONTROLLERWRITECNT => {:type => ::Thrift::Types::I32, :name => 's_controllerWriteCnt'}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class GetDriverStatisticsReturnStruct
    include ::Thrift::Struct, ::Thrift::Struct_Union
    _DATA = 1

    FIELDS = {
      _DATA => {:type => ::Thrift::Types::STRUCT, :name => '_data', :class => ::OpenZWave::DriverData}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class CommandClassData
    include ::Thrift::Struct, ::Thrift::Struct_Union
    M_COMMANDCLASSID = 1
    M_SENTCNT = 2
    M_RECEIVEDCNT = 3

    FIELDS = {
      M_COMMANDCLASSID => {:type => ::Thrift::Types::BYTE, :name => 'm_commandClassId'},
      M_SENTCNT => {:type => ::Thrift::Types::I32, :name => 'm_sentCnt'},
      M_RECEIVEDCNT => {:type => ::Thrift::Types::I32, :name => 'm_receivedCnt'}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class NodeData
    include ::Thrift::Struct, ::Thrift::Struct_Union
    M_SENTCNT = 1
    M_SENTFAILED = 2
    M_RETRIES = 3
    M_RECEIVEDCNT = 4
    M_RECEIVEDDUPS = 5
    M_RTT = 6
    M_SENTTS = 7
    M_RECEIVEDTS = 8
    M_LASTRTT = 9
    M_AVERAGERTT = 10
    M_QUALITY = 11
    M_LASTRECEIVEDMESSAGE = 12
    M_CCDATA = 13

    FIELDS = {
      M_SENTCNT => {:type => ::Thrift::Types::I32, :name => 'm_sentCnt'},
      M_SENTFAILED => {:type => ::Thrift::Types::I32, :name => 'm_sentFailed'},
      M_RETRIES => {:type => ::Thrift::Types::I32, :name => 'm_retries'},
      M_RECEIVEDCNT => {:type => ::Thrift::Types::I32, :name => 'm_receivedCnt'},
      M_RECEIVEDDUPS => {:type => ::Thrift::Types::I32, :name => 'm_receivedDups'},
      M_RTT => {:type => ::Thrift::Types::I32, :name => 'm_rtt'},
      M_SENTTS => {:type => ::Thrift::Types::STRING, :name => 'm_sentTS'},
      M_RECEIVEDTS => {:type => ::Thrift::Types::STRING, :name => 'm_receivedTS'},
      M_LASTRTT => {:type => ::Thrift::Types::I32, :name => 'm_lastRTT'},
      M_AVERAGERTT => {:type => ::Thrift::Types::I32, :name => 'm_averageRTT'},
      M_QUALITY => {:type => ::Thrift::Types::BYTE, :name => 'm_quality'},
      M_LASTRECEIVEDMESSAGE => {:type => ::Thrift::Types::LIST, :name => 'm_lastReceivedMessage', :element => {:type => ::Thrift::Types::BYTE}},
      M_CCDATA => {:type => ::Thrift::Types::LIST, :name => 'm_ccData', :element => {:type => ::Thrift::Types::STRUCT, :class => ::OpenZWave::CommandClassData}}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class GetNodeStatisticsReturnStruct
    include ::Thrift::Struct, ::Thrift::Struct_Union
    _DATA = 1

    FIELDS = {
      _DATA => {:type => ::Thrift::Types::STRUCT, :name => '_data', :class => ::OpenZWave::NodeData}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class GetSwitchPointReturnStruct
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    O_HOURS = 2
    O_MINUTES = 3
    O_SETBACK = 4

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::BOOL, :name => 'retval'},
      O_HOURS => {:type => ::Thrift::Types::BYTE, :name => 'o_hours'},
      O_MINUTES => {:type => ::Thrift::Types::BYTE, :name => 'o_minutes'},
      O_SETBACK => {:type => ::Thrift::Types::BYTE, :name => 'o_setback'}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class Bool_Bool
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    O_VALUE = 2

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::BOOL, :name => 'retval'},
      O_VALUE => {:type => ::Thrift::Types::BOOL, :name => 'o_value'}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class Bool_UInt8
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    O_VALUE = 2

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::BOOL, :name => 'retval'},
      O_VALUE => {:type => ::Thrift::Types::BYTE, :name => 'o_value'}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class Bool_Float
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    O_VALUE = 2

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::BOOL, :name => 'retval'},
      O_VALUE => {:type => ::Thrift::Types::DOUBLE, :name => 'o_value'}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class Bool_Int
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    O_VALUE = 2

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::BOOL, :name => 'retval'},
      O_VALUE => {:type => ::Thrift::Types::I32, :name => 'o_value'}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class Bool_Int16
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    O_VALUE = 2

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::BOOL, :name => 'retval'},
      O_VALUE => {:type => ::Thrift::Types::I16, :name => 'o_value'}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class Bool_String
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    O_VALUE = 2

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::BOOL, :name => 'retval'},
      O_VALUE => {:type => ::Thrift::Types::STRING, :name => 'o_value'}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class Bool_ListString
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    O_VALUE = 2

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::BOOL, :name => 'retval'},
      O_VALUE => {:type => ::Thrift::Types::LIST, :name => 'o_value', :element => {:type => ::Thrift::Types::STRING}}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class UInt32_ListByte
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    _NODENEIGHBORS = 2

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::I32, :name => 'retval'},
      _NODENEIGHBORS => {:type => ::Thrift::Types::LIST, :name => '_nodeNeighbors', :element => {:type => ::Thrift::Types::BYTE}}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class Bool_GetNodeClassInformation
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    _CLASSNAME = 2
    _CLASSVERSION = 3

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::BOOL, :name => 'retval'},
      _CLASSNAME => {:type => ::Thrift::Types::STRING, :name => '_className'},
      _CLASSVERSION => {:type => ::Thrift::Types::BYTE, :name => '_classVersion'}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class GetAssociationsReturnStruct
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    O_ASSOCIATIONS = 2

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::I32, :name => 'retval'},
      O_ASSOCIATIONS => {:type => ::Thrift::Types::LIST, :name => 'o_associations', :element => {:type => ::Thrift::Types::BYTE}}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class GetAllScenesReturnStruct
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    _SCENEIDS = 2

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::BYTE, :name => 'retval'},
      _SCENEIDS => {:type => ::Thrift::Types::LIST, :name => '_sceneIds', :element => {:type => ::Thrift::Types::BYTE}}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class SceneGetValuesReturnStruct
    include ::Thrift::Struct, ::Thrift::Struct_Union
    RETVAL = 1
    O_VALUE = 2

    FIELDS = {
      RETVAL => {:type => ::Thrift::Types::I32, :name => 'retval'},
      O_VALUE => {:type => ::Thrift::Types::LIST, :name => 'o_value', :element => {:type => ::Thrift::Types::STRUCT, :class => ::OpenZWave::RemoteValueID}}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

end
