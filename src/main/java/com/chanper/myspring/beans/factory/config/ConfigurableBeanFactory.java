package com.chanper.myspring.beans.factory.config;

import com.chanper.myspring.beans.factory.HierarchicalBeanFactory;
import com.chanper.myspring.core.convert.ConversionService;
import com.chanper.myspring.util.StringValueResolver;
import com.sun.istack.internal.Nullable;

public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * Add StringResolver for embedded values such as annotation attributes
     * @param valueResolver
     */
    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    /**
     * Resolve the given embedded value, e.g. an annotation attribute
     *
     * @param value
     * @return
     */
    String resolveEmbeddedValue(String value);

    void setConversionService(ConversionService conversionService);

    @Nullable
    ConversionService getConversionService();

}
