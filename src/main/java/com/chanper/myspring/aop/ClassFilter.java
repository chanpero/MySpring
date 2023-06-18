package com.chanper.myspring.aop;

public interface ClassFilter {

    /**
     * Pointcut 是否应该应用到某个类
     * @param clazz
     * @return
     */
    boolean matches(Class<?> clazz);

}
