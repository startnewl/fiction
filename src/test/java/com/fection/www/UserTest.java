package com.fection.www;

import com.fection.www.dto.UserImg;
import com.fection.www.pojo.User;
import com.fection.www.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserTest {
    @Resource
    IUserService userService;
    @Test
    public void testuser(){
        UserImg u=new UserImg("zhangjunjun","123456@qq.com","12345678910","1111111111");
        System.out.println(userService.insertUser(u));
    }
}
