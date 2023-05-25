package com.chanper.myspring.test.bean;

import com.chanper.myspring.beans.BeansException;
import com.chanper.myspring.beans.factory.*;
import com.chanper.myspring.context.ApplicationContext;
import com.chanper.myspring.context.ApplicationContextAware;

public class UserService {


    private String uId;
    private String company;
    private String location;
    private IUserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + "," + company + "," + location;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
