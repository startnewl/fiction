package com.fection.www.mapper;

import com.fection.www.pojo.Permissions;

import java.util.List;

public interface PermissionsMapper {
    List<Permissions> getAllPermissions();
    Permissions getAllByPid(Integer pid);
    int insertPermissions(Permissions permissions);
    int updatePermissions(Permissions permissions);
    int deletePermissions(Integer pid);
}