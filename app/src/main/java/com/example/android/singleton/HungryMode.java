package com.example.android.singleton;

/**
 * 饿汉模式
 */
public class HungryMode {
    //类加载的时候直接实例化对象
    //1.类加载比较慢
    //2.获取对象速度快
    //3.避免线程同步的问题
    //4.如果整个应用中未使用此对象，则就会造成资源的浪费
    private static HungryMode singleton = new HungryMode();
    public HungryMode(){
    }
    public static HungryMode getInstance(){
        return singleton;
    }
}
