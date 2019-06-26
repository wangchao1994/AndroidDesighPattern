package com.example.android.proxy.static_proxy;

public class UserA implements IShop {
    @Override
    public void buy() {
        System.out.println("buy a shop");
    }
}
