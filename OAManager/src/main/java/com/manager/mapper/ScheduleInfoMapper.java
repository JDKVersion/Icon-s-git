package com.manager.mapper;

import com.manager.entity.ScheduleInfoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ScheduleInfoMapper {
    List<ScheduleInfoEntity> findOne(Map<String,Object> map);
    List<ScheduleInfoEntity> findAll();
}
