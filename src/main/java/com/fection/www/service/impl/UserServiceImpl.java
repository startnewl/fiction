package com.fection.www.service.impl;

import com.fection.www.dto.UserImg;
import com.fection.www.mapper.UserMapper;
import com.fection.www.pojo.Images;
import com.fection.www.pojo.User;
import com.fection.www.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User getAllByUid(Integer uid) {
        return userMapper.getAllByUid(uid);
    }

    @Override
    public int insertUser(UserImg userImg) {

        try {
            User u = new User();

            u.setUid(1);
            u.setUemail(userImg.getUemail());
            u.setUname(userImg.getUname());
            u.setUphone(userImg.getUphone());

            userMapper.insertUser(u);

            Images i = new Images();
            i.setUid(u.getUid());
            i.setUimg(userImg.getUimg());

            userMapper.insertImges(i);

            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }



    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(Integer uid) {
        return userMapper.deleteUser(uid);
    }
}
