package com.fection.www.mapper;

import com.fection.www.pojo.Images;
import com.fection.www.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUser();
    User getAllByUid(Integer uid);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(Integer uid);
}