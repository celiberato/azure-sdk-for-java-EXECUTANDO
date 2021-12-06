// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Service Principal Object Result. */
@Fluent
public final class ServicePrincipalObjectResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServicePrincipalObjectResultInner.class);

    /*
     * The Object ID of the service principal with the specified application
     * ID.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * The URL representing edm equivalent.
     */
    @JsonProperty(value = "odata.metadata")
    private String odataMetadata;

    /**
     * Get the value property: The Object ID of the service principal with the specified application ID.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The Object ID of the service principal with the specified application ID.
     *
     * @param value the value value to set.
     * @return the ServicePrincipalObjectResultInner object itself.
     */
    public ServicePrincipalObjectResultInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataMetadata property: The URL representing edm equivalent.
     *
     * @return the odataMetadata value.
     */
    public String odataMetadata() {
        return this.odataMetadata;
    }

    /**
     * Set the odataMetadata property: The URL representing edm equivalent.
     *
     * @param odataMetadata the odataMetadata value to set.
     * @return the ServicePrincipalObjectResultInner object itself.
     */
    public ServicePrincipalObjectResultInner withOdataMetadata(String odataMetadata) {
        this.odataMetadata = odataMetadata;
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