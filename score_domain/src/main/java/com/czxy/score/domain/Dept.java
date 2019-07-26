package com.czxy.score.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*
*  `dept_id` INT(11) NOT NULL AUTO_INCREMENT,
* `dept_name` VARCHAR(20) DEFAULT NULL,
* */
@Entity
@Table(name = "tab_dept")
public class Dept {
    @Id
    private Integer deptId;
    private Integer deptName;

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName=" + deptName +
                '}';
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getDeptName() {
        return deptName;
    }

    public void setDeptName(Integer deptName) {
        this.deptName = deptName;
    }

    public Dept(Integer deptId, Integer deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Dept() {
    }
}
