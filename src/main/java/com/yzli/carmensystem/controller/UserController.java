package com.yzli.carmensystem.controller;

import com.yzli.carmensystem.pojo.User;
import com.yzli.carmensystem.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserManagerService userManagerService;

    @CrossOrigin
    @PutMapping(value = "api/adduser")
    @ResponseBody
    public int getUsers(@RequestBody User user){
        String username=user.getName();
        String passwd=user.getPasswd();
        String role=user.getRole();

        User newUser=new User();
        newUser.setName(username);
        newUser.setPasswd(passwd);
        newUser.setRole(role);

        int result=userManagerService.addUser(newUser);

        if(result==0){
            return 400;
        }else {
            return 200;
        }
    }

    @CrossOrigin
    @DeleteMapping(value = "api/deluser")
    @ResponseBody
    public int delUser(int id){
        int result=userManagerService.delUser(id);
        if(result==0){
            return 400;
        }else {
            return 200;
        }
    }

}
