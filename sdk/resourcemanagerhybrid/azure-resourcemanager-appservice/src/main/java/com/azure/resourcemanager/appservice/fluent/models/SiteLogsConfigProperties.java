// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ApplicationLogsConfig;
import com.azure.resourcemanager.appservice.models.EnabledConfig;
import com.azure.resourcemanager.appservice.models.HttpLogsConfig;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SiteLogsConfig resource specific properties. */
@Fluent
public final class SiteLogsConfigProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SiteLogsConfigProperties.class);

    /*
     * Application logs configuration.
     */
    @JsonProperty(value = "applicationLogs")
    private ApplicationLogsConfig applicationLogs;

    /*
     * HTTP logs configuration.
     */
    @JsonProperty(value = "httpLogs")
    private HttpLogsConfig httpLogs;

    /*
     * Failed requests tracing configuration.
     */
    @JsonProperty(value = "failedRequestsTracing")
    private EnabledConfig failedRequestsTracing;

    /*
     * Detailed error messages configuration.
     */
    @JsonProperty(value = "detailedErrorMessages")
    private EnabledConfig detailedErrorMessages;

    /**
     * Get the applicationLogs property: Application logs configuration.
     *
     * @return the applicationLogs value.
     */
    public ApplicationLogsConfig applicationLogs() {
        return this.applicationLogs;
    }

    /**
     * Set the applicationLogs property: Application logs configuration.
     *
     * @param applicationLogs the applicationLogs value to set.
     * @return the SiteLogsConfigProperties object itself.
     */
    public SiteLogsConfigProperties withApplicationLogs(ApplicationLogsConfig applicationLogs) {
        this.applicationLogs = applicationLogs;
        return this;
    }

    /**
     * Get the httpLogs property: HTTP logs configuration.
     *
     * @return the httpLogs value.
     */
    public HttpLogsConfig httpLogs() {
        return this.httpLogs;
    }

    /**
     * Set the httpLogs property: HTTP logs configuration.
     *
     * @param httpLogs the httpLogs value to set.
     * @return the SiteLogsConfigProperties object itself.
     */
    public SiteLogsConfigProperties withHttpLogs(HttpLogsConfig httpLogs) {
        this.httpLogs = httpLogs;
        return this;
    }

    /**
     * Get the failedRequestsTracing property: Failed requests tracing configuration.
     *
     * @return the failedRequestsTracing value.
     */
    public EnabledConfig failedRequestsTracing() {
        return this.failedRequestsTracing;
    }

    /**
     * Set the failedRequestsTracing property: Failed requests tracing configuration.
     *
     * @param failedRequestsTracing the failedRequestsTracing value to set.
     * @return the SiteLogsConfigProperties object itself.
     */
    public SiteLogsConfigProperties withFailedRequestsTracing(EnabledConfig failedRequestsTracing) {
        this.failedRequestsTracing = failedRequestsTracing;
        return this;
    }

    /**
     * Get the detailedErrorMessages property: Detailed error messages configuration.
     *
     * @return the detailedErrorMessages value.
     */
    public EnabledConfig detailedErrorMessages() {
        return this.detailedErrorMessages;
    }

    /**
     * Set the detailedErrorMessages property: Detailed error messages configuration.
     *
     * @param detailedErrorMessages the detailedErrorMessages value to set.
     * @return the SiteLogsConfigProperties object itself.
     */
    public SiteLogsConfigProperties withDetailedErrorMessages(EnabledConfig detailedErrorMessages) {
        this.detailedErrorMessages = detailedErrorMessages;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicationLogs() != null) {
            applicationLogs().validate();
        }
        if (httpLogs() != null) {
            httpLogs().validate();
        }
        if (failedRequestsTracing() != null) {
            failedRequestsTracing().validate();
        }
        if (detailedErrorMessages() != null) {
            detailedErrorMessages().validate();
        }
    }
}