package com.yzli.carmensystem.dao;

import com.yzli.carmensystem.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}