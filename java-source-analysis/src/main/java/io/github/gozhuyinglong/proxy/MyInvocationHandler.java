package io.github.gozhuyinglong.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author ZhuYinglong
 * @date 2021/2/24 0024
 */
public class MyInvocationHandler implements InvocationHandler {

    // 目标对象
    private final Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy - " + proxy.getClass());
        System.out.println("method - " + method);
        return method.invoke(target, args);
    }
}
