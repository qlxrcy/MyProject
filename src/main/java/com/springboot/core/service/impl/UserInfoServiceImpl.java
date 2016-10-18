package com.springboot.core.service.impl;

import com.springboot.core.bean.UserInfo;
import com.springboot.core.repository.UserInfoRepository;
import com.springboot.core.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by le.qi on 10/17/2016.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoRepository.findByUsername(username);
    }
}
