// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Error object used by layers that have access to localized content, and propagate that to user. */
@Fluent
public final class UserFacingError {
    /*
     * Unique code for this error
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Additional related Errors
     */
    @JsonProperty(value = "details")
    private List<UserFacingError> details;

    /*
     * InnerError
     *
     * Inner Error
     */
    @JsonProperty(value = "innerError")
    private InnerError innerError;

    /*
     * Whether the operation will be retryable or not
     */
    @JsonProperty(value = "isRetryable")
    private Boolean isRetryable;

    /*
     * Whether the operation is due to a user error or service error
     */
    @JsonProperty(value = "isUserError")
    private Boolean isUserError;

    /*
     * Any key value pairs that can be injected inside error object
     */
    @JsonProperty(value = "properties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> properties;

    /*
     * The message property.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * RecommendedAction � localized.
     */
    @JsonProperty(value = "recommendedAction")
    private List<String> recommendedAction;

    /*
     * Target of the error.
     */
    @JsonProperty(value = "target")
    private String target;

    /** Creates an instance of UserFacingError class. */
    public UserFacingError() {
    }

    /**
     * Get the code property: Unique code for this error.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Unique code for this error.
     *
     * @param code the code value to set.
     * @return the UserFacingError object itself.
     */
    public UserFacingError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the details property: Additional related Errors.
     *
     * @return the details value.
     */
    public List<UserFacingError> details() {
        return this.details;
    }

    /**
     * Set the details property: Additional related Errors.
     *
     * @param details the details value to set.
     * @return the UserFacingError object itself.
     */
    public UserFacingError withDetails(List<UserFacingError> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the innerError property: InnerError
     *
     * <p>Inner Error.
     *
     * @return the innerError value.
     */
    public InnerError innerError() {
        return this.innerError;
    }

    /**
     * Set the innerError property: InnerError
     *
     * <p>Inner Error.
     *
     * @param innerError the innerError value to set.
     * @return the UserFacingError object itself.
     */
    public UserFacingError withInnerError(InnerError innerError) {
        this.innerError = innerError;
        return this;
    }

    /**
     * Get the isRetryable property: Whether the operation will be retryable or not.
     *
     * @return the isRetryable value.
     */
    public Boolean isRetryable() {
        return this.isRetryable;
    }

    /**
     * Set the isRetryable property: Whether the operation will be retryable or not.
     *
     * @param isRetryable the isRetryable value to set.
     * @return the UserFacingError object itself.
     */
    public UserFacingError withIsRetryable(Boolean isRetryable) {
        this.isRetryable = isRetryable;
        return this;
    }

    /**
     * Get the isUserError property: Whether the operation is due to a user error or service error.
     *
     * @return the isUserError value.
     */
    public Boolean isUserError() {
        return this.isUserError;
    }

    /**
     * Set the isUserError property: Whether the operation is due to a user error or service error.
     *
     * @param isUserError the isUserError value to set.
     * @return the UserFacingError object itself.
     */
    public UserFacingError withIsUserError(Boolean isUserError) {
        this.isUserError = isUserError;
        return this;
    }

    /**
     * Get the properties property: Any key value pairs that can be injected inside error object.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Any key value pairs that can be injected inside error object.
     *
     * @param properties the properties value to set.
     * @return the UserFacingError object itself.
     */
    public UserFacingError withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the message property: The message property.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The message property.
     *
     * @param message the message value to set.
     * @return the UserFacingError object itself.
     */
    public UserFacingError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the recommendedAction property: RecommendedAction � localized.
     *
     * @return the recommendedAction value.
     */
    public List<String> recommendedAction() {
        return this.recommendedAction;
    }

    /**
     * Set the recommendedAction property: RecommendedAction � localized.
     *
     * @param recommendedAction the recommendedAction value to set.
     * @return the UserFacingError object itself.
     */
    public UserFacingError withRecommendedAction(List<String> recommendedAction) {
        this.recommendedAction = recommendedAction;
        return this;
    }

    /**
     * Get the target property: Target of the error.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: Target of the error.
     *
     * @param target the target value to set.
     * @return the UserFacingError object itself.
     */
    public UserFacingError withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
        if (innerError() != null) {
            innerError().validate();
        }
    }
}
