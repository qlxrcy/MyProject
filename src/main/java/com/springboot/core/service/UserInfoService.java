package com.springboot.core.service;

import com.springboot.core.bean.UserInfo;

/**
 * Created by le.qi on 10/17/2016.
 */
public interface UserInfoService {

    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
