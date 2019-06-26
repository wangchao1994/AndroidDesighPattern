package com.example.android.decorative;


/**
 * 代理模式和装饰模式有点像
 * 都是持有了被代理或者被装饰对象的引用。它们两个最大的不同就是装饰模式对引用的对象增加了功能，
 * 而代理模式只是对引用对象进行了控制却没有对引用对象本身增加功能。
 */

public abstract class Swordsman {
    public abstract void attackMagic();
}
