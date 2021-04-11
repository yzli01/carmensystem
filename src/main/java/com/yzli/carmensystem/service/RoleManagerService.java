package com.yzli.carmensystem.service;

public interface RoleManagerService {
    public boolean isExitedRole(String role);
    public int addNewRole(String rName,String role);
    public int delRole(String role);
    public int addRoleToUser(String role,String username);
    public int rmRoleFromUser(String role,String username);
    public int getRoleId(String role);
}
