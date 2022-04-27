// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureadexternalidentities.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of GuestUsages. */
public interface GuestUsages {
    /**
     * Deletes a Guest Usages resource for the Microsoft.AzureActiveDirectory resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The initial domain name of the Azure AD B2C tenant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Deletes a Guest Usages resource for the Microsoft.AzureActiveDirectory resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The initial domain name of the Azure AD B2C tenant.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Gets a Guest Usages resource for the Microsoft.AzureActiveDirectory resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The initial domain name of the Azure AD B2C tenant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Guest Usages resource for the Microsoft.AzureActiveDirectory resource provider.
     */
    GuestUsagesResource getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Gets a Guest Usages resource for the Microsoft.AzureActiveDirectory resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The initial domain name of the Azure AD B2C tenant.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Guest Usages resource for the Microsoft.AzureActiveDirectory resource provider along with {@link
     *     Response}.
     */
    Response<GuestUsagesResource> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Gets Guest Usages resources under a subscription for the Microsoft.AzureActiveDirectory resource provider.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return guest Usages resources under a subscription for the Microsoft.AzureActiveDirectory resource provider as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<GuestUsagesResource> list();

    /**
     * Gets Guest Usages resources under a subscription for the Microsoft.AzureActiveDirectory resource provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return guest Usages resources under a subscription for the Microsoft.AzureActiveDirectory resource provider as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<GuestUsagesResource> list(Context context);

    /**
     * Gets Guest Usages resources under a resource group for the Microsoft.AzureActiveDirectory resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return guest Usages resources under a resource group for the Microsoft.AzureActiveDirectory resource provider as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<GuestUsagesResource> listByResourceGroup(String resourceGroupName);

    /**
     * Gets Guest Usages resources under a resource group for the Microsoft.AzureActiveDirectory resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return guest Usages resources under a resource group for the Microsoft.AzureActiveDirectory resource provider as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<GuestUsagesResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a Guest Usages resource for the Microsoft.AzureActiveDirectory resource provider.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Guest Usages resource for the Microsoft.AzureActiveDirectory resource provider along with {@link
     *     Response}.
     */
    GuestUsagesResource getById(String id);

    /**
     * Gets a Guest Usages resource for the Microsoft.AzureActiveDirectory resource provider.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Guest Usages resource for the Microsoft.AzureActiveDirectory resource provider along with {@link
     *     Response}.
     */
    Response<GuestUsagesResource> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Guest Usages resource for the Microsoft.AzureActiveDirectory resource provider.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Guest Usages resource for the Microsoft.AzureActiveDirectory resource provider.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new GuestUsagesResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new GuestUsagesResource definition.
     */
    GuestUsagesResource.DefinitionStages.Blank define(String name);
}