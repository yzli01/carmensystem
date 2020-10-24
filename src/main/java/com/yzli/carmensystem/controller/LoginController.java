package com.yzli.carmensystem.controller;

import com.yzli.carmensystem.pojo.User;
import com.yzli.carmensystem.result.Result;
import com.yzli.carmensystem.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import javax.jws.soap.SOAPBinding;
import java.util.Objects;

@Controller
public class LoginController {
    @Autowired
    UserManagerService userManagerService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User user){
        String username=user.getName();
        username= HtmlUtils.htmlEscape(username);

        if(userManagerService.IsExitedUser(username)){
            User user1=userManagerService.getUserById(userManagerService.getUserId(username));
            if (Objects.equals(user1.getPasswd(),user.getPasswd())){
                return new Result(200);
            }else{
                return new Result(400);
            }
        }else {
            return new Result(400);
        }
    }
}
