// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.models.PrincipalType;
import com.azure.resourcemanager.authorization.models.RoleAssignmentCreateParameters;

/** Samples for RoleAssignments Create. */
public final class RoleAssignmentsCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2020-08-01-preview/examples/RoleAssignments_CreateForSubscription.json
     */
    /**
     * Sample code: Create role assignment for subscription.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createRoleAssignmentForSubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getRoleAssignments()
            .createWithResponse(
                "subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2",
                "05c5a614-a7d6-4502-b150-c2fb455033ff",
                new RoleAssignmentCreateParameters()
                    .withRoleDefinitionId(
                        "/subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/providers/Microsoft.Authorization/roleDefinitions/0b5fe924-9a61-425c-96af-cfe6e287ca2d")
                    .withPrincipalId("ce2ce14e-85d7-4629-bdbc-454d0519d987")
                    .withPrincipalType(PrincipalType.USER),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2020-08-01-preview/examples/RoleAssignments_CreateForResourceGroup.json
     */
    /**
     * Sample code: Create role assignment for resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createRoleAssignmentForResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getRoleAssignments()
            .createWithResponse(
                "subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/resourceGroups/testrg",
                "05c5a614-a7d6-4502-b150-c2fb455033ff",
                new RoleAssignmentCreateParameters()
                    .withRoleDefinitionId(
                        "/subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/providers/Microsoft.Authorization/roleDefinitions/0b5fe924-9a61-425c-96af-cfe6e287ca2d")
                    .withPrincipalId("ce2ce14e-85d7-4629-bdbc-454d0519d987")
                    .withPrincipalType(PrincipalType.USER),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2020-08-01-preview/examples/RoleAssignments_CreateForResource.json
     */
    /**
     * Sample code: Create role assignment for resource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createRoleAssignmentForResource(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getRoleAssignments()
            .createWithResponse(
                "subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/resourceGroups/testrg/providers/Microsoft.DocumentDb/databaseAccounts/test-db-account",
                "05c5a614-a7d6-4502-b150-c2fb455033ff",
                new RoleAssignmentCreateParameters()
                    .withRoleDefinitionId(
                        "/subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/providers/Microsoft.Authorization/roleDefinitions/0b5fe924-9a61-425c-96af-cfe6e287ca2d")
                    .withPrincipalId("ce2ce14e-85d7-4629-bdbc-454d0519d987")
                    .withPrincipalType(PrincipalType.USER),
                Context.NONE);
    }
}