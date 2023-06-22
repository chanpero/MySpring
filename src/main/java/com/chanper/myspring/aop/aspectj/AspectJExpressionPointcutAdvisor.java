package com.chanper.myspring.aop.aspectj;

import com.chanper.myspring.aop.Pointcut;
import com.chanper.myspring.aop.PointcutAdvisor;
import org.aopalliance.aop.Advice;

/**
 * AOP Advisor for AspectJ pointcut expression
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    // 切面
    private AspectJExpressionPointcut pointcut;
    // 具体拦截方法
    private Advice advice;
    // 表达式
    private String expression;

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        if (pointcut == null)
            pointcut = new AspectJExpressionPointcut(expression);
        return pointcut;
    }
}
