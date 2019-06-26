package com.example.android.proxy;

import com.example.android.proxy.static_proxy.IShop;
import com.example.android.proxy.static_proxy.Purchasing;
import com.example.android.proxy.static_proxy.UserA;

/**
 * 静态代理的实现
 */
public class Client_Static_Proxy {
    public static void main(String[] arg){
        IShop iShop = new UserA();
        Purchasing purchasing = new Purchasing(iShop);
        purchasing.buy();
    }
}
