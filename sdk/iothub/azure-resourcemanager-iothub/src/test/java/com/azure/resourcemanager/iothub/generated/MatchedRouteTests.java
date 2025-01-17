// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.MatchedRoute;
import com.azure.resourcemanager.iothub.models.RouteProperties;
import com.azure.resourcemanager.iothub.models.RoutingSource;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MatchedRouteTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MatchedRoute model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"name\":\"gynduha\",\"source\":\"DigitalTwinChangeEvents\",\"condition\":\"lkthu\",\"endpointNames\":[\"qolbgyc\",\"uie\",\"tgccymvaolpss\",\"qlfmmdnbb\"],\"isEnabled\":true}}")
                .toObject(MatchedRoute.class);
        Assertions.assertEquals("gynduha", model.properties().name());
        Assertions.assertEquals(RoutingSource.DIGITAL_TWIN_CHANGE_EVENTS, model.properties().source());
        Assertions.assertEquals("lkthu", model.properties().condition());
        Assertions.assertEquals("qolbgyc", model.properties().endpointNames().get(0));
        Assertions.assertEquals(true, model.properties().isEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MatchedRoute model =
            new MatchedRoute()
                .withProperties(
                    new RouteProperties()
                        .withName("gynduha")
                        .withSource(RoutingSource.DIGITAL_TWIN_CHANGE_EVENTS)
                        .withCondition("lkthu")
                        .withEndpointNames(Arrays.asList("qolbgyc", "uie", "tgccymvaolpss", "qlfmmdnbb"))
                        .withIsEnabled(true));
        model = BinaryData.fromObject(model).toObject(MatchedRoute.class);
        Assertions.assertEquals("gynduha", model.properties().name());
        Assertions.assertEquals(RoutingSource.DIGITAL_TWIN_CHANGE_EVENTS, model.properties().source());
        Assertions.assertEquals("lkthu", model.properties().condition());
        Assertions.assertEquals("qolbgyc", model.properties().endpointNames().get(0));
        Assertions.assertEquals(true, model.properties().isEnabled());
    }
}
