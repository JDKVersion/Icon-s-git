package com.manager.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name="datumninfo")
@ToString
public class DatumEntity {

    /*资料编号*/
    @Column(name="datumnno",length=20)
    private String datumnno;

    /*资料名称*/
    @Column(name="datumnname",length=20)
    private String datumnname;

    /*资料数量*/
    @Column(name="dacount",length=20)
    private String dacount;

    /*更新日期*/
    @Column(name="hiredate")
    private Date hiredate;

    /*资料类别*/
    @Column(name="daclass",length=25)
    private String daclass;

    /*资料状态*/
    @Column(name="dastatu",length=25)
    private String dastatu;
}
