// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/attached_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface GetAttachedServerConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.GetAttachedServerConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the
   * [AttachedServerConfig][google.cloud.gkemulticloud.v1.AttachedServerConfig]
   * resource to describe.
   * `AttachedServerConfig` names are formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/attachedServerConfig`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the
   * [AttachedServerConfig][google.cloud.gkemulticloud.v1.AttachedServerConfig]
   * resource to describe.
   * `AttachedServerConfig` names are formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/attachedServerConfig`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
