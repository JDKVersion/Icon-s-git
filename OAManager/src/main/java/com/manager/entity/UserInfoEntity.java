package com.manager.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name="userinfo")
@ToString
public class UserInfoEntity {

    /*主键*/
    @Column(name="id",length=32)
    private String id;

    /*工号*/
    @Column(name="workno",length=10)
    private String workno;

    /*用户名*/
    @Column(name="username",length=20)
    private String username;

    /*密码*/
    @Column(name="pass",length=20)
    private String pass;

    /*入职日期*/
    @Column(name="pass")
    private Date hiredate;

    /*职位*/
    @Column(name="jobposition",length=25)
    private String jobposition;

    /*性别*/
    @Column(name="gender",length=4)
    private String gender;

    /*年龄*/
    @Column(name="age",length=2)
    private String age;



}
