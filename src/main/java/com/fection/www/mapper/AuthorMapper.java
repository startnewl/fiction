package com.fection.www.mapper;

import com.fection.www.pojo.Author;

public interface AuthorMapper {
    int deleteByPrimaryKey(Integer auid);

    int insert(Author record);

    int insertSelective(Author record);

    Author selectByPrimaryKey(Integer auid);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);
}