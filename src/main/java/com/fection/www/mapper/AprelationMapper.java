package com.fection.www.mapper;

import com.fection.www.pojo.AprelationKey;

public interface AprelationMapper {
    int deleteByPrimaryKey(AprelationKey key);

    int insert(AprelationKey record);

    int insertSelective(AprelationKey record);
}