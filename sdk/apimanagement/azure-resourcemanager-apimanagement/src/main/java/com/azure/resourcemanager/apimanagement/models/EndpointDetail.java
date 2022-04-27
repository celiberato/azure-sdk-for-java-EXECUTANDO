// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Current TCP connectivity information from the Api Management Service to a single endpoint. */
@Fluent
public final class EndpointDetail {
    /*
     * The port an endpoint is connected to.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * The region of the dependency.
     */
    @JsonProperty(value = "region")
    private String region;

    /**
     * Get the port property: The port an endpoint is connected to.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port an endpoint is connected to.
     *
     * @param port the port value to set.
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the region property: The region of the dependency.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: The region of the dependency.
     *
     * @param region the region value to set.
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}