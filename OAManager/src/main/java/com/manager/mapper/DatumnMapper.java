package com.manager.mapper;

import com.manager.entity.DatumEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatumnMapper {
    List<DatumEntity> findByNo(String info);
    List<DatumEntity> findAll();
}
