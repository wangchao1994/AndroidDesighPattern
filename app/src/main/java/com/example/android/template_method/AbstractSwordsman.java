package com.example.android.template_method;

/**
 * 模板基类
 */
public abstract class AbstractSwordsman {
    /**
     * 不能被重写的方法
     */
    public final void fighting(){
        neiGong();
        merion();
        if (hasWeapons()){
            weapons();
        }
    }

    protected void merion(){
    }

    protected boolean hasWeapons() {
        return false;
    }

    protected abstract void weapons();

    protected abstract void neiGong();

}
