package com.fection.www.controller;

import com.fection.www.pojo.Admin;
import com.fection.www.service.IAdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AdmianController {
    @Resource
    private IAdminService adminService;
    @GetMapping("/GetAllAdmin")
    public List<Admin> getAllAdmin(){
        return adminService.getAllAdmin();
    }
    @GetMapping("/getAllByAid/{aid}")
    public Admin getAllByAid(@PathVariable("aid") Integer aid){
        return adminService.getAllByAid(aid);
    }
    @GetMapping("/insertAdmin")
    public Integer insertAdmin(@RequestBody Admin admin){
        if(adminService.insertAdmin(admin)>0){
            return 1;
        }else {
            return 0;
        }
    }
    @GetMapping("/updateAdmin")
    public Integer updateAdmin(@RequestBody Admin admin){
        if(adminService.updateAdmin(admin)>0){
            return 1;
        }else {
            return 0;
        }
    }
    @GetMapping("/deleteAdmin/{aid}")
    public Integer deleteAdmin(@PathVariable("aid") Integer aid){
        if(adminService.deleteAdmin(aid)>0){
            return 1;
        }else {
            return 0;
        }
    }
}
