package com.manager.service;

import com.manager.entity.UserInfoEntity;
import com.manager.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfoEntity> findByNo(String info){
        return userInfoMapper.findByNo(info);
    }
    public List<UserInfoEntity> findAll(){
        return userInfoMapper.findAll();
    }
    public List<UserInfoEntity> findOne(Map<String,Object> map){
        return userInfoMapper.findOne(map);}
}
