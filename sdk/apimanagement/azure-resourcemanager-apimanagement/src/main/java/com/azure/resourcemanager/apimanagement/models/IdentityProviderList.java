// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.fluent.models.IdentityProviderContractInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of all the Identity Providers configured on the service instance. */
@Fluent
public final class IdentityProviderList {
    /*
     * Identity Provider configuration values.
     */
    @JsonProperty(value = "value")
    private List<IdentityProviderContractInner> value;

    /*
     * Total record count number across all pages.
     */
    @JsonProperty(value = "count")
    private Long count;

    /*
     * Next page link if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Identity Provider configuration values.
     *
     * @return the value value.
     */
    public List<IdentityProviderContractInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Identity Provider configuration values.
     *
     * @param value the value value to set.
     * @return the IdentityProviderList object itself.
     */
    public IdentityProviderList withValue(List<IdentityProviderContractInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the count property: Total record count number across all pages.
     *
     * @return the count value.
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set the count property: Total record count number across all pages.
     *
     * @param count the count value to set.
     * @return the IdentityProviderList object itself.
     */
    public IdentityProviderList withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get the nextLink property: Next page link if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Next page link if any.
     *
     * @param nextLink the nextLink value to set.
     * @return the IdentityProviderList object itself.
     */
    public IdentityProviderList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
