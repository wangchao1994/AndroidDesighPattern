package com.example.android.abstract_mediator;

public class Champions extends WulinAlliance {

    private Wudang wudang;
    public void setWudang(Wudang wudang) {
        this.wudang = wudang;
    }
    @Override
    public void notice(String message, United united) {
        if (united == wudang) {
            wudang.getNotice(message);
        }
    }
}
