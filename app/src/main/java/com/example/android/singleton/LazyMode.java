package com.example.android.singleton;

/**
 * 懒汉模式
 */
public class LazyMode {
    //线程不安全
    //用户第一次调用的时候初始化对象
    //多个线程使用时,会出错
    public static LazyMode lazyMode;
    public LazyMode(){
    }
    public static LazyMode getInstance(){
        if (lazyMode == null){
            lazyMode = new LazyMode();
        }
        return lazyMode;
    }
}
