// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;

/** Samples for SubscriptionFeatureRegistrations List. */
public final class SubscriptionFeatureRegistrationsListSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Features/stable/2021-07-01/examples/FeatureRegistration/SubscriptionFeatureRegistrationLISTALL.json
     */
    /**
     * Sample code: Gets a list of feature registrations.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsAListOfFeatureRegistrations(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources().manager().featureClient().getSubscriptionFeatureRegistrations().list(Context.NONE);
    }
}