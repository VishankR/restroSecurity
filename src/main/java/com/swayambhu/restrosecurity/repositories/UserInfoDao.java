package com.swayambhu.restrosecurity.repositories;

import com.swayambhu.restrosecurity.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoDao extends JpaRepository<UserInfo, Long> {
    Optional<UserInfo> findByName(String username);
}
