package com.manager.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@ToString
@Table(name = "scheduleinfo")
@Data
public class ScheduleInfoEntity {
    /*主键*/
    @Column(name="id",length=32)
    private String id;

    /*工号*/
    @Column(name="workno",length=10)
    private String workno;

    /*用户名*/
    @Column(name="username",length=20)
    private String userName;

    /*时间*/
    @Column(name="hiredate")
    private Date hiredate;

    /*待办事项*/
    @Column(name="affair",length=200)
    private String affair;

    /*性别*/
    @Column(name="gender",length=4)
    private String gender;

    /*年龄*/
    @Column(name="age",length=2)
    private Integer age;

    /*状态*/
    @Column(name="statu",length=2)
    private String  statu;

    /*状态*/
    @Column(name="statu",length=2)
    private String  hstatu;

}
