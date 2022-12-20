// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/common_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface WorkloadIdentityConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.WorkloadIdentityConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The OIDC issuer URL for this cluster.
   * </pre>
   *
   * <code>string issuer_uri = 1;</code>
   * @return The issuerUri.
   */
  java.lang.String getIssuerUri();
  /**
   * <pre>
   * The OIDC issuer URL for this cluster.
   * </pre>
   *
   * <code>string issuer_uri = 1;</code>
   * @return The bytes for issuerUri.
   */
  com.google.protobuf.ByteString
      getIssuerUriBytes();

  /**
   * <pre>
   * The Workload Identity Pool associated to the cluster.
   * </pre>
   *
   * <code>string workload_pool = 2;</code>
   * @return The workloadPool.
   */
  java.lang.String getWorkloadPool();
  /**
   * <pre>
   * The Workload Identity Pool associated to the cluster.
   * </pre>
   *
   * <code>string workload_pool = 2;</code>
   * @return The bytes for workloadPool.
   */
  com.google.protobuf.ByteString
      getWorkloadPoolBytes();

  /**
   * <pre>
   * The ID of the OIDC Identity Provider (IdP) associated to the Workload
   * Identity Pool.
   * </pre>
   *
   * <code>string identity_provider = 3;</code>
   * @return The identityProvider.
   */
  java.lang.String getIdentityProvider();
  /**
   * <pre>
   * The ID of the OIDC Identity Provider (IdP) associated to the Workload
   * Identity Pool.
   * </pre>
   *
   * <code>string identity_provider = 3;</code>
   * @return The bytes for identityProvider.
   */
  com.google.protobuf.ByteString
      getIdentityProviderBytes();
}