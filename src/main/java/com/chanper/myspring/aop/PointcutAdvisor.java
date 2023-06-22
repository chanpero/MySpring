package com.chanper.myspring.aop;

public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
