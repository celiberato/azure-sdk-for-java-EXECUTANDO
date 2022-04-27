// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureadexternalidentities.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for B2CResourceSkuTier. */
public final class B2CResourceSkuTier extends ExpandableStringEnum<B2CResourceSkuTier> {
    /** Static value A0 for B2CResourceSkuTier. */
    public static final B2CResourceSkuTier A0 = fromString("A0");

    /**
     * Creates or finds a B2CResourceSkuTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding B2CResourceSkuTier.
     */
    @JsonCreator
    public static B2CResourceSkuTier fromString(String name) {
        return fromString(name, B2CResourceSkuTier.class);
    }

    /** @return known B2CResourceSkuTier values. */
    public static Collection<B2CResourceSkuTier> values() {
        return values(B2CResourceSkuTier.class);
    }
}