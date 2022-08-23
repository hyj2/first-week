package com.huang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huang.config.ExecutorConfig;
import com.huang.dao.HouseDao;
import com.huang.entity.HouseEntity;
import com.huang.service.HouseService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Service
@Async("executor")
public class HouseServiceImpl extends ServiceImpl<HouseDao, HouseEntity> implements HouseService  {


    @Override
    public Future<List<HouseEntity>> getAll() {

        return AsyncResult.forValue(list());
    }

}
