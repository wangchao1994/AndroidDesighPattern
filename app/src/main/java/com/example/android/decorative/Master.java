package com.example.android.decorative;

/**
 * 装饰者
 * 抽象装饰者（Decorator）
 */
public abstract class Master extends Swordsman{
    private Swordsman swordsman;
    public Master(Swordsman swordsman){
        this.swordsman = swordsman;
    }
    @Override
    public void attackMagic() {
        swordsman.attackMagic();
    }
}
