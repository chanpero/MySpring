package com.chanper.myspring.beans.factory.support;

import com.chanper.myspring.beans.BeansException;
import com.chanper.myspring.beans.factory.DisposableBean;
import com.chanper.myspring.beans.factory.ObjectFactory;
import com.chanper.myspring.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    protected static final Object NULL_OBJECT = new Object();

    // level one cache, 普通单例对象
    private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>();

    // level two cache, 早期半成品对象
    protected  final Map<String, Object> earlySingletonObjects = new HashMap<>();

    // level three cache, 单例工厂对象
    private final Map<String, ObjectFactory<?>> singletonFactories = new HashMap<String, ObjectFactory<?>>();

    private final Map<String, DisposableBean> disposableBeans = new LinkedHashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        Object singletonObject = singletonObjects.get(beanName);
        if(singletonObject == null) { // 没有就到二级缓存中取
            singletonObject = earlySingletonObjects.get(beanName);
            if(singletonObject == null) { // 二级还没有去三级缓存找，只有代理对象才会放到三级缓存
                ObjectFactory<?> singletonFactory = singletonFactories.get(beanName);
                if(singletonFactory != null) {
                    singletonObject = singletonFactory.getObject();
                    //把三级缓存中的代理对象中的真实对象取出来放入二级缓存
                    earlySingletonObjects.put(beanName, singletonObject);
                    singletonFactories.remove(beanName);
                }
            }
        }
        return singletonObject;
    }

    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
        earlySingletonObjects.remove(beanName);
        singletonFactories.remove(beanName);
    }

    protected void addSingletonFactory(String beanName, ObjectFactory<?> singletonFactory) {
        if(!this.singletonFactories.containsKey(beanName)) {
            this.singletonFactories.put(beanName, singletonFactory);
            this.earlySingletonObjects.remove(beanName);
        }
    }

    public void registerDisposableBean(String beanName, DisposableBean bean) {
        disposableBeans.put(beanName, bean);
    }

    @Override
    public void destroySingletons() {
        Object[] disposableBeanNames = this.disposableBeans.keySet().toArray();

        for (Object beanName : disposableBeanNames) {
            DisposableBean disposableBean = disposableBeans.remove(beanName);
            try {
                disposableBean.destroy();
            } catch (Exception e) {
                throw new BeansException("Destroy method on bean with name '" + beanName + "' threw an exception", e);
            }
        }
    }
}
