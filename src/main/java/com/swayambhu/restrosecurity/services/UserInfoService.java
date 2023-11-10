package com.swayambhu.restrosecurity.services;

import com.swayambhu.restrosecurity.entities.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserInfoService extends UserDetailsService {

    public void addUser(UserInfo userInfo);

}
