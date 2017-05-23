package zootopia.usercenter.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by wangxizhong on 2017/5/17.
 */
@Aspect
public abstract class BaseMonitorInterceptor {

    public abstract void monitoExpression();

    @Around("monitoExpression()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        return joinPoint.proceed();
    }
}
