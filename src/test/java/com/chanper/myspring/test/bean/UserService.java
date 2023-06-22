package com.chanper.myspring.test.bean;

import com.chanper.myspring.beans.BeansException;
import com.chanper.myspring.beans.factory.*;
import com.chanper.myspring.context.ApplicationContext;
import com.chanper.myspring.context.ApplicationContextAware;
import com.chanper.myspring.stereotype.Component;

import java.util.Random;

@Component("userService")
public class UserService implements IUserService{

    private String token;

    @Override
    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "UserService::queryUserInfo";
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
}
