package com.manager.mapper;

import com.manager.entity.ScheduleInfoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleInfoMapper {
    List<ScheduleInfoEntity> findByNo(String info);
    List<ScheduleInfoEntity> findAll();
}
