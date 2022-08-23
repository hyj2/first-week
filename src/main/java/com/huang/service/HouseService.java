package com.huang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huang.entity.HouseEntity;

import java.util.List;
import java.util.concurrent.Future;

public interface HouseService extends IService<HouseEntity> {

    public Future<List<HouseEntity>> getAll();

}
