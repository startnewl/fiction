package com.fection.www.mapper;

import com.fection.www.pojo.Permissions;

public interface PermissionsMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Permissions record);

    int insertSelective(Permissions record);

    Permissions selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Permissions record);

    int updateByPrimaryKey(Permissions record);
}