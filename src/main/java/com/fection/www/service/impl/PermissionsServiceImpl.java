package com.fection.www.service.impl;

import com.fection.www.mapper.PermissionsMapper;
import com.fection.www.pojo.Permissions;
import com.fection.www.service.IPermissionsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PermissionsServiceImpl implements IPermissionsService {
    @Resource
    private PermissionsMapper permissionsMapper;

    @Override
    public List<Permissions> getAllPermissions() {
        return permissionsMapper.getAllPermissions();
    }

    @Override
    public Permissions getAllByPid(Integer pid) {
        return permissionsMapper.getAllByPid(pid);
    }

    @Override
    public int insertPermissions(Permissions permissions) {
        return permissionsMapper.insertPermissions(permissions);
    }

    @Override
    public int updatePermissions(Permissions permissions) {
        return permissionsMapper.updatePermissions(permissions);
    }

    @Override
    public int deletePermissions(Integer pid) {
        return permissionsMapper.deletePermissions(pid);
    }
}
