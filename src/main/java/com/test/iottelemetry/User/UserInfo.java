package com.test.iottelemetry.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserInfo {

    @Id
    private String id; //꼭 필요 --- azure 쓸때 이게 프라이머리 키로 지정됨.
    private String username;
    private String password;

}
