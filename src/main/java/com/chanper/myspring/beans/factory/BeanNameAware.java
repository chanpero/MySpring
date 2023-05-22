package com.chanper.myspring.beans.factory;

public interface BeanNameAware extends Aware {
    void setBeanName(String name);
}
