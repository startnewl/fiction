package com.fection.www.mapper;

import com.fection.www.pojo.Images;

public interface ImagesMapper {
    int deleteByPrimaryKey(Integer iid);

    int insert(Images record);

    int insertSelective(Images record);

    Images selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(Images record);

    int updateByPrimaryKey(Images record);
}