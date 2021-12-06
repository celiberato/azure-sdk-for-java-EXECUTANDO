// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Service Endpoint policy definitions. */
@Fluent
public final class ServiceEndpointPolicyDefinitionInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceEndpointPolicyDefinitionInner.class);

    /*
     * Properties of the service endpoint policy definition
     */
    @JsonProperty(value = "properties")
    private ServiceEndpointPolicyDefinitionPropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the innerProperties property: Properties of the service endpoint policy definition.
     *
     * @return the innerProperties value.
     */
    private ServiceEndpointPolicyDefinitionPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceEndpointPolicyDefinitionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the description property: A description for this rule. Restricted to 140 chars.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description for this rule. Restricted to 140 chars.
     *
     * @param description the description value to set.
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceEndpointPolicyDefinitionPropertiesFormat();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the service property: service endpoint name.
     *
     * @return the service value.
     */
    public String service() {
        return this.innerProperties() == null ? null : this.innerProperties().service();
    }

    /**
     * Set the service property: service endpoint name.
     *
     * @param service the service value to set.
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withService(String service) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceEndpointPolicyDefinitionPropertiesFormat();
        }
        this.innerProperties().withService(service);
        return this;
    }

    /**
     * Get the serviceResources property: A list of service resources.
     *
     * @return the serviceResources value.
     */
    public List<String> serviceResources() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceResources();
    }

    /**
     * Set the serviceResources property: A list of service resources.
     *
     * @param serviceResources the serviceResources value to set.
     * @return the ServiceEndpointPolicyDefinitionInner object itself.
     */
    public ServiceEndpointPolicyDefinitionInner withServiceResources(List<String> serviceResources) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceEndpointPolicyDefinitionPropertiesFormat();
        }
        this.innerProperties().withServiceResources(serviceResources);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the service end point policy definition. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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