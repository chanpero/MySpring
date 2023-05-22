package com.chanper.myspring.context;

import com.chanper.myspring.beans.BeansException;
import com.chanper.myspring.beans.factory.Aware;

public interface ApplicationContextAware extends Aware {
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
