// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for KnownSyslogDataSourceStreams. */
public final class KnownSyslogDataSourceStreams extends ExpandableStringEnum<KnownSyslogDataSourceStreams> {
    /** Static value Microsoft-Syslog for KnownSyslogDataSourceStreams. */
    public static final KnownSyslogDataSourceStreams MICROSOFT_SYSLOG = fromString("Microsoft-Syslog");

    /**
     * Creates or finds a KnownSyslogDataSourceStreams from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KnownSyslogDataSourceStreams.
     */
    @JsonCreator
    public static KnownSyslogDataSourceStreams fromString(String name) {
        return fromString(name, KnownSyslogDataSourceStreams.class);
    }

    /** @return known KnownSyslogDataSourceStreams values. */
    public static Collection<KnownSyslogDataSourceStreams> values() {
        return values(KnownSyslogDataSourceStreams.class);
    }
}