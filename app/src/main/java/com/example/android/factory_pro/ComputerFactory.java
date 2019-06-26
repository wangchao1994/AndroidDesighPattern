package com.example.android.factory_pro;

/**
 * 基类工厂
 */
public abstract class ComputerFactory {
    public abstract <T extends Computer> T createComputer(Class<T> clz);
}
