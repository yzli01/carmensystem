package com.yzli.carmensystem.service;

import com.yzli.carmensystem.dao.RoleDao;
import com.yzli.carmensystem.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleManagerService {
    @Autowired
    RoleDao roleDao;
    @Autowired
    UserManagerService userManagerService;

    public int addRoleToUser(String rName,String username){
        if(userManagerService.IsExitedUser(username)) {
            if (roleDao.selectByRName(rName) != null) {
                User user = userManagerService.getUserById(userManagerService.getUserId(username));
                String tmp=user.getRole()+","+roleDao.selectByRName(rName).getRole();
                user.setRole(tmp);
                userManagerService.updateUser(user);
                return 1;
            } else {
                return 0;
            }
        }else {
            return 0;
        }
    }

    public int rmRoleFromUser(String rName,String username){
        if(userManagerService.IsExitedUser(username)) {
            if (roleDao.selectByRName(rName) != null) {
                User user = userManagerService.getUserById(userManagerService.getUserId(username));
                String tmp=user.getRole().replace(roleDao.selectByRName(rName).getRole(),"");
                user.setRole(tmp);
                userManagerService.updateUser(user);
                return 1;
            } else {
                return 0;
            }
        }else {
            return 0;
        }
    }
}
