package com.manager.mapper;

import com.manager.entity.UserInfoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserInfoMapper {
    List<UserInfoEntity> findByNo(String info);
    List<UserInfoEntity> findAll();
    List<UserInfoEntity> findOne(Map<String,Object> map);

}
