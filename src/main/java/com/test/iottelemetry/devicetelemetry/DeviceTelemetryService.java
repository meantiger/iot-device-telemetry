package com.test.iottelemetry.devicetelemetry;

import com.microsoft.azure.spring.data.cosmosdb.core.query.DocumentDbPageRequest;
import com.test.iottelemetry.Common.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class DeviceTelemetryService {

    @Autowired
    private DeviceTelemetryRepository deviceTelemetryRepository;


    public CommonResponse getDeviceTelemetry(String azureDeviceId, long from, long to){
        Pageable pageable = null;

        pageable = DocumentDbPageRequest.of(0, 10, new Sort(Sort.Direction.DESC, "date"));

        Page<DeviceTelemetry> ret = deviceTelemetryRepository.findDeviceTelemetryByServiceIdAndDeviceIdAndDateBetween(azureDeviceId, from,to,pageable);

        return new CommonResponse(ret.stream().collect(Collectors.toList()));
    }

}
