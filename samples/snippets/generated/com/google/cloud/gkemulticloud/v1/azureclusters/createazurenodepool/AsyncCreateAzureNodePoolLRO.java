/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.gkemulticloud.v1.samples;

// [START gkemulticloud_v1_generated_AzureClusters_CreateAzureNodePool_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.gkemulticloud.v1.AzureClusterName;
import com.google.cloud.gkemulticloud.v1.AzureClustersClient;
import com.google.cloud.gkemulticloud.v1.AzureNodePool;
import com.google.cloud.gkemulticloud.v1.CreateAzureNodePoolRequest;
import com.google.cloud.gkemulticloud.v1.OperationMetadata;

public class AsyncCreateAzureNodePoolLRO {

  public static void main(String[] args) throws Exception {
    asyncCreateAzureNodePoolLRO();
  }

  public static void asyncCreateAzureNodePoolLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AzureClustersClient azureClustersClient = AzureClustersClient.create()) {
      CreateAzureNodePoolRequest request =
          CreateAzureNodePoolRequest.newBuilder()
              .setParent(
                  AzureClusterName.of("[PROJECT]", "[LOCATION]", "[AZURE_CLUSTER]").toString())
              .setAzureNodePool(AzureNodePool.newBuilder().build())
              .setAzureNodePoolId("azureNodePoolId-1766264088")
              .setValidateOnly(true)
              .build();
      OperationFuture<AzureNodePool, OperationMetadata> future =
          azureClustersClient.createAzureNodePoolOperationCallable().futureCall(request);
      // Do something.
      AzureNodePool response = future.get();
    }
  }
}
// [END gkemulticloud_v1_generated_AzureClusters_CreateAzureNodePool_LRO_async]
