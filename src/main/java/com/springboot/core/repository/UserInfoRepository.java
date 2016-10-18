package com.springboot.core.repository;

import com.springboot.core.bean.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * UserInfo持久化类;
 * Created by le.qi on 10/17/2016.
 */
public interface UserInfoRepository extends CrudRepository<UserInfo,Long> {

    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
