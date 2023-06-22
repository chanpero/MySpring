package com.chanper.myspring.aop;

import org.aopalliance.aop.Advice;

/**
 * Base interface holding AOP advice and pointcut
 */
public interface Advisor {
    Advice getAdvice();
}
