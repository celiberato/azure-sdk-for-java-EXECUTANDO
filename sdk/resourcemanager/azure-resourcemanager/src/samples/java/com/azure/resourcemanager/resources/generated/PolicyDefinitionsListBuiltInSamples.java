// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;

/** Samples for PolicyDefinitions ListBuiltIn. */
public final class PolicyDefinitionsListBuiltInSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2021-06-01/examples/listBuiltInPolicyDefinitions.json
     */
    /**
     * Sample code: List built-in policy definitions.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listBuiltInPolicyDefinitions(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources().manager().policyClient().getPolicyDefinitions().listBuiltIn(null, null, Context.NONE);
    }
}