package com.yzli.carmensystem.service;

import com.yzli.carmensystem.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserManagerServiceTest {
    @Autowired
    UserManagerService userManagerService;

    @Test
    void isExitedUser() {
        userManagerService.IsExitedUser("yzli");
    }

    @Test
    void testIsExitedUser() {
        userManagerService.IsExitedUser(1);
    }

    @Test
    void addUser() {
        User user=new User();
        user.setName("yzli01");
        user.setPasswd("test");
        user.setRole("willinggetter");
       System.out.println(userManagerService.addUser(user));
    }

    @Test
    void delUser() {
        int id=userManagerService.getUserId("yzli01");
        System.out.println(userManagerService.delUser(id));
    }

    @Test
    void updateUser() {
        User user=userManagerService.getUserById(1);
        user.setPasswd("test");
        System.out.println(userManagerService.updateUser(user));
    }

    @Test
    void getUserId() {
    }

    @Test
    void getUserById() {
    }
}