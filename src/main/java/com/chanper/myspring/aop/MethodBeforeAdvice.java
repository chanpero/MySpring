package com.chanper.myspring.aop;

import java.lang.reflect.Method;

/**
 * Advice invoked before a method is invoked
 */
public interface MethodBeforeAdvice extends BeforeAdvice {
    void before(Method method, Object[] args, Object target) throws Throwable;
}
