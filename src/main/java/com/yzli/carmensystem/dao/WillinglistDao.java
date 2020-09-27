package com.yzli.carmensystem.dao;

import com.yzli.carmensystem.pojo.Willinglist;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WillinglistDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Willinglist record);

    int insertSelective(Willinglist record);

    Willinglist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Willinglist record);

    int updateByPrimaryKey(Willinglist record);
}