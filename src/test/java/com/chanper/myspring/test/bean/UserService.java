package com.chanper.myspring.test.bean;

import com.chanper.myspring.beans.BeansException;
import com.chanper.myspring.beans.factory.*;
import com.chanper.myspring.beans.factory.annotation.Autowired;
import com.chanper.myspring.beans.factory.annotation.Value;
import com.chanper.myspring.context.ApplicationContext;
import com.chanper.myspring.context.ApplicationContextAware;
import com.chanper.myspring.stereotype.Component;

import java.util.Random;

public class UserService implements IUserService{
    private String token;

    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "小傅哥，100001，深圳，" + token;
    }

    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户：" + userName + " success！";
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
