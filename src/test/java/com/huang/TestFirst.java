package com.huang;

import com.huang.entity.HouseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class TestFirst {
    @Autowired
    private HouseEntity houseEntity;

    @Test
    void test(){
        System.out.println(houseEntity.toString());
    }
}
