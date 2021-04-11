package com.yzli.carmensystem.service;


import com.yzli.carmensystem.dao.UserDao;
import com.yzli.carmensystem.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userManagerService")
public class UserManagerServiceImp implements UserManagerService{
    @Autowired
    UserDao userDao;

    @Override
    public Boolean IsExitedUser(String username){
        User user=userDao.selectByUsername(username);
        if (user!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean IsExitedUser(int id){
        User user=userDao.selectByPrimaryKey(id);
        if (user!=null){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public int addUser(User user){
        if(!IsExitedUser(user.getName())) {
            userDao.insert(user);
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public int delUser(int id){
        if(IsExitedUser(id)){
            userDao.deleteByPrimaryKey(id);
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public int updateUser(User user){
        if(IsExitedUser(user.getId())) {
            userDao.updateByPrimaryKey(user);
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public int getUserId(String username){
        if(IsExitedUser(username)) {
            return userDao.selectByUsername(username).getId();
        }else {
            return 0;
        }
    }

    @Override
    public User getUserById(int id){
        return userDao.selectByPrimaryKey(id);
    }
}
