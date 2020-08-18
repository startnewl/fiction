package com.fection.www.mapper;

import com.fection.www.pojo.Bookrack;

public interface BookrackMapper {
    int deleteByPrimaryKey(Integer brid);

    int insert(Bookrack record);

    int insertSelective(Bookrack record);

    Bookrack selectByPrimaryKey(Integer brid);

    int updateByPrimaryKeySelective(Bookrack record);

    int updateByPrimaryKey(Bookrack record);
}