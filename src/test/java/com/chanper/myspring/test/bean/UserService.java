package com.chanper.myspring.test.bean;

import com.chanper.myspring.beans.BeansException;
import com.chanper.myspring.beans.factory.*;
import com.chanper.myspring.context.ApplicationContext;
import com.chanper.myspring.context.ApplicationContextAware;

import java.util.Random;

public class UserService implements IUserService{

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
}
