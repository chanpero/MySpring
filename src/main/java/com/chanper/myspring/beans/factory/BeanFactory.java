package com.chanper.myspring.beans.factory;

import com.chanper.myspring.beans.BeansException;
import com.chanper.myspring.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
