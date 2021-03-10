package com.yxjz.hrxm.domestic.user.service;

import com.yxjz.hrxm.domestic.user.mapper.UserMapper;

public interface UserLogininfoService {
    UserMapper selectById(String userid);
   /* UserMapper selectByName(String username);*/
}
