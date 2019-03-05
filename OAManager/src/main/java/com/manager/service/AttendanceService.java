package com.manager.service;


import com.manager.entity.AttendanceEntity;
import com.manager.mapper.AttendanceMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class AttendanceService {
    @Autowired
    private AttendanceMapper attendanceMapper;

    public List<AttendanceEntity> findByNo(String info){
        return attendanceMapper.findByNo(info);
    }
    public List<AttendanceEntity> findAll(){
        return attendanceMapper.findAll();
    }


}
