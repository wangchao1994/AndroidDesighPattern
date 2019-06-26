package com.example.android.strategy;


public class Client {
    public static void main(String[] args){
        ContextFactory contextFactory = new ContextFactory(new WeakRivalStrategy());
        contextFactory.fighting();

        ContextFactory commonStrategy = new ContextFactory(new CommonStrategy());
        commonStrategy.fighting();

        ContextFactory strongStrategy = new ContextFactory(new StrongStrategy());
        strongStrategy.fighting();
    }
}
