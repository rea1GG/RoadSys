package org.jmu.entity;

import java.util.Date;

public class ProtectRoad {
    private Integer prId;

    private Integer userId;

    private Integer roadId;

    private Date prTime;

    private String prInfo;

    private String prPic;

    private Integer prOverTag;

    public Integer getPrId() {
        return prId;
    }

    public void setPrId(Integer prId) {
        this.prId = prId;
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

    public Date getPrTime() {
        return prTime;
    }

    public void setPrTime(Date prTime) {
        this.prTime = prTime;
    }

    public String getPrInfo() {
        return prInfo;
    }

    public void setPrInfo(String prInfo) {
        this.prInfo = prInfo == null ? null : prInfo.trim();
    }

    public String getPrPic() {
        return prPic;
    }

    public void setPrPic(String prPic) {
        this.prPic = prPic == null ? null : prPic.trim();
    }

    public Integer getPrOverTag() {
        return prOverTag;
    }

    public void setPrOverTag(Integer prOverTag) {
        this.prOverTag = prOverTag;
    }
}