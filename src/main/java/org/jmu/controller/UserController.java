package org.jmu.controller;


//import org.apache.tomcat.util.Diagnostics;
import org.jmu.entity.ResponseEntity;
import org.jmu.entity.User;
import org.jmu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@ResponseBody
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
    public ResponseEntity get(@RequestBody User user){
        ResponseEntity responseEntity = new ResponseEntity();
        String password = userService.getUser(user.getUserName()).getUserPassword();
        user.setUserId(userService.getUser(user.getUserName()).getUserId());
        if (user.getUserPassword().equals(password)){
            responseEntity.setCode(200);
            responseEntity.setMsg("登录成功");
            responseEntity.setData(user);
        }else{
            responseEntity.setCode(300);
            responseEntity.setMsg("登录失败");
        }
        return responseEntity;
    }
    @RequestMapping("/android/reg/verify")
    public ResponseEntity verify(@RequestBody  User user){
        ResponseEntity responseEntity = new ResponseEntity();
        int tag = userService.getUserCountBeforeReg(user.getUserName());
        if(tag>0){
            responseEntity.setCode(300);
            responseEntity.setMsg("用户名重复");
        } else{
            responseEntity.setCode(200);
            responseEntity.setMsg("用户名可用");
        }
        return  responseEntity;
    }
    //安卓注册
    @RequestMapping("/android/register")
    public ResponseEntity register(@RequestBody User user){
        ResponseEntity responseEntity = new ResponseEntity();
        if(userService.regUserAcc(user)){
            responseEntity.setCode(200);
            responseEntity.setMsg("注册成功");
            responseEntity.setData(user);
        }else{
            responseEntity.setCode(300);
            responseEntity.setMsg("注册失败");
        }
        return responseEntity;
    }
    @RequestMapping("/user/register")
    public boolean regUserAcc(User user){
        return userService.regUserAcc(user);
    }
}
