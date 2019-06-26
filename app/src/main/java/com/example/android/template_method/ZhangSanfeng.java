package com.example.android.template_method;

public class ZhangSanfeng extends AbstractSwordsman {

    @Override
    protected void weapons() {
        System.out.println("使用武器");
    }

    @Override
    protected void neiGong() {
        System.out.println("使用内功");
    }

    @Override
    protected boolean hasWeapons() {
        return false;
    }
}
