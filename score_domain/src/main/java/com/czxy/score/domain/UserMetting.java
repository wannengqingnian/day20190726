package com.czxy.score.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
/*
*`umid` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) DEFAULT NULL,
  `metting_id` INT(11) DEFAULT NULL,
*/
@Entity
@Table(name = "tab_user_metting")
public class UserMetting {
    private  Integer umid;
    private  Integer userId;
    private  Integer mettingId;

    @Override
    public String toString() {
        return "UserMetting{" +
                "umid=" + umid +
                ", userId=" + userId +
                ", mettingId=" + mettingId +
                '}';
    }

    public Integer getUmid() {
        return umid;
    }

    public void setUmid(Integer umid) {
        this.umid = umid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMettingId() {
        return mettingId;
    }

    public void setMettingId(Integer mettingId) {
        this.mettingId = mettingId;
    }

    public UserMetting(Integer umid, Integer userId, Integer mettingId) {
        this.umid = umid;
        this.userId = userId;
        this.mettingId = mettingId;
    }

    public UserMetting() {
    }
}
