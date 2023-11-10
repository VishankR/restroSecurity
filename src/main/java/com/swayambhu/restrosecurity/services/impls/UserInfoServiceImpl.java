package com.swayambhu.restrosecurity.services.impls;

import com.swayambhu.restrosecurity.entities.UserInfo;
import com.swayambhu.restrosecurity.repositories.UserInfoDao;
import com.swayambhu.restrosecurity.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserInfo> userDetail = userInfoDao.findByName(username);
        return userDetail.orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
    }

    @Override
    public void addUser(UserInfo userInfo){
        userInfo.setPassword(this.passwordEncoder.encode(userInfo.getPassword()));
        userInfoDao.save(userInfo);
    }
}
