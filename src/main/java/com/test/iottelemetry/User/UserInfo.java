package com.test.iottelemetry.User;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserInfo {

    private String id; //꼭 필요 --- azure 쓸때 이게 프라이머리 키로 지정됨.
    private String username;
    private String password;

}
