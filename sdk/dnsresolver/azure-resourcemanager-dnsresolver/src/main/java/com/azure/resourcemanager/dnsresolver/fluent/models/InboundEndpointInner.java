// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dnsresolver.models.IpConfiguration;
import com.azure.resourcemanager.dnsresolver.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes an inbound endpoint for a DNS resolver. */
@Fluent
public final class InboundEndpointInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InboundEndpointInner.class);

    /*
     * ETag of the inbound endpoint.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Properties of the inbound endpoint.
     */
    @JsonProperty(value = "properties")
    private InboundEndpointProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the etag property: ETag of the inbound endpoint.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the innerProperties property: Properties of the inbound endpoint.
     *
     * @return the innerProperties value.
     */
    private InboundEndpointProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public InboundEndpointInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InboundEndpointInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the ipConfigurations property: IP configurations for the inbound endpoint.
     *
     * @return the ipConfigurations value.
     */
    public List<IpConfiguration> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: IP configurations for the inbound endpoint.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the InboundEndpointInner object itself.
     */
    public InboundEndpointInner withIpConfigurations(List<IpConfiguration> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundEndpointProperties();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the provisioningState property: The current provisioning state of the inbound endpoint. This is a read-only
     * property and any attempt to set this value will be ignored.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceGuid property: The resourceGuid property of the inbound endpoint resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
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