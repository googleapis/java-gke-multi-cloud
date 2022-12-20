// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/attached_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface ImportAttachedClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.ImportAttachedClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent location where this
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
   * will be created.
   * Location names are formatted as `projects/&lt;project-id&gt;/locations/&lt;region&gt;`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent location where this
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
   * will be created.
   * Location names are formatted as `projects/&lt;project-id&gt;/locations/&lt;region&gt;`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * If set, only validate the request, but do not actually import the cluster.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * Required. The name of the fleet membership resource to import.
   * </pre>
   *
   * <code>string fleet_membership = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The fleetMembership.
   */
  java.lang.String getFleetMembership();
  /**
   * <pre>
   * Required. The name of the fleet membership resource to import.
   * </pre>
   *
   * <code>string fleet_membership = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for fleetMembership.
   */
  com.google.protobuf.ByteString
      getFleetMembershipBytes();

  /**
   * <pre>
   * Required. The platform version for the cluster (e.g. `1.19.0-gke.1000`).
   * You can list all supported versions on a given Google Cloud region by
   * calling
   * [GetAttachedServerConfig][google.cloud.gkemulticloud.v1.AttachedClusters.GetAttachedServerConfig].
   * </pre>
   *
   * <code>string platform_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The platformVersion.
   */
  java.lang.String getPlatformVersion();
  /**
   * <pre>
   * Required. The platform version for the cluster (e.g. `1.19.0-gke.1000`).
   * You can list all supported versions on a given Google Cloud region by
   * calling
   * [GetAttachedServerConfig][google.cloud.gkemulticloud.v1.AttachedClusters.GetAttachedServerConfig].
   * </pre>
   *
   * <code>string platform_version = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for platformVersion.
   */
  com.google.protobuf.ByteString
      getPlatformVersionBytes();

  /**
   * <pre>
   * Required. The Kubernetes distribution of the underlying attached cluster.
   * Supported values: ["eks", "aks"].
   * </pre>
   *
   * <code>string distribution = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The distribution.
   */
  java.lang.String getDistribution();
  /**
   * <pre>
   * Required. The Kubernetes distribution of the underlying attached cluster.
   * Supported values: ["eks", "aks"].
   * </pre>
   *
   * <code>string distribution = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for distribution.
   */
  com.google.protobuf.ByteString
      getDistributionBytes();
}