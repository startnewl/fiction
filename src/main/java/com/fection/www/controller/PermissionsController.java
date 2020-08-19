package com.fection.www.controller;

import com.fection.www.mapper.PermissionsMapper;
import com.fection.www.pojo.Permissions;
import com.fection.www.service.IPermissionsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PermissionsController {
    @Resource
    private IPermissionsService permissionsService;
    @GetMapping("/GetAllPermissions")
    public List<Permissions> getAllAdmin(){
        return permissionsService.getAllPermissions();
    }
    @GetMapping("/getAllByPid/{pid}")
    public Permissions getAllByAid(@PathVariable("pid") Integer pid){
        return permissionsService.getAllByPid(pid);
    }
    @GetMapping("/insertPermissions")
    public Integer insertAdmin(@RequestBody Permissions permissions){
        if(permissionsService.insertPermissions(permissions)>0){
            return 1;
        }else {
            return 0;
        }
    }
    @GetMapping("/updatePermissions")
    public Integer updateAdmin(@RequestBody Permissions permissions){
        if(permissionsService.updatePermissions(permissions)>0){
            return 1;
        }else {
            return 0;
        }
    }
    @GetMapping("/deletePermissions/{pid}")
    public Integer deleteAdmin(@PathVariable("pid") Integer pid){
        if(permissionsService.deletePermissions(pid)>0){
            return 1;
        }else {
            return 0;
        }
    }
}
