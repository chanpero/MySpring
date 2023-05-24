package com.chanper.myspring.test.common;

import com.chanper.myspring.beans.BeansException;
import com.chanper.myspring.beans.PropertyValue;
import com.chanper.myspring.beans.PropertyValues;
import com.chanper.myspring.beans.factory.BeanFactory;
import com.chanper.myspring.beans.factory.ConfigurableListableBeanFactory;
import com.chanper.myspring.beans.factory.config.BeanDefinition;
import com.chanper.myspring.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues pvs = beanDefinition.getPropertyValues();
        pvs.addPropertyValue(new PropertyValue("company", "改为：ByteDance"));
    }
}
