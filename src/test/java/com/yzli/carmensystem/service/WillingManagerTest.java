package com.yzli.carmensystem.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class WillingManagerTest {
    @Autowired
    WillingManager willingManager;

    @Test
    void getWillingList() {
        System.out.println(willingManager.getWillingList());
    }

    @Test
    void addNewWilling() {
        Date date=new Date(2019-1900,8-1,12);
        willingManager.addNewWilling("DD",date,"JMWU");
    }

    @Test
    void getWilling() {
        System.out.println(willingManager.getWilling("JMWU","yzli"));
    }
}