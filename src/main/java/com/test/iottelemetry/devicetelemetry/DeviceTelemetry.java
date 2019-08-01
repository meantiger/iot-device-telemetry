package com.test.iottelemetry.devicetelemetry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DeviceTelemetry {
    private String id;
    private String deviceId;
    private Object contents;
    private long date;
}
