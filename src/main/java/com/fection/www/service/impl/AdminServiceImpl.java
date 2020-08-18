package com.fection.www.service.impl;

import com.fection.www.mapper.AdminMapper;
import com.fection.www.pojo.Admin;
import com.fection.www.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {
    @Resource
    private AdminMapper adminMapper;

    @Override
    public List<Admin> getAllAdmin() {
        return adminMapper.getAllAdmin();
    }

    @Override
    public Admin getAllByAid(Integer aid) {
        return adminMapper.getAllByAid(aid);
    }

    @Override
    public int insertAdmin(Admin admin) {
        return adminMapper.insertAdmin(admin);
    }

    @Override
    public int updateAdmin(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }

    @Override
    public int deleteAdmin(Integer aid) {
        return adminMapper.deleteAdmin(aid);
    }
}
