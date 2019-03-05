package com.manager.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name="staffinfo")
@ToString
public class StaffEntity {

    /*用品编号*/
    @Column(name="staffno",length=10)
    private String staffno;

    /*用品名称*/
    @Column(name="staffname",length=20)
    private String staffname;

    /*用品数量*/
    @Column(name="stcount",length=20)
    private String stcount;

    /*更新日期*/
    @Column(name="hiredate")
    private Date hiredate;

    /*用品类别*/
    @Column(name="stclass",length=25)
    private String stclass;

    /*用品状态*/
    @Column(name="statu",length=25)
    private String statu;

}
