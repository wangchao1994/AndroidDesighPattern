package com.example.android.flyweight;

public class Goods implements IGoods {
    private String name;
    private String version;
    public Goods(String name){
        this.name = name;
    }
    @Override
    public void showPrice(String version) {
        if(version.equals("32G")){
            System.out.println("价格为5199元");
        }else if(version.equals("128G")){
            System.out.println("价格为5999元");
        }
    }
}
