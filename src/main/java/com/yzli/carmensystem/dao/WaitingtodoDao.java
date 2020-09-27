package com.yzli.carmensystem.dao;

import com.yzli.carmensystem.pojo.Waitingtodo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WaitingtodoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Waitingtodo record);

    int insertSelective(Waitingtodo record);

    Waitingtodo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Waitingtodo record);

    int updateByPrimaryKey(Waitingtodo record);
}