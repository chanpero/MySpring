package com.chanper.myspring.test.bean;

import com.chanper.myspring.beans.BeansException;
import com.chanper.myspring.beans.factory.*;
import com.chanper.myspring.beans.factory.annotation.Autowired;
import com.chanper.myspring.beans.factory.annotation.Value;
import com.chanper.myspring.context.ApplicationContext;
import com.chanper.myspring.context.ApplicationContextAware;
import com.chanper.myspring.stereotype.Component;

import java.util.Random;

@Component("userService")
public class UserService implements IUserService{

    @Value("${token}")
    private String token;

    @Autowired
    private UserDao userDao;

    @Override
    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userDao.queryUserName("10001") + "; " + token;
    }

    @Override
    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "UserService::register";
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
