package com.czxy.score.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/*
* `metting_id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `metting_name` VARCHAR(30) DEFAULT NULL COMMENT '会议名称',
  `metting_size` INT(11) DEFAULT NULL COMMENT '预计参会人数',
  `metting_starttime` DATETIME DEFAULT NULL COMMENT '会议开始时间',
  `metting_endtime` DATETIME DEFAULT NULL COMMENT '会议结束时间',
  `metting_ordertime` DATETIME DEFAULT NULL COMMENT '会议预定时间',
  `remark` VARCHAR(200) DEFAULT NULL COMMENT '会议说明',
  `status` VARCHAR(10) DEFAULT NULL COMMENT '会议状态',
  `username` VARCHAR(30) DEFAULT NULL COMMENT '预定者',
  `room_id` INT(11) DEFAULT NULL COMMENT '会议室ID',
*/
@Entity
@Table(name = "tab_metting")
public class Metting {
    private Integer mettingId;
    private String mettingName;
    private Integer mettingSize;
    private Date mettingStarttime;
    private Date mettingEndtime;
    private Date mettingOrdertime;
    private String remark;
    private String status;
    private String username;
    private Integer roomId;

    @Override
    public String toString() {
        return "Metting{" +
                "mettingId=" + mettingId +
                ", mettingName='" + mettingName + '\'' +
                ", mettingSize=" + mettingSize +
                ", mettingStarttime=" + mettingStarttime +
                ", mettingEndtime=" + mettingEndtime +
                ", mettingOrdertime=" + mettingOrdertime +
                ", remark='" + remark + '\'' +
                ", status='" + status + '\'' +
                ", username='" + username + '\'' +
                ", roomId=" + roomId +
                '}';
    }

    public Integer getMettingId() {
        return mettingId;
    }

    public void setMettingId(Integer mettingId) {
        this.mettingId = mettingId;
    }

    public String getMettingName() {
        return mettingName;
    }

    public void setMettingName(String mettingName) {
        this.mettingName = mettingName;
    }

    public Integer getMettingSize() {
        return mettingSize;
    }

    public void setMettingSize(Integer mettingSize) {
        this.mettingSize = mettingSize;
    }

    public Date getMettingStarttime() {
        return mettingStarttime;
    }

    public void setMettingStarttime(Date mettingStarttime) {
        this.mettingStarttime = mettingStarttime;
    }

    public Date getMettingEndtime() {
        return mettingEndtime;
    }

    public void setMettingEndtime(Date mettingEndtime) {
        this.mettingEndtime = mettingEndtime;
    }

    public Date getMettingOrdertime() {
        return mettingOrdertime;
    }

    public void setMettingOrdertime(Date mettingOrdertime) {
        this.mettingOrdertime = mettingOrdertime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Metting(Integer mettingId, String mettingName, Integer mettingSize, Date mettingStarttime, Date mettingEndtime, Date mettingOrdertime, String remark, String status, String username, Integer roomId) {
        this.mettingId = mettingId;
        this.mettingName = mettingName;
        this.mettingSize = mettingSize;
        this.mettingStarttime = mettingStarttime;
        this.mettingEndtime = mettingEndtime;
        this.mettingOrdertime = mettingOrdertime;
        this.remark = remark;
        this.status = status;
        this.username = username;
        this.roomId = roomId;
    }

    public Metting() {
    }
}
