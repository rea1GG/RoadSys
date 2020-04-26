package org.jmu.entity;

import java.util.Set;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    //一对多个关系，一个用户可以提交多个道路养护信息。需要在一的一方添加一个多的set
//    private Set<ProtectRoad> protectRoadset;

//    public Set<ProtectRoad> getProtectRoadset() {
//        return protectRoadset;
//    }
//
//    public void setProtectRoadset(Set<ProtectRoad> protectRoadset) {
//        this.protectRoadset = protectRoadset;
//    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}