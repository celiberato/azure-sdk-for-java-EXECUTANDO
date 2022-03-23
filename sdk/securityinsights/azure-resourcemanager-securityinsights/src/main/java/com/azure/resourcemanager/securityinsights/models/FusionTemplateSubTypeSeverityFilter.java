// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents severity configurations available for a source subtype consumed in Fusion detection. */
@Fluent
public final class FusionTemplateSubTypeSeverityFilter {
    /*
     * Determines whether severity configuration is supported for this source
     * subtype consumed in Fusion detection.
     */
    @JsonProperty(value = "isSupported", required = true)
    private boolean isSupported;

    /*
     * List of all supported severities for this source subtype consumed in
     * Fusion detection.
     */
    @JsonProperty(value = "severityFilters")
    private List<AlertSeverity> severityFilters;

    /**
     * Get the isSupported property: Determines whether severity configuration is supported for this source subtype
     * consumed in Fusion detection.
     *
     * @return the isSupported value.
     */
    public boolean isSupported() {
        return this.isSupported;
    }

    /**
     * Set the isSupported property: Determines whether severity configuration is supported for this source subtype
     * consumed in Fusion detection.
     *
     * @param isSupported the isSupported value to set.
     * @return the FusionTemplateSubTypeSeverityFilter object itself.
     */
    public FusionTemplateSubTypeSeverityFilter withIsSupported(boolean isSupported) {
        this.isSupported = isSupported;
        return this;
    }

    /**
     * Get the severityFilters property: List of all supported severities for this source subtype consumed in Fusion
     * detection.
     *
     * @return the severityFilters value.
     */
    public List<AlertSeverity> severityFilters() {
        return this.severityFilters;
    }

    /**
     * Set the severityFilters property: List of all supported severities for this source subtype consumed in Fusion
     * detection.
     *
     * @param severityFilters the severityFilters value to set.
     * @return the FusionTemplateSubTypeSeverityFilter object itself.
     */
    public FusionTemplateSubTypeSeverityFilter withSeverityFilters(List<AlertSeverity> severityFilters) {
        this.severityFilters = severityFilters;
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