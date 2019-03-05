package com.manager.mapper;

import com.manager.entity.AttendanceEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceMapper {

    List<AttendanceEntity> findByNo(String info);
    List<AttendanceEntity> findAll();

}
