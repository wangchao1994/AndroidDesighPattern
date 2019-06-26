package com.example.android.abstract_state;

import com.example.android.abstract_state.state.PowerOffState;
import com.example.android.abstract_state.state.PowerOnState;

//环境角色
public class Context {

    private MP3State mp3State;
    public void setMp3State(MP3State state){
        this.mp3State = state;
    }

    public void powerOn(){
        if (mp3State != null){
            mp3State.powerOn();
            setMp3State(new PowerOnState());
        }
    }

    public void powerOff(){
        if (mp3State != null){
            mp3State.powerOff();
            setMp3State(new PowerOffState());
        }
    }

    public void nextSong(){
        if (mp3State != null){
            mp3State.nextState();
        }
    }

    public void preState(){
        if (mp3State != null){
            mp3State.preState();
        }
    }
}
