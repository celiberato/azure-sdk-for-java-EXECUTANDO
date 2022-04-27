// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.marketplaceordering.generated;

import com.azure.core.util.Context;

/** Samples for MarketplaceAgreements GetAgreement. */
public final class MarketplaceAgreementsGetAgreementSamples {
    /*
     * x-ms-original-file: specification/marketplaceordering/resource-manager/Microsoft.MarketplaceOrdering/stable/2021-01-01/examples/GetAgreementMarketplaceTerms.json
     */
    /**
     * Sample code: SetMarketplaceTerms.
     *
     * @param manager Entry point to MarketplaceOrderingManager.
     */
    public static void setMarketplaceTerms(
        com.azure.resourcemanager.marketplaceordering.MarketplaceOrderingManager manager) {
        manager.marketplaceAgreements().getAgreementWithResponse("pubid", "offid", "planid", Context.NONE);
    }
}