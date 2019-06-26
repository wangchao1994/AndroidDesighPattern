package com.example.android.appearance;

import com.example.android.appearance.appear.Zhangwuji;

/**
 * 具体外层不知道对象内部如何实现需求
 */
public class Client {
    public static void main(String[] args){
        Zhangwuji zhangwuji = new Zhangwuji();
        zhangwuji.UserQianKun();
        zhangwuji.UserQiShang();
    }
}
