// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The mapping of content type to a repo path. */
@Fluent
public final class ContentPathMap {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContentPathMap.class);

    /*
     * Content type.
     */
    @JsonProperty(value = "contentType")
    private ContentType contentType;

    /*
     * The path to the content.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Get the contentType property: Content type.
     *
     * @return the contentType value.
     */
    public ContentType contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: Content type.
     *
     * @param contentType the contentType value to set.
     * @return the ContentPathMap object itself.
     */
    public ContentPathMap withContentType(ContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the path property: The path to the content.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path to the content.
     *
     * @param path the path value to set.
     * @return the ContentPathMap object itself.
     */
    public ContentPathMap withPath(String path) {
        this.path = path;
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