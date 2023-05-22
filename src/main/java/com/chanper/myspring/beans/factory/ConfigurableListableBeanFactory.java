package com.chanper.myspring.beans.factory;

import com.chanper.myspring.beans.BeansException;
import com.chanper.myspring.beans.factory.config.AutowireCapableBeanFactory;
import com.chanper.myspring.beans.factory.config.BeanDefinition;
import com.chanper.myspring.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
