package com.chanper.myspring.beans.factory.support;

import com.chanper.myspring.beans.BeansException;
import com.chanper.myspring.core.io.Resource;
import com.chanper.myspring.core.io.ResourceLoader;

public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinition(Resource resource) throws BeansException;

    void loadBeanDefinition(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
