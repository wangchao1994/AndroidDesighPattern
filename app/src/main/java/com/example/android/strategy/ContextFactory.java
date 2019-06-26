package com.example.android.strategy;

public class ContextFactory {
    FightingStrategy fightingStrategy;
    public ContextFactory(FightingStrategy fightingStrategy){
        this.fightingStrategy = fightingStrategy;
    }
    public void fighting(){
        if (fightingStrategy != null){
            fightingStrategy.fighting();
        }
    }
}
