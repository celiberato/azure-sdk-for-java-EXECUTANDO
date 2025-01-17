// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of SecureScoreControlDefinitions. */
public interface SecureScoreControlDefinitions {
    /**
     * List the available security controls, their assessments, and the max score.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security controls definition as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecureScoreControlDefinitionItem> list();

    /**
     * List the available security controls, their assessments, and the max score.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security controls definition as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecureScoreControlDefinitionItem> list(Context context);

    /**
     * For a specified subscription, list the available security controls, their assessments, and the max score.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security controls definition as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecureScoreControlDefinitionItem> listBySubscription();

    /**
     * For a specified subscription, list the available security controls, their assessments, and the max score.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security controls definition as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecureScoreControlDefinitionItem> listBySubscription(Context context);
}
