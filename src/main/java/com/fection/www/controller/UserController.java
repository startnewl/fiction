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
    @RequestMapping("/getAllByUid/{uid}")
    public User getAllByAid(@PathVariable("uid") Integer uid){
        return userService.getAllByUid(uid);
    }



    @RequestMapping("/insertUser")
    public Integer insertAdmin(@RequestBody UserImg userImg){
        if(userService.insertUser(userImg)>0){
            return 1;
        }else {
            return 0;
        }
    }




    @RequestMapping("/updateUser")
    public Integer updateAdmin(@RequestBody User user){
        if(userService.updateUser(user)>0){
            return 1;
        }else {
            return 0;
        }
    }
    @RequestMapping("/deleteUser/{uid}")
    public Integer deleteAdmin(@PathVariable("uid") Integer uid){
        if(userService.deleteUser(uid)>0){
            return 1;
        }else {
            return 0;
        }
    }
}
