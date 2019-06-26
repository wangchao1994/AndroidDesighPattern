package com.example.android.abstract_factory;

import com.example.android.abstract_factory.factory.ComputerFactory;
import com.example.android.abstract_factory.factory.product_factory.HpFactory;
import com.example.android.abstract_factory.factory.product_factory.LenovoFactory;

public class Client {

    public static void main(String[] args){
        ComputerFactory computerFactory = new LenovoFactory();
        computerFactory.createDesktopComputer().start();
        computerFactory.createNoteBookComputer().start();

        ComputerFactory computerFactory1 = new HpFactory();
        computerFactory1.createNoteBookComputer().start();
        computerFactory1.createDesktopComputer().start();
    }

}
