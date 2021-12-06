// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.core.util.Context;

/** Samples for ContainerServices ListOrchestrators. */
public final class ContainerServicesListOrchestratorsSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/stable/2019-08-01/examples/ContainerServiceListOrchestrators.json
     */
    /**
     * Sample code: List Container Service Orchestrators.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listContainerServiceOrchestrators(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getContainerServices()
            .listOrchestratorsWithResponse("location1", null, Context.NONE);
    }
}