package com.test.iottelemetry.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    Optional<UserInfo> findUserInfoByUsername(@Param("username") String username);

}
