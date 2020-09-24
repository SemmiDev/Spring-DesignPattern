package com.sammidev.proxy;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

@Slf4j
public class LogInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        try {
            log.info("BEFORE INVOKE");
            return methodInvocation.proceed();
        } finally {
            log.info("AFTER INVOKE");
        }
    }
}