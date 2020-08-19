package com.fection.www.service;

import com.fection.www.dto.UserImg;
import com.fection.www.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUser();
    User getAllByUid(Integer uid);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(Integer uid);
}
