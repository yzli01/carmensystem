package com.yzli.carmensystem.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class RoleManagerServiceTest {
    @Autowired
    RoleManagerService roleManagerService;

    @Test
    void addRoleToUser() {
        System.out.println(roleManagerService.addRoleToUser("willingsetter","yzli"));
    }

    @Test
    void rmRoleFromUser() {
        System.out.println(roleManagerService.rmRoleFromUser("willingsetter","yzli"));
    }

    @Test
    void isExitedRole() {
        boolean tmp=roleManagerService.isExitedRole("willinggetter1");
        Assert.assertTrue(tmp);
    }

    @Test
    void addNewRole() {
        System.out.println(roleManagerService.addNewRole("愿望提交","willingsetter"));
    }

    @Test
    void delRole() {
        System.out.println(roleManagerService.delRole("willingsetter"));
    }

    @Test
    void getRoleId() {
    }

    @Test
    void testAddRoleToUser() {
    }

    @Test
    void testRmRoleFromUser() {
    }
}