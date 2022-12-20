// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/attached_service.proto

package com.google.cloud.gkemulticloud.v1;

/**
 * <pre>
 * Request message for `AttachedClusters.DeleteAttachedCluster` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest}
 */
public final class DeleteAttachedClusterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest)
    DeleteAttachedClusterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteAttachedClusterRequest.newBuilder() to construct.
  private DeleteAttachedClusterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteAttachedClusterRequest() {
    name_ = "";
    etag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteAttachedClusterRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AttachedServiceProto.internal_static_google_cloud_gkemulticloud_v1_DeleteAttachedClusterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AttachedServiceProto.internal_static_google_cloud_gkemulticloud_v1_DeleteAttachedClusterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest.class, com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. The resource name the
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] to delete.
   * `AttachedCluster` names are formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/attachedClusters/&lt;cluster-id&gt;`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on GCP resource names.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name the
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] to delete.
   * `AttachedCluster` names are formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/attachedClusters/&lt;cluster-id&gt;`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on GCP resource names.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 2;
  private boolean validateOnly_;
  /**
   * <pre>
   * If set, only validate the request, but do not actually delete the resource.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
  }

  public static final int ALLOW_MISSING_FIELD_NUMBER = 3;
  private boolean allowMissing_;
  /**
   * <pre>
   * If set to true, and the
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
   * is not found, the request will succeed but no action will be taken on the
   * server and a completed [Operation][google.longrunning.Operation] will be
   * returned.
   * Useful for idempotent deletion.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   * @return The allowMissing.
   */
  @java.lang.Override
  public boolean getAllowMissing() {
    return allowMissing_;
  }

  public static final int IGNORE_ERRORS_FIELD_NUMBER = 5;
  private boolean ignoreErrors_;
  /**
   * <pre>
   * If set to true, the deletion of
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
   * will succeed even if errors occur during deleting in cluster resources.
   * Using this parameter may result in orphaned resources in the cluster.
   * </pre>
   *
   * <code>bool ignore_errors = 5;</code>
   * @return The ignoreErrors.
   */
  @java.lang.Override
  public boolean getIgnoreErrors() {
    return ignoreErrors_;
  }

  public static final int ETAG_FIELD_NUMBER = 4;
  private volatile java.lang.Object etag_;
  /**
   * <pre>
   * The current etag of the
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster].
   * Allows clients to perform deletions through optimistic concurrency control.
   * If the provided etag does not match the current etag of the cluster,
   * the request will fail and an ABORTED error will be returned.
   * </pre>
   *
   * <code>string etag = 4;</code>
   * @return The etag.
   */
  @java.lang.Override
  public java.lang.String getEtag() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      etag_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The current etag of the
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster].
   * Allows clients to perform deletions through optimistic concurrency control.
   * If the provided etag does not match the current etag of the cluster,
   * the request will fail and an ABORTED error will be returned.
   * </pre>
   *
   * <code>string etag = 4;</code>
   * @return The bytes for etag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEtagBytes() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      etag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (validateOnly_ != false) {
      output.writeBool(2, validateOnly_);
    }
    if (allowMissing_ != false) {
      output.writeBool(3, allowMissing_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(etag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, etag_);
    }
    if (ignoreErrors_ != false) {
      output.writeBool(5, ignoreErrors_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, validateOnly_);
    }
    if (allowMissing_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, allowMissing_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(etag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, etag_);
    }
    if (ignoreErrors_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, ignoreErrors_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest other = (com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
    if (getAllowMissing()
        != other.getAllowMissing()) return false;
    if (getIgnoreErrors()
        != other.getIgnoreErrors()) return false;
    if (!getEtag()
        .equals(other.getEtag())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (37 * hash) + ALLOW_MISSING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowMissing());
    hash = (37 * hash) + IGNORE_ERRORS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIgnoreErrors());
    hash = (37 * hash) + ETAG_FIELD_NUMBER;
    hash = (53 * hash) + getEtag().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for `AttachedClusters.DeleteAttachedCluster` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest)
      com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AttachedServiceProto.internal_static_google_cloud_gkemulticloud_v1_DeleteAttachedClusterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AttachedServiceProto.internal_static_google_cloud_gkemulticloud_v1_DeleteAttachedClusterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest.class, com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      validateOnly_ = false;

      allowMissing_ = false;

      ignoreErrors_ = false;

      etag_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AttachedServiceProto.internal_static_google_cloud_gkemulticloud_v1_DeleteAttachedClusterRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest build() {
      com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest buildPartial() {
      com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest result = new com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest(this);
      result.name_ = name_;
      result.validateOnly_ = validateOnly_;
      result.allowMissing_ = allowMissing_;
      result.ignoreErrors_ = ignoreErrors_;
      result.etag_ = etag_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest other) {
      if (other == com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
      }
      if (other.getAllowMissing() != false) {
        setAllowMissing(other.getAllowMissing());
      }
      if (other.getIgnoreErrors() != false) {
        setIgnoreErrors(other.getIgnoreErrors());
      }
      if (!other.getEtag().isEmpty()) {
        etag_ = other.etag_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              name_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 16: {
              validateOnly_ = input.readBool();

              break;
            } // case 16
            case 24: {
              allowMissing_ = input.readBool();

              break;
            } // case 24
            case 34: {
              etag_ = input.readStringRequireUtf8();

              break;
            } // case 34
            case 40: {
              ignoreErrors_ = input.readBool();

              break;
            } // case 40
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The resource name the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] to delete.
     * `AttachedCluster` names are formatted as
     * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/attachedClusters/&lt;cluster-id&gt;`.
     * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
     * for more details on GCP resource names.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] to delete.
     * `AttachedCluster` names are formatted as
     * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/attachedClusters/&lt;cluster-id&gt;`.
     * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
     * for more details on GCP resource names.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] to delete.
     * `AttachedCluster` names are formatted as
     * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/attachedClusters/&lt;cluster-id&gt;`.
     * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
     * for more details on GCP resource names.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] to delete.
     * `AttachedCluster` names are formatted as
     * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/attachedClusters/&lt;cluster-id&gt;`.
     * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
     * for more details on GCP resource names.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] to delete.
     * `AttachedCluster` names are formatted as
     * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/attachedClusters/&lt;cluster-id&gt;`.
     * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
     * for more details on GCP resource names.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * If set, only validate the request, but do not actually delete the resource.
     * </pre>
     *
     * <code>bool validate_only = 2;</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * If set, only validate the request, but do not actually delete the resource.
     * </pre>
     *
     * <code>bool validate_only = 2;</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {
      
      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, only validate the request, but do not actually delete the resource.
     * </pre>
     *
     * <code>bool validate_only = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      
      validateOnly_ = false;
      onChanged();
      return this;
    }

    private boolean allowMissing_ ;
    /**
     * <pre>
     * If set to true, and the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
     * is not found, the request will succeed but no action will be taken on the
     * server and a completed [Operation][google.longrunning.Operation] will be
     * returned.
     * Useful for idempotent deletion.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @return The allowMissing.
     */
    @java.lang.Override
    public boolean getAllowMissing() {
      return allowMissing_;
    }
    /**
     * <pre>
     * If set to true, and the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
     * is not found, the request will succeed but no action will be taken on the
     * server and a completed [Operation][google.longrunning.Operation] will be
     * returned.
     * Useful for idempotent deletion.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @param value The allowMissing to set.
     * @return This builder for chaining.
     */
    public Builder setAllowMissing(boolean value) {
      
      allowMissing_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to true, and the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
     * is not found, the request will succeed but no action will be taken on the
     * server and a completed [Operation][google.longrunning.Operation] will be
     * returned.
     * Useful for idempotent deletion.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowMissing() {
      
      allowMissing_ = false;
      onChanged();
      return this;
    }

    private boolean ignoreErrors_ ;
    /**
     * <pre>
     * If set to true, the deletion of
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
     * will succeed even if errors occur during deleting in cluster resources.
     * Using this parameter may result in orphaned resources in the cluster.
     * </pre>
     *
     * <code>bool ignore_errors = 5;</code>
     * @return The ignoreErrors.
     */
    @java.lang.Override
    public boolean getIgnoreErrors() {
      return ignoreErrors_;
    }
    /**
     * <pre>
     * If set to true, the deletion of
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
     * will succeed even if errors occur during deleting in cluster resources.
     * Using this parameter may result in orphaned resources in the cluster.
     * </pre>
     *
     * <code>bool ignore_errors = 5;</code>
     * @param value The ignoreErrors to set.
     * @return This builder for chaining.
     */
    public Builder setIgnoreErrors(boolean value) {
      
      ignoreErrors_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to true, the deletion of
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
     * will succeed even if errors occur during deleting in cluster resources.
     * Using this parameter may result in orphaned resources in the cluster.
     * </pre>
     *
     * <code>bool ignore_errors = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIgnoreErrors() {
      
      ignoreErrors_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object etag_ = "";
    /**
     * <pre>
     * The current etag of the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster].
     * Allows clients to perform deletions through optimistic concurrency control.
     * If the provided etag does not match the current etag of the cluster,
     * the request will fail and an ABORTED error will be returned.
     * </pre>
     *
     * <code>string etag = 4;</code>
     * @return The etag.
     */
    public java.lang.String getEtag() {
      java.lang.Object ref = etag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        etag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The current etag of the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster].
     * Allows clients to perform deletions through optimistic concurrency control.
     * If the provided etag does not match the current etag of the cluster,
     * the request will fail and an ABORTED error will be returned.
     * </pre>
     *
     * <code>string etag = 4;</code>
     * @return The bytes for etag.
     */
    public com.google.protobuf.ByteString
        getEtagBytes() {
      java.lang.Object ref = etag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        etag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The current etag of the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster].
     * Allows clients to perform deletions through optimistic concurrency control.
     * If the provided etag does not match the current etag of the cluster,
     * the request will fail and an ABORTED error will be returned.
     * </pre>
     *
     * <code>string etag = 4;</code>
     * @param value The etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      etag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The current etag of the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster].
     * Allows clients to perform deletions through optimistic concurrency control.
     * If the provided etag does not match the current etag of the cluster,
     * the request will fail and an ABORTED error will be returned.
     * </pre>
     *
     * <code>string etag = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEtag() {
      
      etag_ = getDefaultInstance().getEtag();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The current etag of the
     * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster].
     * Allows clients to perform deletions through optimistic concurrency control.
     * If the provided etag does not match the current etag of the cluster,
     * the request will fail and an ABORTED error will be returned.
     * </pre>
     *
     * <code>string etag = 4;</code>
     * @param value The bytes for etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      etag_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest)
  private static final com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest();
  }

  public static com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteAttachedClusterRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteAttachedClusterRequest>() {
    @java.lang.Override
    public DeleteAttachedClusterRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DeleteAttachedClusterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteAttachedClusterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.DeleteAttachedClusterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

