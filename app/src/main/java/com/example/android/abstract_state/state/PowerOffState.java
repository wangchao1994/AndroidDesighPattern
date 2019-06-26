package com.example.android.abstract_state.state;

import com.example.android.abstract_state.MP3State;

//在关机状态中只实现了powerOn方法，其他的方法都是空实现。
public class PowerOffState implements MP3State {

    @Override
    public void powerOn() {
        System.out.println("PowerOffState---------powerOn");
    }

    @Override
    public void powerOff() {
    }

    @Override
    public void nextState() {
    }

    @Override
    public void preState() {
    }
}
