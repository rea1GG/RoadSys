package org.jmu.entity;

public class Road {
    private Integer roadId;

    private String roadName;

    private Integer rlId;

    private Integer userId;

    public Integer getRoadId() {
        return roadId;
    }

    public void setRoadId(Integer roadId) {
        this.roadId = roadId;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName == null ? null : roadName.trim();
    }

    public Integer getRlId() {
        return rlId;
    }

    public void setRlId(Integer rlId) {
        this.rlId = rlId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


}