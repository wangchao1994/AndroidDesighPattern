package com.example.android.factory_pro;

/**
 * 通过反射来获取当前电脑对象
 * 就不用在工厂里取进行类型匹配来创建当前对象
 * 直接在对应的电脑对象里执行需求操作
 */
public class Client {
    public static void main(String[] args){
        FushiKangFactor fushiKangFactor = new FushiKangFactor();
        AcerComputer computer = fushiKangFactor.createComputer(AcerComputer.class);
        computer.start();
    }
}
