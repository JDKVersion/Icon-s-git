package com.manager.service;

import com.manager.entity.ScheduleInfoEntity;
import com.manager.mapper.ScheduleInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ScheduleInfoService {

    @Autowired
    private ScheduleInfoMapper scheduleInfoMapper;
    public List<ScheduleInfoEntity> findByNo(String info){ return scheduleInfoMapper.findByNo(info); }
    public List<ScheduleInfoEntity> findAll(){
        return scheduleInfoMapper.findAll();
    }
}
