package com.chanper.myspring.test.bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class UserServiceInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long start = System.currentTimeMillis();
        try {
            return methodInvocation.proceed();
        } finally {
            System.out.println("AOP begin.......");
            System.out.println("MethodName: " + methodInvocation.getMethod());
            System.out.println("ExecuteTime: " + (System.currentTimeMillis() - start) + "ms");
            System.out.println("AOP end..........\r\n");
        }
    }
}
