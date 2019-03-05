package com.manager.mapper;

import com.manager.entity.StaffEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffMapper {
    List<StaffEntity> findByNo(String info);
    List<StaffEntity> findAll();
}
