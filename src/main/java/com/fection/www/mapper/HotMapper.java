package com.fection.www.mapper;

import com.fection.www.pojo.Hot;

public interface HotMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(Hot record);

    int insertSelective(Hot record);

    Hot selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(Hot record);

    int updateByPrimaryKey(Hot record);
}