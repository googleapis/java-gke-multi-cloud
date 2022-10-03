/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/common_resources.proto

package com.google.cloud.gkemulticloud.v1;

public final class CommonResourcesProto {
  private CommonResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_WorkloadIdentityConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_WorkloadIdentityConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_MaxPodsConstraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_MaxPodsConstraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_NodeTaint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_NodeTaint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_Fleet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_Fleet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_LoggingComponentConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_LoggingComponentConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/gkemulticloud/v1/common_r"
          + "esources.proto\022\035google.cloud.gkemulticlo"
          + "ud.v1\032\037google/api/field_behavior.proto\032\037"
          + "google/protobuf/timestamp.proto\"^\n\026Workl"
          + "oadIdentityConfig\022\022\n\nissuer_uri\030\001 \001(\t\022\025\n"
          + "\rworkload_pool\030\002 \001(\t\022\031\n\021identity_provide"
          + "r\030\003 \001(\t\"3\n\021MaxPodsConstraint\022\036\n\021max_pods"
          + "_per_node\030\001 \001(\003B\003\340A\002\"\310\001\n\021OperationMetada"
          + "ta\0224\n\013create_time\030\001 \001(\0132\032.google.protobu"
          + "f.TimestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\022\023\n\006target\030\003 "
          + "\001(\tB\003\340A\003\022\032\n\rstatus_detail\030\004 \001(\tB\003\340A\003\022\031\n\014"
          + "error_detail\030\005 \001(\tB\003\340A\003\"\322\001\n\tNodeTaint\022\020\n"
          + "\003key\030\001 \001(\tB\003\340A\002\022\022\n\005value\030\002 \001(\tB\003\340A\002\022D\n\006e"
          + "ffect\030\003 \001(\0162/.google.cloud.gkemulticloud"
          + ".v1.NodeTaint.EffectB\003\340A\002\"Y\n\006Effect\022\026\n\022E"
          + "FFECT_UNSPECIFIED\020\000\022\017\n\013NO_SCHEDULE\020\001\022\026\n\022"
          + "PREFER_NO_SCHEDULE\020\002\022\016\n\nNO_EXECUTE\020\003\"6\n\005"
          + "Fleet\022\024\n\007project\030\001 \001(\tB\003\340A\002\022\027\n\nmembershi"
          + "p\030\002 \001(\tB\003\340A\003\"`\n\rLoggingConfig\022O\n\020compone"
          + "nt_config\030\001 \001(\01325.google.cloud.gkemultic"
          + "loud.v1.LoggingComponentConfig\"\302\001\n\026Loggi"
          + "ngComponentConfig\022Z\n\021enable_components\030\001"
          + " \003(\0162?.google.cloud.gkemulticloud.v1.Log"
          + "gingComponentConfig.Component\"L\n\tCompone"
          + "nt\022\031\n\025COMPONENT_UNSPECIFIED\020\000\022\025\n\021SYSTEM_"
          + "COMPONENTS\020\001\022\r\n\tWORKLOADS\020\002B\352\001\n!com.goog"
          + "le.cloud.gkemulticloud.v1B\024CommonResourc"
          + "esProtoP\001ZJgoogle.golang.org/genproto/go"
          + "ogleapis/cloud/gkemulticloud/v1;gkemulti"
          + "cloud\252\002\035Google.Cloud.GkeMultiCloud.V1\312\002\035"
          + "Google\\Cloud\\GkeMultiCloud\\V1\352\002 Google::"
          + "Cloud::GkeMultiCloud::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkemulticloud_v1_WorkloadIdentityConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkemulticloud_v1_WorkloadIdentityConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_WorkloadIdentityConfig_descriptor,
            new java.lang.String[] {
              "IssuerUri", "WorkloadPool", "IdentityProvider",
            });
    internal_static_google_cloud_gkemulticloud_v1_MaxPodsConstraint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkemulticloud_v1_MaxPodsConstraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_MaxPodsConstraint_descriptor,
            new java.lang.String[] {
              "MaxPodsPerNode",
            });
    internal_static_google_cloud_gkemulticloud_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkemulticloud_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "EndTime", "Target", "StatusDetail", "ErrorDetail",
            });
    internal_static_google_cloud_gkemulticloud_v1_NodeTaint_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkemulticloud_v1_NodeTaint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_NodeTaint_descriptor,
            new java.lang.String[] {
              "Key", "Value", "Effect",
            });
    internal_static_google_cloud_gkemulticloud_v1_Fleet_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkemulticloud_v1_Fleet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_Fleet_descriptor,
            new java.lang.String[] {
              "Project", "Membership",
            });
    internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_descriptor,
            new java.lang.String[] {
              "ComponentConfig",
            });
    internal_static_google_cloud_gkemulticloud_v1_LoggingComponentConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gkemulticloud_v1_LoggingComponentConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_LoggingComponentConfig_descriptor,
            new java.lang.String[] {
              "EnableComponents",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
