package org.jmu.entity;

import java.util.Date;

public class URRelation {
    private Integer urrId;

    private Integer userId;

    private Integer roadId;

    private String urrInfo;

    private String urrFirstpic;

    private String urrSecondpic;

    private String urrThirdpic;

    private Date urrTime;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getUrrId() {
        return urrId;
    }

    public void setUrrId(Integer urrId) {
        this.urrId = urrId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoadId() {
        return roadId;
    }

    public void setRoadId(Integer roadId) {
        this.roadId = roadId;
    }

    public String getUrrInfo() {
        return urrInfo;
    }

    public void setUrrInfo(String urrInfo) {
        this.urrInfo = urrInfo == null ? null : urrInfo.trim();
    }

    public String getUrrFirstpic() {
        return urrFirstpic;
    }

    public void setUrrFirstpic(String urrFirstpic) {
        this.urrFirstpic = urrFirstpic == null ? null : urrFirstpic.trim();
    }

    public String getUrrSecondpic() {
        return urrSecondpic;
    }

    public void setUrrSecondpic(String urrSecondpic) {
        this.urrSecondpic = urrSecondpic == null ? null : urrSecondpic.trim();
    }

    public String getUrrThirdpic() {
        return urrThirdpic;
    }

    public void setUrrThirdpic(String urrThirdpic) {
        this.urrThirdpic = urrThirdpic == null ? null : urrThirdpic.trim();
    }

    public Date getUrrTime() {
        return urrTime;
    }

    public void setUrrTime(Date urrTime) {
        this.urrTime = urrTime;
    }
}