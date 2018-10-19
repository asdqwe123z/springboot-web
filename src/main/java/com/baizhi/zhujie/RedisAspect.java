package com.baizhi.zhujie;

import com.baizhi.entity.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by jia on 2018/10/18.
 */
@Aspect
@Configuration
public class RedisAspect {
    @Pointcut(value = "execution(* com.baizhi.service.*.*(..))")
    public void pt(){

    }
    /*@Before(value = "pt()")
    public void before(JoinPoint joinPoint){
        //参数列表
        Object[] args = joinPoint.getArgs();
        //切入点方式
        String kind = joinPoint.getKind();
        //原始service对象
        Object target = joinPoint.getTarget();
        //代理类
        Object aThis = joinPoint.getThis();
        //方法对象
        Signature signature = joinPoint.getSignature();

        System.out.println("前置增强");
    }

    @After(value = "pt()")
    public void After(){
        System.out.println("后置增强");
    }*/
    @Around(value = "pt()")
    public Object asd(ProceedingJoinPoint joinPoint){
        System.out.println("方法执行前");
        Object proceed=null;
        try {
             proceed = joinPoint.proceed();//放行方法的目标
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("方法执行后增强");

        return proceed;
    }
}
