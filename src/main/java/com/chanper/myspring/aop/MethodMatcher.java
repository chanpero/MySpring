package com.chanper.myspring.aop;

import java.lang.reflect.Method;

public interface MethodMatcher {

    /**
     * 方法匹配
     * @param method
     * @param clazz
     * @return
     */
    boolean matches(Method method, Class<?> clazz);

}
