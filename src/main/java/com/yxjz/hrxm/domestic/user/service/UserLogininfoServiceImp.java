package com.yxjz.hrxm.domestic.user.service;

import com.yxjz.hrxm.domestic.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserLogininfoServiceImp implements UserLogininfoService{
   @Autowired(required = false)
    private UserMapper usermapper;


    @Override
    public UserMapper selectById(String userid) {
        return usermapper.selectById(userid);
    }
}
