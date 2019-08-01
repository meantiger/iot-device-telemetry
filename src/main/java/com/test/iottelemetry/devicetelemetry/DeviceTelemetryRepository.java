package com.test.iottelemetry.devicetelemetry;

import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface DeviceTelemetryRepository extends DocumentDbRepository<DeviceTelemetry, String> {

    Page<DeviceTelemetry> findDeviceTelemetryByServiceIdAndDeviceIdAndDateBetween(@Param("azureDeviceId") String azureDeviceId,
                                                                                  @Param("from") long from,
                                                                                  @Param("to") long to    , Pageable request);

}

