package com.fection.www.service.impl;

import com.fection.www.mapper.RoleMapper;
import com.fection.www.pojo.Role;
import com.fection.www.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RoleServiceImpl implements IRoleService {
    @Resource
    private RoleMapper roleMapper;
    @Override
    public List<Role> getAllRole() {
        return roleMapper.getAllRole();
    }

    @Override
    public Role getAllByRid(Integer rid) {
        return roleMapper.getAllByRid(rid);
    }

    @Override
    public int insertRole(Role role) {
        return roleMapper.insertRole(role);
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updateRole(role);
    }

    @Override
    public int deleteRole(Integer rid) {
        return roleMapper.deleteRole(rid);
    }
}
