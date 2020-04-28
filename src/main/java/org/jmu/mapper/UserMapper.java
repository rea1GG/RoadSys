package org.jmu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.jmu.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //安卓用户登录
    public User selectUserByName(String userName);
    //用户登录
    public int userLogin(User user);
    //注册前提
    public int getUser(String userName);
    //用户注册
    public int regUserAcc(User user);
}