package com.fection.www.service;

import com.fection.www.mapper.PermissionsMapper;
import com.fection.www.pojo.Permissions;

import java.util.List;

public interface IPermissionsService {
    List<Permissions> getAllPermissions();
    Permissions getAllByPid(Integer pid);
    int insertPermissions(Permissions permissions);
    int updatePermissions(Permissions permissions);
    int deletePermissions(Integer pid);
}
