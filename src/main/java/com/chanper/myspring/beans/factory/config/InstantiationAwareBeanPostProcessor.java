package com.chanper.myspring.beans.factory.config;

import com.chanper.myspring.beans.BeansException;
import com.chanper.myspring.beans.PropertyValues;

import java.lang.reflect.InvocationTargetException;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    /**
     * Apply before bean instantiated
     */
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

    /**
     * Apply after bean instantiated
     */
    boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException;

    /**
     * Apply after bean instantiated, before setting properties
     */
    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException;

    default Object getEarlyBeanReference(Object bean, String beanName) {
        return bean;
    }
}
