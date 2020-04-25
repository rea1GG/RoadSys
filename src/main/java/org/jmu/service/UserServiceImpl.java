package org.jmu.service;

import org.jmu.entity.User;
import org.jmu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean userLogin(User user) {
        return userMapper.userLogin(user)>0 ;
    }

    @Override
    public boolean regUserAcc(User user) {
        return userMapper.regUserAcc(user)>0;
    }

    @Override
    public User getUser(String userName) {
        return userMapper.selectUserByName(userName);
    }
}
