package com.chanper.myspring.context.support;

import com.chanper.myspring.beans.factory.support.DefaultListableBeanFactory;
import com.chanper.myspring.beans.factory.xml.XmlBeanDefinitionReader;

public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {
    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations)
            beanDefinitionReader.loadBeanDefinitions(configLocations);
    }

    protected abstract String[] getConfigLocations();
}

