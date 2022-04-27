// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicelinker.fluent.models.LinkerProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A linker to be updated. */
@Fluent
public final class LinkerPatch {
    /*
     * Linker properties
     */
    @JsonProperty(value = "properties")
    private LinkerProperties innerProperties;

    /**
     * Get the innerProperties property: Linker properties.
     *
     * @return the innerProperties value.
     */
    private LinkerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the targetService property: The target service properties.
     *
     * @return the targetService value.
     */
    public TargetServiceBase targetService() {
        return this.innerProperties() == null ? null : this.innerProperties().targetService();
    }

    /**
     * Set the targetService property: The target service properties.
     *
     * @param targetService the targetService value to set.
     * @return the LinkerPatch object itself.
     */
    public LinkerPatch withTargetService(TargetServiceBase targetService) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LinkerProperties();
        }
        this.innerProperties().withTargetService(targetService);
        return this;
    }

    /**
     * Get the authInfo property: The authentication type.
     *
     * @return the authInfo value.
     */
    public AuthInfoBase authInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().authInfo();
    }

    /**
     * Set the authInfo property: The authentication type.
     *
     * @param authInfo the authInfo value to set.
     * @return the LinkerPatch object itself.
     */
    public LinkerPatch withAuthInfo(AuthInfoBase authInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LinkerProperties();
        }
        this.innerProperties().withAuthInfo(authInfo);
        return this;
    }

    /**
     * Get the clientType property: The application client type.
     *
     * @return the clientType value.
     */
    public ClientType clientType() {
        return this.innerProperties() == null ? null : this.innerProperties().clientType();
    }

    /**
     * Set the clientType property: The application client type.
     *
     * @param clientType the clientType value to set.
     * @return the LinkerPatch object itself.
     */
    public LinkerPatch withClientType(ClientType clientType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LinkerProperties();
        }
        this.innerProperties().withClientType(clientType);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the vNetSolution property: The VNet solution.
     *
     * @return the vNetSolution value.
     */
    public VNetSolution vNetSolution() {
        return this.innerProperties() == null ? null : this.innerProperties().vNetSolution();
    }

    /**
     * Set the vNetSolution property: The VNet solution.
     *
     * @param vNetSolution the vNetSolution value to set.
     * @return the LinkerPatch object itself.
     */
    public LinkerPatch withVNetSolution(VNetSolution vNetSolution) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LinkerProperties();
        }
        this.innerProperties().withVNetSolution(vNetSolution);
        return this;
    }

    /**
     * Get the secretStore property: An option to store secret value in secure place.
     *
     * @return the secretStore value.
     */
    public SecretStore secretStore() {
        return this.innerProperties() == null ? null : this.innerProperties().secretStore();
    }

    /**
     * Set the secretStore property: An option to store secret value in secure place.
     *
     * @param secretStore the secretStore value to set.
     * @return the LinkerPatch object itself.
     */
    public LinkerPatch withSecretStore(SecretStore secretStore) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LinkerProperties();
        }
        this.innerProperties().withSecretStore(secretStore);
        return this;
    }

    /**
     * Get the scope property: connection scope in source service.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: connection scope in source service.
     *
     * @param scope the scope value to set.
     * @return the LinkerPatch object itself.
     */
    public LinkerPatch withScope(String scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LinkerProperties();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}