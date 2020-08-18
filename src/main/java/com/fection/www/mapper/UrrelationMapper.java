package com.fection.www.mapper;

import com.fection.www.pojo.UrrelationKey;

public interface UrrelationMapper {
    int deleteByPrimaryKey(UrrelationKey key);

    int insert(UrrelationKey record);

    int insertSelective(UrrelationKey record);
}