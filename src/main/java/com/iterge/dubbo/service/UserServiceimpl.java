package com.iterge.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.entity.User;
import dubbo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Administrator on 2019/4/7.
 */
//这里的@Service注解不是Spring注解而是com.alibaba.dubbo.config.annotation.Service;
@Service
public class UserServiceimpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceimpl.class);

    @Override
    public User getUser(User user) {
        user.setId("1");
        user.setName("iterge");
        user.setPwd("123456");
        return user;
    }

    @Override
    public String getStr() {
        return "hello";
    }
}
