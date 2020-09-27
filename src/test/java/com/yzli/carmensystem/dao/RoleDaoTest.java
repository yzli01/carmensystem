package com.yzli.carmensystem.dao;

import com.yzli.carmensystem.pojo.Role;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class RoleDaoTest {

    @Autowired
    RoleDao roleDao;

    @Test
    void insert() {
        Role role=new Role();
        role.setrName("获取许愿");
        role.setRole("willinggetter");
        role.setPage("1");
        roleDao.insert(role);
    }


    @Test
    void selectByPrimaryKey() {
       System.out.println(roleDao.selectByPrimaryKey(1).getrName());
    }

}