package com.chanper.myspring.test;

import com.chanper.myspring.beans.factory.config.BeanDefinition;
import com.chanper.myspring.beans.factory.BeanFactory;
import com.chanper.myspring.beans.factory.support.DefaultListableBeanFactory;
import com.chanper.myspring.test.bean.UserService;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1. 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册 Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 第一次获取 Bean
        UserService userService = (UserService) beanFactory.getBean("userService", "chanper");
        userService.queryUserInfo();

        // 4. 第二次获取 Bean
        // UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        // userService_singleton.queryUserInfo();
        // System.out.println(userService == userService_singleton);
    }


}
