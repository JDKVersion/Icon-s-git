package com.manager.service;

import com.manager.entity.StaffEntity;
import com.manager.entity.UserInfoEntity;
import com.manager.mapper.StaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class StaffService {
    @Autowired
    private StaffMapper staffMapper;

    public List<StaffEntity> findByNo(String info){
        return staffMapper.findByNo(info);
    }
    public List<StaffEntity> findAll(){
        return staffMapper.findAll();
    }
}
