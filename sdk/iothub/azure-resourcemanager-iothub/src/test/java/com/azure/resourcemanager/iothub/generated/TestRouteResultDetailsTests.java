// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.RouteCompilationError;
import com.azure.resourcemanager.iothub.models.RouteErrorRange;
import com.azure.resourcemanager.iothub.models.RouteErrorSeverity;
import com.azure.resourcemanager.iothub.models.TestRouteResultDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TestRouteResultDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TestRouteResultDetails model =
            BinaryData
                .fromString(
                    "{\"compilationErrors\":[{\"message\":\"ikdowwquuvx\",\"severity\":\"error\",\"location\":{}},{\"message\":\"hhqzonosgg\",\"severity\":\"error\",\"location\":{}}]}")
                .toObject(TestRouteResultDetails.class);
        Assertions.assertEquals("ikdowwquuvx", model.compilationErrors().get(0).message());
        Assertions.assertEquals(RouteErrorSeverity.ERROR, model.compilationErrors().get(0).severity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TestRouteResultDetails model =
            new TestRouteResultDetails()
                .withCompilationErrors(
                    Arrays
                        .asList(
                            new RouteCompilationError()
                                .withMessage("ikdowwquuvx")
                                .withSeverity(RouteErrorSeverity.ERROR)
                                .withLocation(new RouteErrorRange()),
                            new RouteCompilationError()
                                .withMessage("hhqzonosgg")
                                .withSeverity(RouteErrorSeverity.ERROR)
                                .withLocation(new RouteErrorRange())));
        model = BinaryData.fromObject(model).toObject(TestRouteResultDetails.class);
        Assertions.assertEquals("ikdowwquuvx", model.compilationErrors().get(0).message());
        Assertions.assertEquals(RouteErrorSeverity.ERROR, model.compilationErrors().get(0).severity());
    }
}
