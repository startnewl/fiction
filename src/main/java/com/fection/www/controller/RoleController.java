package com.fection.www.controller;

import com.fection.www.pojo.Role;
import com.fection.www.service.IRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class RoleController {
    @Resource
    private IRoleService roleService;
    @GetMapping("/GetAllRole")
    public List<Role> getAllAdmin(){
        return roleService.getAllRole();
    }
    @GetMapping("/getAllByRid/{rid}")
    public Role getAllByAid(@PathVariable("rid") Integer rid){
        return roleService.getAllByRid(rid);
    }



    @GetMapping("/insertRole")
    public Integer insertAdmin(@RequestBody Role role){
        if(roleService.insertRole(role)>0){
            return 1;
        }else {
            return 0;
        }
    }
    @GetMapping("/updateRole")
    public Integer updateAdmin(@RequestBody Role role){
        if(roleService.updateRole(role)>0){
            return 1;
        }else {
            return 0;
        }
    }
    @GetMapping("/deleteRole/{uid}")
    public Integer deleteAdmin(@PathVariable("uid") Integer rid){
        if(roleService.deleteRole(rid)>0){
            return 1;
        }else {
            return 0;
        }
    }
}
