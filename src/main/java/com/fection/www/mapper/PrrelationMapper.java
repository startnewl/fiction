package com.fection.www.mapper;

import com.fection.www.pojo.PrrelationKey;

public interface PrrelationMapper {
    int deleteByPrimaryKey(PrrelationKey key);

    int insert(PrrelationKey record);

    int insertSelective(PrrelationKey record);
}