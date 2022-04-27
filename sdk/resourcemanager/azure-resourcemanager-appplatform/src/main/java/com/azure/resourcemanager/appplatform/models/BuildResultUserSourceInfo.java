// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Reference to a build result. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BuildResult")
@Fluent
public final class BuildResultUserSourceInfo extends UserSourceInfo {
    /*
     * Resource id of an existing succeeded build result under the same Spring
     * instance.
     */
    @JsonProperty(value = "buildResultId")
    private String buildResultId;

    /**
     * Get the buildResultId property: Resource id of an existing succeeded build result under the same Spring instance.
     *
     * @return the buildResultId value.
     */
    public String buildResultId() {
        return this.buildResultId;
    }

    /**
     * Set the buildResultId property: Resource id of an existing succeeded build result under the same Spring instance.
     *
     * @param buildResultId the buildResultId value to set.
     * @return the BuildResultUserSourceInfo object itself.
     */
    public BuildResultUserSourceInfo withBuildResultId(String buildResultId) {
        this.buildResultId = buildResultId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BuildResultUserSourceInfo withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}