package com.example.android.observer;

/**
 *观察着
 */
public class WeChatUser implements Observer {
    private String weChatName;
    public WeChatUser(String weChatName){
        this.weChatName = weChatName;
    }
    @Override
    public void update(String message) {
        System.out.println(weChatName + "-" + message);
    }
}
