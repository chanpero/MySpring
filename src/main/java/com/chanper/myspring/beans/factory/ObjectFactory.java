package com.chanper.myspring.beans.factory;

import com.chanper.myspring.beans.BeansException;

public interface ObjectFactory<T> {

    T getObject() throws BeansException;

}
