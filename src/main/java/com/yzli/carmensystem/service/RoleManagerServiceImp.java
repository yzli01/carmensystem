package com.yzli.carmensystem.service;

import com.yzli.carmensystem.dao.RoleDao;
import com.yzli.carmensystem.pojo.Role;
import com.yzli.carmensystem.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleManagerService")
public class RoleManagerServiceImp implements RoleManagerService{
    @Autowired
    RoleDao roleDao;
    @Autowired
    UserManagerServiceImp userManagerService;

    @Override
    public boolean isExitedRole(String role){
        if(roleDao.selectByRole(role)!=null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int addNewRole(String rName, String role){
        if(isExitedRole(role)){
            return 0;
        }else{
            Role role1=new Role();
            role1.setRole(role);
            role1.setrName(rName);
            role1.setPage("1");
            roleDao.insert(role1);
            return 1;
        }
    }
    @Override
    public int delRole(String role){
        if(!isExitedRole(role)){
            return 0;
        }else{
            roleDao.deleteByPrimaryKey(getRoleId(role));
            return 1;
        }
    }

    @Override
    public int getRoleId(String role){
        if(isExitedRole(role)){
            return roleDao.selectByRole(role).getId();
        }else {
            return 0;
        }
    }
    @Override
    public int addRoleToUser(String role, String username){
        if(userManagerService.IsExitedUser(username)) {
            if (roleDao.selectByRole(role) != null) {
                User user = userManagerService.getUserById(userManagerService.getUserId(username));
                if (!user.getRole().contains(role)) {
                    String tmp = user.getRole() + "," + role;
                    user.setRole(tmp);
                    userManagerService.updateUser(user);
                    return 1;
                }else {
                    return 0;
                }
            } else {
                return 0;
            }
        }else {
            return 0;
        }
    }

    @Override
    public int rmRoleFromUser(String role, String username){
        if(userManagerService.IsExitedUser(username)) {
            if (roleDao.selectByRole(role) != null) {
                User user = userManagerService.getUserById(userManagerService.getUserId(username));
                if (user.getRole().contains(role)) {
                    String tmp = user.getRole().replace(","+role, "");
                    user.setRole(tmp);
                    userManagerService.updateUser(user);
                    return 1;
                }else {
                    return 0;
                }
            } else {
                return 0;
            }
        }else {
            return 0;
        }
    }
}
