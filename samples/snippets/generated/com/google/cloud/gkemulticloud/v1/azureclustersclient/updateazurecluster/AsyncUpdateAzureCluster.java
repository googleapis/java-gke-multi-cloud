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

// [START gkemulticloud_v1_generated_azureclustersclient_updateazurecluster_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.gkemulticloud.v1.AzureCluster;
import com.google.cloud.gkemulticloud.v1.AzureClustersClient;
import com.google.cloud.gkemulticloud.v1.UpdateAzureClusterRequest;
import com.google.longrunning.Operation;
import com.google.protobuf.FieldMask;

public class AsyncUpdateAzureCluster {

  public static void main(String[] args) throws Exception {
    asyncUpdateAzureCluster();
  }

  public static void asyncUpdateAzureCluster() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AzureClustersClient azureClustersClient = AzureClustersClient.create()) {
      UpdateAzureClusterRequest request =
          UpdateAzureClusterRequest.newBuilder()
              .setAzureCluster(AzureCluster.newBuilder().build())
              .setValidateOnly(true)
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<Operation> future =
          azureClustersClient.updateAzureClusterCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END gkemulticloud_v1_generated_azureclustersclient_updateazurecluster_async]
