package com.test.iottelemetry.User;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfoService {

    @Autowired
    UserInfoRepository userInfoRepository;

    public UserInfo getUserInfo(String username) {

        Optional<UserInfo> ret = userInfoRepository.findUserInfoByUsername(username);
        UserInfo testuser = ret.orElse(new UserInfo());

        return testuser;

    }
}
