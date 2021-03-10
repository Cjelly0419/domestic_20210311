package com.yxjz.hrxm.domestic.user.controller;

import com.yxjz.hrxm.domestic.user.mapper.UserMapper;
import com.yxjz.hrxm.domestic.user.service.UserLogininfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DimesticApplication {
    private UserLogininfoService userLogininfoService;
    @ResponseBody
    @RequestMapping("/test")
    public  String test(){
           return "test123";
    }

    @RequestMapping(value = "/login}", method = RequestMethod.GET)
    public UserMapper userLogin(String userid){
        /*断点调试*/
        System.out.println("调试成功");
        //return userLogininfoService.selectById(userid);
        return null;

    }
}
