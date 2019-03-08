package com.manager.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name="attendance")
@ToString
public class AttendanceEntity {

    /*工号*/
    @Column(name="workno",length=10)
    private String workno;

    /*用户名*/
    @Column(name="username",length=20)
    private String username;

    /*性别*/
    @Column(name="gender",length=4)
    private String gender;

    /*年龄*/
    @Column(name="age",length=2)
    private String age;

    /*日期*/
    @Column(name="attdate")
    private Date attdate;

    /*状态*/
    @Column(name="statu")
    private String statu;
}
