package com.manager.service;

import com.manager.entity.DatumEntity;
import com.manager.entity.UserInfoEntity;
import com.manager.mapper.DatumnMapper;
import com.manager.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class DatumnService {
    @Autowired
    private DatumnMapper datumnMapper;

    public List<DatumEntity> findByNo(String info){
        return datumnMapper.findByNo(info);
    }
    public List<DatumEntity> findAll(){
        return datumnMapper.findAll();
    }
}
