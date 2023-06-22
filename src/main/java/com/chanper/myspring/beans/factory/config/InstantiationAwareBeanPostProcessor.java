package com.chanper.myspring.beans.factory.config;

import com.chanper.myspring.beans.BeansException;

import java.lang.reflect.InvocationTargetException;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {
    /**
     * invoked before Bean object execute init method
     */
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;
}
