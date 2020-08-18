package com.fection.www.mapper;

import com.fection.www.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface AdminMapper {
    List<Admin> getAllAdmin();
    Admin getAllByAid(Integer aid);
    int insertAdmin(Admin admin);
    int updateAdmin(Admin admin);
    int deleteAdmin(Integer aid);
}