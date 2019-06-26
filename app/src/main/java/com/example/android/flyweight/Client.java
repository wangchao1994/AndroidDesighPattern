package com.example.android.flyweight;

public class Client {
    public static void main(String[] args){
        Goods goods = GoodsFactory.getGoods("iphone7");
        goods.showPrice("328G");
    }
}
