package com.test.iottelemetry.Common;

import java.util.List;

public class CommonResponse {
    List contents;


    public CommonResponse(List contents){
        this.contents = contents;
    }

    public List getContents() {
        return contents;
    }
}
