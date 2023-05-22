package com.chanper.myspring.test;

import cn.hutool.core.io.IoUtil;
import com.chanper.myspring.beans.PropertyValue;
import com.chanper.myspring.beans.PropertyValues;
import com.chanper.myspring.beans.factory.config.BeanDefinition;
import com.chanper.myspring.beans.factory.config.BeanReference;
import com.chanper.myspring.beans.factory.support.DefaultListableBeanFactory;
import com.chanper.myspring.beans.factory.xml.XmlBeanDefinitionReader;
import com.chanper.myspring.core.io.DefaultResourceLoader;
import com.chanper.myspring.core.io.Resource;
import com.chanper.myspring.test.bean.UserDao;
import com.chanper.myspring.test.bean.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class ApiTest {

    @Test
    public void test() {
        System.out.println(ApiTest.class.getSimpleName());
        System.out.println(ApiTest.class.getName());
    }

    @Test
    public void test_BeanFactory() {
        // 1. 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. userDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService 设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10002"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        // 4. UserService 注入 Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. 获取 Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

    private DefaultResourceLoader resourceLoader;

    @BeforeEach
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test_classpath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream is = resource.getInputStream();
        String content = IoUtil.readUtf8(is);
        System.out.println(content);
    }

    @Test
    public void test_file() throws IOException {
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream is = resource.getInputStream();
        String content = IoUtil.readUtf8(is);
        System.out.println(content);
    }

    @Test
    public void test_url() throws IOException {
        Resource resource = resourceLoader.getResource("https://gitee.com/fustack/small-spring/raw/main/important.properties");
        InputStream is = resource.getInputStream();
        String content = IoUtil.readUtf8(is);
        System.out.println(content);
    }

    @Test
    public void test_xml() {
        // 1. 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 读取配置文件、注册bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        // 3. 获取 bean 对象调用方法
        UserService userService = beanFactory.getBean("userService", UserService.class);
        userService.queryUserInfo();
    }

}
