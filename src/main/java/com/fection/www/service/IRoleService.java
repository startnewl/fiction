package com.fection.www.service;

import com.fection.www.pojo.Role;

import java.util.List;

public interface IRoleService {
    List<Role> getAllRole();
    Role getAllByRid(Integer rid);
    int insertRole(Role role);
    int updateRole(Role role);
    int deleteRole(Integer rid);
}
