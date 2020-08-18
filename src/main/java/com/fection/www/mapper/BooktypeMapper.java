package com.fection.www.mapper;

import com.fection.www.pojo.Booktype;

public interface BooktypeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Booktype record);

    int insertSelective(Booktype record);

    Booktype selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Booktype record);

    int updateByPrimaryKey(Booktype record);
}