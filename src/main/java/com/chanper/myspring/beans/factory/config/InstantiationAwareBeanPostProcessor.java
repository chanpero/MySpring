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
     * Apply after bean instantiated, before setting properties
     * @param pvs
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException;
}
