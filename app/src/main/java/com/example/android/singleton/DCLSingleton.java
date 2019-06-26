package com.example.android.singleton;

/**
 * 双重检查模式
 */
public class DCLSingleton {
    public volatile static DCLSingleton dclSingleton;
    private DCLSingleton(){
    }
    //第一次是为了不必要的同步
    //第二次是对象为空创建对象
    //DCL解决了资源的利用率，线程同步
    public static DCLSingleton getInstance(){
        if (dclSingleton == null){
            synchronized (DCLSingleton.class){
                if (dclSingleton == null){
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }
}
