package com.example.android.factory;

public class CreateComputer {
    public static void main(String[] args){
        Computer computer = ComputerFactory.createComputer("lenovo");
        computer.start();
    }
}
