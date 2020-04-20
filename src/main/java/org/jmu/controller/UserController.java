package org.jmu.controller;


import org.apache.tomcat.util.Diagnostics;
import org.jmu.entity.ResponseEntity;
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
    @RequestMapping("/android/login")
    public ResponseEntity get(User user){
        ResponseEntity responseEntity = new ResponseEntity();
        User user1 = userService.getUser(user.getUserName());
        if (user.getUserPassword().equals(user1.getUserPassword())){
            responseEntity.setStatus(200);
            responseEntity.setMsg("登录成功");
            responseEntity.setData(user);
        }else{
            responseEntity.setStatus(300);
            responseEntity.setMsg("登录失败");
        }
        return responseEntity;
    }
    @RequestMapping("/user/register")
    public boolean regUserAcc(User user){
        return userService.regUserAcc(user);
    }
}
