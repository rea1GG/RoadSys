package org.jmu.entity;

public class Road {
    private Integer roadId;

    private String roadName;

    private String roadArea;

    private String roadInfo;

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

    public String getRoadArea() {
        return roadArea;
    }

    public void setRoadArea(String roadArea) {
        this.roadArea = roadArea == null ? null : roadArea.trim();
    }

    public String getRoadInfo() {
        return roadInfo;
    }

    public void setRoadInfo(String roadInfo) {
        this.roadInfo = roadInfo == null ? null : roadInfo.trim();
    }
}