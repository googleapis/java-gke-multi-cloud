// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/common_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface OperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The time at which this operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time at which this operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time at which this operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time at which this operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Output only. The time at which this operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Output only. The time at which this operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Output only. The name of the resource associated to this operation.
   * </pre>
   *
   * <code>string target = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * Output only. The name of the resource associated to this operation.
   * </pre>
   *
   * <code>string target = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString
      getTargetBytes();

  /**
   * <pre>
   * Output only. Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_detail = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The statusDetail.
   */
  java.lang.String getStatusDetail();
  /**
   * <pre>
   * Output only. Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_detail = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for statusDetail.
   */
  com.google.protobuf.ByteString
      getStatusDetailBytes();

  /**
   * <pre>
   * Output only. Human-readable status of any error that occurred during the operation.
   * </pre>
   *
   * <code>string error_detail = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The errorDetail.
   */
  java.lang.String getErrorDetail();
  /**
   * <pre>
   * Output only. Human-readable status of any error that occurred during the operation.
   * </pre>
   *
   * <code>string error_detail = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for errorDetail.
   */
  com.google.protobuf.ByteString
      getErrorDetailBytes();
}