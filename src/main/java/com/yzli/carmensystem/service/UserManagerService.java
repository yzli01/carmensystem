package com.yzli.carmensystem.service;

import com.yzli.carmensystem.pojo.User;

public interface UserManagerService {
    public Boolean IsExitedUser(String username);
    public Boolean IsExitedUser(int id);
    public int addUser(User user);
    public int delUser(int id);
    public int updateUser(User user);
    public int getUserId(String username);
    public User getUserById(int id);
}
