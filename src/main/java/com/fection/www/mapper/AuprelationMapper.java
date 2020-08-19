package com.fection.www.mapper;

import com.fection.www.pojo.AuprelationKey;

public interface AuprelationMapper {
    int deleteByPrimaryKey(AuprelationKey key);

    int insert(AuprelationKey record);

    int insertSelective(AuprelationKey record);

}