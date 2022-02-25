// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a server to forward the DNS queries to. */
@Fluent
public final class TargetDnsServer {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TargetDnsServer.class);

    /*
     * DNS server IP address.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * DNS server port.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the ipAddress property: DNS server IP address.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: DNS server IP address.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the TargetDnsServer object itself.
     */
    public TargetDnsServer withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the port property: DNS server port.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: DNS server port.
     *
     * @param port the port value to set.
     * @return the TargetDnsServer object itself.
     */
    public TargetDnsServer withPort(Integer port) {
        this.port = port;
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