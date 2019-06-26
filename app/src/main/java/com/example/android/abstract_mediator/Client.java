package com.example.android.abstract_mediator;


public class Client {

    public static void main(String[] args){
        Champions champions = new Champions();
        Wudang wudang = new Wudang(champions);
        champions.setWudang(wudang);
        wudang.sendAlliance("武当弟子-----》");
    }

}
