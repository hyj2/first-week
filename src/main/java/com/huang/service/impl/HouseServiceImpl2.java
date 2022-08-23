package com.huang.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huang.dao.HouseDao;
import com.huang.entity.HouseEntity;
import com.huang.service.HouseService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Future;

@Service
public class HouseServiceImpl2 extends ServiceImpl<HouseDao, HouseEntity> implements IService<HouseEntity> {


    public void add(HouseEntity entity) {
        save(entity);
    }
}
