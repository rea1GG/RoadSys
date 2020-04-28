package org.jmu.service;

import org.jmu.entity.User;

import java.util.List;

public interface UserService {
    //用户登录
    public boolean userLogin(User user);
    //用户注册
    public boolean regUserAcc(User user);
    //安卓用户登录
    public User getUser(String userName);
    //注册前看用户是否存在
    public int getUserCountBeforeReg(String userName);
}
