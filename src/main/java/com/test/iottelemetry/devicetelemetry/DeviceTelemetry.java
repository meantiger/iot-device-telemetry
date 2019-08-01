package com.test.iottelemetry.devicetelemetry;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class DeviceTelemetry {
    @Id
    private String id;
    private String deviceId;
    private String serviceId;
    private Object contents;
    private long date;
}
