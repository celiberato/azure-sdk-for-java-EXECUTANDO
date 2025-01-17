// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.OperationStatusResourceGroupContextsClient;
import com.azure.resourcemanager.dataprotection.fluent.models.OperationResourceInner;
import com.azure.resourcemanager.dataprotection.models.OperationResource;
import com.azure.resourcemanager.dataprotection.models.OperationStatusResourceGroupContexts;

public final class OperationStatusResourceGroupContextsImpl implements OperationStatusResourceGroupContexts {
    private static final ClientLogger LOGGER = new ClientLogger(OperationStatusResourceGroupContextsImpl.class);

    private final OperationStatusResourceGroupContextsClient innerClient;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public OperationStatusResourceGroupContextsImpl(
        OperationStatusResourceGroupContextsClient innerClient,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<OperationResource> getByResourceGroupWithResponse(
        String resourceGroupName, String operationId, Context context) {
        Response<OperationResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OperationResource getByResourceGroup(String resourceGroupName, String operationId) {
        OperationResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, operationId);
        if (inner != null) {
            return new OperationResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private OperationStatusResourceGroupContextsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }
}
