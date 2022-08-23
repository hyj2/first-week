package com.huang.controller;

import com.huang.entity.HouseEntity;
import com.huang.service.HouseService;
import com.huang.service.impl.HouseServiceImpl2;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController()
@RequestMapping("house")

@Api(tags = "房屋")
public class HouseController {

    @Autowired
    private  HouseService houseService;

    @Autowired
    private HouseServiceImpl2 serviceImpl2;

    @ApiOperation("查询所有房屋")
    @GetMapping
    public List<HouseEntity> getAll() throws ExecutionException, InterruptedException {
        return houseService.getAll().get();
    }

    @ApiOperation("添加房屋")
    @PostMapping("add")
    public void add(@RequestBody HouseEntity entity){
        serviceImpl2.add(entity);
    }
}
