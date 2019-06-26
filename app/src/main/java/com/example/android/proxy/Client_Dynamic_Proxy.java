package com.example.android.proxy;

import com.example.android.proxy.dynamic_proxy.DynamicPurchasing;
import com.example.android.proxy.static_proxy.IShop;
import com.example.android.proxy.static_proxy.UserA;
import java.lang.reflect.Proxy;

/**
 * 无法或者不想直接访问某个对象时可以通过一个代理对象来间接的访问。
 */
public class Client_Dynamic_Proxy {
    public static void main(String[] args){
        IShop iShop = new UserA();
        DynamicPurchasing dynamicPurchasing = new DynamicPurchasing(iShop);
        ClassLoader classLoader = dynamicPurchasing.getClass().getClassLoader();
        //创建动态代理类
        IShop purchasing= (IShop) Proxy.newProxyInstance(classLoader,new Class[]{IShop.class},dynamicPurchasing);
        purchasing.buy();
    }
}
