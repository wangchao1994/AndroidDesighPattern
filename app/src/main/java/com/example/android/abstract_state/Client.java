package com.example.android.abstract_state;

import com.example.android.abstract_state.state.PowerOffState;

public class Client {
    public static void main(String[] arg){
        Context context = new Context();
        //只需要先设定mp3的初始状态，就可以调用各种功能方法，不需要再考虑功能和状态之间的关系
        context.setMp3State(new PowerOffState());
        context.preState();
        context.powerOn();
        context.nextSong();
        context.powerOff();
    }
}
