// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for Certificate Get. */
public final class CertificateGetSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementGetCertificateWithKeyVault.json
     */
    /**
     * Sample code: ApiManagementGetCertificateWithKeyVault.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetCertificateWithKeyVault(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.certificates().getWithResponse("rg1", "apimService1", "templateCertkv", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementGetCertificate.json
     */
    /**
     * Sample code: ApiManagementGetCertificate.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetCertificate(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.certificates().getWithResponse("rg1", "apimService1", "templateCert1", Context.NONE);
    }
}