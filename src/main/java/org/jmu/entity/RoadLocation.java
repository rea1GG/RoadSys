package org.jmu.entity;

public class RoadLocation {
    private Integer rlId;

    private String rlArea;

    private String rlStreet;

    public Integer getRlId() {
        return rlId;
    }

    public void setRlId(Integer rlId) {
        this.rlId = rlId;
    }

    public String getRlArea() {
        return rlArea;
    }

    public void setRlArea(String rlArea) {
        this.rlArea = rlArea == null ? null : rlArea.trim();
    }

    public String getRlStreet() {
        return rlStreet;
    }

    public void setRlStreet(String rlStreet) {
        this.rlStreet = rlStreet == null ? null : rlStreet.trim();
    }
}