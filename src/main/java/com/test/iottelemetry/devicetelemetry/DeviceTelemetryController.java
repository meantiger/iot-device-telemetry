package com.test.iottelemetry.devicetelemetry;

import com.test.iottelemetry.Common.CommonResponse;
import com.test.iottelemetry.User.UserInfo;
import com.test.iottelemetry.User.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/")
public class DeviceTelemetryController {

    @Autowired
    private DeviceTelemetryService deviceTelemetryService;

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/{username}/telemetry",method = RequestMethod.GET)
    public @ResponseBody
    UserInfo getUserInfo(@PathVariable("username") String username){
        UserInfo result = userInfoService.getUserInfo(username);

        return result;
    }


    @RequestMapping(value="/{azureDeviceId}/telemetry", method= RequestMethod.GET)
    public @ResponseBody
    CommonResponse getDeviceTelemetry(@PathVariable("azureDeviceId") String azureDeviceId,
                                      @RequestParam("from") long from,
                                      @RequestParam("to") long to) {

        CommonResponse result = deviceTelemetryService.getDeviceTelemetry(azureDeviceId,from,to);

        return  result;
    }
}