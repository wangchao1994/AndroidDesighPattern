package com.example.android.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicPurchasing implements InvocationHandler {
    private Object object;
    public DynamicPurchasing(Object object){
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
        return method.invoke(object, objects);
    }
}
