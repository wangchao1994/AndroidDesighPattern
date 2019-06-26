package com.example.android.singleton;
/**
 * 静态内部类单例模式
 * 一般采用这个模式
 */
public class StaticInterior {
    public static StaticInterior staticInterior;
    //第一次类创建的时候不会初始化实例对象
    //调用的时候会直接初始化
    //解决线程同步的问题，也可以保证实例的唯一性
    public static StaticInterior getInstance(){
        return StaticInterior.staticInterior;
    }
    private static class StaticInteriorHolder{
        private static final StaticInterior staticInterior = new StaticInterior();
    }

}
