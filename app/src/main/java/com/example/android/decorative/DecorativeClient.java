package com.example.android.decorative;

/**
 *
 通过组合而非继承的方式，动态的来扩展一个对象的功能，在运行时选择不同的装饰器，从而实现不同的行为。
 有效避免了使用继承的方式扩展对象功能而带来的灵活性差，子类无限制扩张的问题。
 具体组件类与具体装饰类可以独立变化，用户可以根据需要增加新的具体组件类和具体装饰类，在使用时再对其进行组合，原有代码无须改变，符合“开闭原则”。
 */
public class DecorativeClient {
    public static void main(String[] args){
        UserA userA = new UserA();
        UserB userB = new UserB(userA);
        userB.attackMagic();
    }
}
