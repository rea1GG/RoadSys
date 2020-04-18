package org.jmu.controller;


import org.apache.tomcat.util.Diagnostics;
import org.jmu.entity.User;
import org.jmu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public Object hello(){
        return "hi";
    }
    //登录
    @RequestMapping("/user/login")
    public boolean userLogin(User user){
        return userService.userLogin(user);
    }
    @RequestMapping("/user/register")
    public boolean regUserAcc(User user){
        return userService.regUserAcc(user);
    }
}
