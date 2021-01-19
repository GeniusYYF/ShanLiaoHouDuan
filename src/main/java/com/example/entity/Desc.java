package com.example.entity;

public class Desc {
    private Integer descId;
    private Integer myId;
    private String myMsg;
    private Integer youId;
    private String youMsg;
    private String date;
    private String description;

    public Integer getDescId() {
        return descId;
    }

    public void setDescId(Integer descId) {
        this.descId = descId;
    }

    public Integer getMyId() {
        return myId;
    }

    public void setMyId(Integer myId) {
        this.myId = myId;
    }

    public String getMyMsg() {
        return myMsg;
    }

    public void setMyMsg(String myMsg) {
        this.myMsg = myMsg;
    }

    public Integer getYouId() {
        return youId;
    }

    public void setYouId(Integer youId) {
        this.youId = youId;
    }

    public String getYouMsg() {
        return youMsg;
    }

    public void setYouMsg(String youMsg) {
        this.youMsg = youMsg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "descId:" + descId +
                ", myId:'" + myId + '\'' +
                ", myMsg:'" + myMsg + '\'' +
                ", youId:'" + youId + '\'' +
                ", youMsg:'" + youMsg + '\'' +
                ", date:'" + date + '\'' +
                ", description:'" + description + '\'' +
                '}';
    }
}
