/* Copyright 2017 Esteve Fernandez <esteve@apache.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ros2.rcljava.parameters;

import java.util.Arrays;
import java.util.List;

public class ParameterVariant {
  private final String name;

  private final rcl_interfaces.msg.ParameterValue value;

  public ParameterVariant() {
    this.name = "";
    this.value = new rcl_interfaces.msg.ParameterValue();
    this.value.setType(ParameterType.PARAMETER_NOT_SET.getValue());
  }

  public ParameterVariant(final String name, final boolean boolValue) {
    this.name = name;
    this.value = new rcl_interfaces.msg.ParameterValue();
    this.value.setBoolValue(boolValue);
    this.value.setType(ParameterType.PARAMETER_BOOL.getValue());
  }

  public ParameterVariant(final String name, final int intValue) {
    this.name = name;
    this.value = new rcl_interfaces.msg.ParameterValue();
    this.value.setIntegerValue(intValue);
    this.value.setType(ParameterType.PARAMETER_INTEGER.getValue());
  }

  public ParameterVariant(final String name, final long longValue) {
    this.name = name;
    this.value = new rcl_interfaces.msg.ParameterValue();
    this.value.setIntegerValue(longValue);
    this.value.setType(ParameterType.PARAMETER_INTEGER.getValue());
  }

  public ParameterVariant(final String name, final float floatValue) {
    this.name = name;
    this.value = new rcl_interfaces.msg.ParameterValue();
    this.value.setDoubleValue(floatValue);
    this.value.setType(ParameterType.PARAMETER_DOUBLE.getValue());
  }

  public ParameterVariant(final String name, final double doubleValue) {
    this.name = name;
    this.value = new rcl_interfaces.msg.ParameterValue();
    this.value.setDoubleValue(doubleValue);
    this.value.setType(ParameterType.PARAMETER_DOUBLE.getValue());
  }

  public ParameterVariant(final String name, final String stringValue) {
    this.name = name;
    this.value = new rcl_interfaces.msg.ParameterValue();
    this.value.setStringValue(stringValue);
    this.value.setType(ParameterType.PARAMETER_STRING.getValue());
  }

  public ParameterVariant(final String name, final List<Byte> bytesValue) {
    this.name = name;
    this.value = new rcl_interfaces.msg.ParameterValue();
    this.value.setBytesValue(bytesValue);
    this.value.setType(ParameterType.PARAMETER_BYTES.getValue());
  }

  public ParameterType getType() {
    return ParameterType.fromByte(this.value.getType());
  }

  public String getTypeName() {
    switch (getType()) {
      case PARAMETER_BOOL:
        return "bool";
      case PARAMETER_INTEGER:
        return "integer";
      case PARAMETER_DOUBLE:
        return "double";
      case PARAMETER_STRING:
        return "string";
      case PARAMETER_BYTES:
        return "bytes";
      case PARAMETER_NOT_SET:
        return "not set";
      default:
        throw new IllegalArgumentException(
            "Unexpected type from ParameterVariant: " + this.value.getType());
    }
  }

  public final String getName() {
    return this.name;
  }

  public final rcl_interfaces.msg.ParameterValue getParameterValue() {
    return this.value;
  }

  public final long asInt() {
    if (getType() != ParameterType.PARAMETER_INTEGER) {
      throw new IllegalArgumentException("Invalid type");
    }
    return this.value.getIntegerValue();
  }

  public final double asDouble() {
    if (getType() != ParameterType.PARAMETER_DOUBLE) {
      throw new IllegalArgumentException("Invalid type");
    }
    return this.value.getDoubleValue();
  }

  public final String asString() {
    if (getType() != ParameterType.PARAMETER_STRING) {
      throw new IllegalArgumentException("Invalid type");
    }
    return this.value.getStringValue();
  }

  public final boolean asBool() {
    if (getType() != ParameterType.PARAMETER_BOOL) {
      throw new IllegalArgumentException("Invalid type");
    }
    return this.value.getBoolValue();
  }

  public final List<Byte> asBytes() {
    if (getType() != ParameterType.PARAMETER_BYTES) {
      throw new IllegalArgumentException("Invalid type");
    }
    return this.value.getBytesValue();
  }

  public final rcl_interfaces.msg.Parameter toParameter() {
    rcl_interfaces.msg.Parameter parameter = new rcl_interfaces.msg.Parameter();
    parameter.setName(this.name);
    parameter.setValue(this.value);
    return parameter;
  }

  public static ParameterVariant fromParameter(final rcl_interfaces.msg.Parameter parameter) {
    switch (parameter.getValue().getType()) {
      case rcl_interfaces.msg.ParameterType.PARAMETER_BOOL:
        return new ParameterVariant(parameter.getName(), parameter.getValue().getBoolValue());
      case rcl_interfaces.msg.ParameterType.PARAMETER_INTEGER:
        return new ParameterVariant(parameter.getName(), parameter.getValue().getIntegerValue());
      case rcl_interfaces.msg.ParameterType.PARAMETER_DOUBLE:
        return new ParameterVariant(parameter.getName(), parameter.getValue().getDoubleValue());
      case rcl_interfaces.msg.ParameterType.PARAMETER_STRING:
        return new ParameterVariant(parameter.getName(), parameter.getValue().getStringValue());
      case rcl_interfaces.msg.ParameterType.PARAMETER_BYTES:
        return new ParameterVariant(parameter.getName(), parameter.getValue().getBytesValue());
      case rcl_interfaces.msg.ParameterType.PARAMETER_NOT_SET:
        throw new IllegalArgumentException("Type from ParameterValue is not set");
      default:
        throw new IllegalArgumentException(
            "Unexpected type from ParameterVariant: " + parameter.getValue().getType());
    }
  }
}