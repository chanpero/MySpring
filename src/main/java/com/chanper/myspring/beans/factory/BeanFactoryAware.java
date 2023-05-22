package com.chanper.myspring.beans.factory;

import com.chanper.myspring.beans.BeansException;

public interface BeanFactoryAware extends Aware {
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
