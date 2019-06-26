package com.example.android.build;
/**
 * 建造者模式父类
 */
public abstract class Builder {
    public abstract void createMainBroad(String mainBroad);
    public abstract void createRam(String ram);
    public abstract void createBrand(String brand);
    public abstract Computer createComputer();
}
