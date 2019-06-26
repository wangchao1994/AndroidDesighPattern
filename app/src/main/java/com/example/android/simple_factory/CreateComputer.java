package com.example.android.simple_factory;

/**
 * 使用户根据参数获得对应的类实例，避免了直接实例化类，降低了耦合性。
 * 缺点:实例化的对象已经确定好，如果让增加实例对象，就需要修改工厂
 */
public class CreateComputer {
    public static void main(String[] args){
        Computer computer = ComputerFactory.createComputer("lenovo");
        computer.start();
    }
}
