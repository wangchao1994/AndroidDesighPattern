package com.example.android.observer;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] arg){
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        List<Observer> userList = new ArrayList<>();
        WeChatUser weChatUser_0 = new WeChatUser("wangchao_1");
        WeChatUser weChatUser_1 = new WeChatUser("wangchao_1");
        WeChatUser weChatUser_2 = new WeChatUser("weChatUser_2");
        subscriptionSubject.setUserList(userList);
        subscriptionSubject.attach(weChatUser_0);
        subscriptionSubject.attach(weChatUser_1);
        subscriptionSubject.attach(weChatUser_2);
        //通知所有已经订阅的用户信息更新
        subscriptionSubject.notify("message更新了");
    }
}
