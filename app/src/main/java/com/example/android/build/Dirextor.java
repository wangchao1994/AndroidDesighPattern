package com.example.android.build;

/**
 * 指挥组装
 */
public class Dirextor {
    public Builder builder;
    public Dirextor(Builder builder){
        this.builder = builder;
    }
    public Computer createComputer(String broad,String ram,String brand){
        builder.createMainBroad(broad);
        builder.createRam(ram);
        builder.createBrand(brand);
        return builder.createComputer();
    }
}
