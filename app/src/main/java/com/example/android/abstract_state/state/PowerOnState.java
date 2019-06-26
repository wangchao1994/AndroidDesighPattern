package com.example.android.abstract_state.state;

import com.example.android.abstract_state.MP3State;

public class PowerOnState implements MP3State {
    @Override
    public void powerOn() {
        System.out.println("powerOn-----");
    }

    @Override
    public void powerOff() {
        System.out.println("powerOff-----");

    }

    @Override
    public void nextState() {
        System.out.println("nextState-----");
    }

    @Override
    public void preState() {
        System.out.println("preState-----");
    }
}
