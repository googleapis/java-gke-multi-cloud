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
// source: google/cloud/gkemulticloud/v1/attached_resources.proto

package com.google.cloud.gkemulticloud.v1;

public final class AttachedResourcesProto {
  private AttachedResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedClustersAuthorization_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedClustersAuthorization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedClusterUser_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedClusterUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedServerConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedServerConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedPlatformVersionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedPlatformVersionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkemulticloud_v1_AttachedClusterError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_AttachedClusterError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/gkemulticloud/v1/attached"
          + "_resources.proto\022\035google.cloud.gkemultic"
          + "loud.v1\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\0324google/clou"
          + "d/gkemulticloud/v1/common_resources.prot"
          + "o\032\037google/protobuf/timestamp.proto\"\314\n\n\017A"
          + "ttachedCluster\022\014\n\004name\030\001 \001(\t\022\030\n\013descript"
          + "ion\030\002 \001(\tB\003\340A\001\022K\n\013oidc_config\030\003 \001(\01321.go"
          + "ogle.cloud.gkemulticloud.v1.AttachedOidc"
          + "ConfigB\003\340A\002\022\035\n\020platform_version\030\004 \001(\tB\003\340"
          + "A\002\022\031\n\014distribution\030\020 \001(\tB\003\340A\002\022\033\n\016cluster"
          + "_region\030\026 \001(\tB\003\340A\003\0228\n\005fleet\030\005 \001(\0132$.goog"
          + "le.cloud.gkemulticloud.v1.FleetB\003\340A\002\022H\n\005"
          + "state\030\006 \001(\01624.google.cloud.gkemulticloud"
          + ".v1.AttachedCluster.StateB\003\340A\003\022\020\n\003uid\030\007 "
          + "\001(\tB\003\340A\003\022\030\n\013reconciling\030\010 \001(\010B\003\340A\003\0224\n\013cr"
          + "eate_time\030\t \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\0224\n\013update_time\030\n \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\022\014\n\004etag\030\013 \001(\t\022\037\n\022"
          + "kubernetes_version\030\014 \001(\tB\003\340A\003\022Y\n\013annotat"
          + "ions\030\r \003(\0132?.google.cloud.gkemulticloud."
          + "v1.AttachedCluster.AnnotationsEntryB\003\340A\001"
          + "\022\\\n\030workload_identity_config\030\016 \001(\01325.goo"
          + "gle.cloud.gkemulticloud.v1.WorkloadIdent"
          + "ityConfigB\003\340A\003\022I\n\016logging_config\030\017 \001(\0132,"
          + ".google.cloud.gkemulticloud.v1.LoggingCo"
          + "nfigB\003\340A\001\022H\n\006errors\030\024 \003(\01323.google.cloud"
          + ".gkemulticloud.v1.AttachedClusterErrorB\003"
          + "\340A\003\022X\n\rauthorization\030\025 \001(\0132<.google.clou"
          + "d.gkemulticloud.v1.AttachedClustersAutho"
          + "rizationB\003\340A\001\022O\n\021monitoring_config\030\027 \001(\013"
          + "2/.google.cloud.gkemulticloud.v1.Monitor"
          + "ingConfigB\003\340A\001\0322\n\020AnnotationsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"u\n\005State\022\025\n\021S"
          + "TATE_UNSPECIFIED\020\000\022\020\n\014PROVISIONING\020\001\022\013\n\007"
          + "RUNNING\020\002\022\017\n\013RECONCILING\020\003\022\014\n\010STOPPING\020\004"
          + "\022\t\n\005ERROR\020\005\022\014\n\010DEGRADED\020\006:~\352A{\n,gkemulti"
          + "cloud.googleapis.com/AttachedCluster\022Kpr"
          + "ojects/{project}/locations/{location}/at"
          + "tachedClusters/{attached_cluster}\"m\n\035Att"
          + "achedClustersAuthorization\022L\n\013admin_user"
          + "s\030\001 \003(\01322.google.cloud.gkemulticloud.v1."
          + "AttachedClusterUserB\003\340A\002\",\n\023AttachedClus"
          + "terUser\022\025\n\010username\030\001 \001(\tB\003\340A\002\";\n\022Attach"
          + "edOidcConfig\022\022\n\nissuer_url\030\001 \001(\t\022\021\n\004jwks"
          + "\030\002 \001(\014B\003\340A\001\"\356\001\n\024AttachedServerConfig\022\014\n\004"
          + "name\030\001 \001(\t\022R\n\016valid_versions\030\002 \003(\0132:.goo"
          + "gle.cloud.gkemulticloud.v1.AttachedPlatf"
          + "ormVersionInfo:t\352Aq\n1gkemulticloud.googl"
          + "eapis.com/AttachedServerConfig\022<projects"
          + "/{project}/locations/{location}/attached"
          + "ServerConfig\".\n\033AttachedPlatformVersionI"
          + "nfo\022\017\n\007version\030\001 \001(\t\"\'\n\024AttachedClusterE"
          + "rror\022\017\n\007message\030\001 \001(\tB\354\001\n!com.google.clo"
          + "ud.gkemulticloud.v1B\026AttachedResourcesPr"
          + "otoP\001ZJgoogle.golang.org/genproto/google"
          + "apis/cloud/gkemulticloud/v1;gkemulticlou"
          + "d\252\002\035Google.Cloud.GkeMultiCloud.V1\312\002\035Goog"
          + "le\\Cloud\\GkeMultiCloud\\V1\352\002 Google::Clou"
          + "d::GkeMultiCloud::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gkemulticloud.v1.CommonResourcesProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "OidcConfig",
              "PlatformVersion",
              "Distribution",
              "ClusterRegion",
              "Fleet",
              "State",
              "Uid",
              "Reconciling",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "KubernetesVersion",
              "Annotations",
              "WorkloadIdentityConfig",
              "LoggingConfig",
              "Errors",
              "Authorization",
              "MonitoringConfig",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_AnnotationsEntry_descriptor =
        internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedCluster_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedClustersAuthorization_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkemulticloud_v1_AttachedClustersAuthorization_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedClustersAuthorization_descriptor,
            new java.lang.String[] {
              "AdminUsers",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedClusterUser_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkemulticloud_v1_AttachedClusterUser_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedClusterUser_descriptor,
            new java.lang.String[] {
              "Username",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_descriptor,
            new java.lang.String[] {
              "IssuerUrl", "Jwks",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedServerConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkemulticloud_v1_AttachedServerConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedServerConfig_descriptor,
            new java.lang.String[] {
              "Name", "ValidVersions",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedPlatformVersionInfo_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gkemulticloud_v1_AttachedPlatformVersionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedPlatformVersionInfo_descriptor,
            new java.lang.String[] {
              "Version",
            });
    internal_static_google_cloud_gkemulticloud_v1_AttachedClusterError_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gkemulticloud_v1_AttachedClusterError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkemulticloud_v1_AttachedClusterError_descriptor,
            new java.lang.String[] {
              "Message",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gkemulticloud.v1.CommonResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
