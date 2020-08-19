package com.fection.www.controller;

import com.fection.www.dto.UserImg;
import com.fection.www.pojo.User;
import com.fection.www.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private IUserService userService;
    @GetMapping("/GetAllUser")
    public List<User> getAllAdmin(){
        return userService.getAllUser();
    }
    @GetMapping("/getAllByUid/{uid}")
    public User getAllByAid(@PathVariable("uid") Integer uid){
        return userService.getAllByUid(uid);
    }
    @GetMapping("/insertUser")
    public Integer insertAdmin(@RequestBody User user){
        if(userService.insertUser(user)>0){
            return 1;
        }else {
            return 0;
        }
    }
    @GetMapping("/updateUser")
    public Integer updateAdmin(@RequestBody User user){
        if(userService.updateUser(user)>0){
            return 1;
        }else {
            return 0;
        }
    }
    @GetMapping("/deleteUser/{uid}")
    public Integer deleteAdmin(@PathVariable("uid") Integer uid){
        if(userService.deleteUser(uid)>0){
            return 1;
        }else {
            return 0;
        }
    }
}
