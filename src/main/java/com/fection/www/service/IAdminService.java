package com.fection.www.service;

import com.fection.www.pojo.Admin;

import java.util.List;

public interface IAdminService {
    List<Admin> getAllAdmin();
    Admin getAllByAid(Integer aid);
    int insertAdmin(Admin admin);
    int updateAdmin(Admin admin);
    int deleteAdmin(Integer aid);
}
