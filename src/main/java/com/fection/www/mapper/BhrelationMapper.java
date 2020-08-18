package com.fection.www.mapper;

import com.fection.www.pojo.BhrelationKey;

public interface BhrelationMapper {
    int deleteByPrimaryKey(BhrelationKey key);

    int insert(BhrelationKey record);

    int insertSelective(BhrelationKey record);
}