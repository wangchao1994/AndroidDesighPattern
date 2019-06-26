package com.example.android.strategy;

/**
 *Common场景
 */
public class CommonStrategy implements FightingStrategy {
    @Override
    public void fighting() {
        System.out.println("common场景-------->");
    }
}
