package com.example.android.observer;
import java.util.List;
/**
 * 具体的被观者者
 */
public class SubscriptionSubject implements Subject{
    //list 存储已经订阅的用户
    private List<Observer> weixinUserlist ;
    public void setUserList(List<Observer> weixinUserlist){
        this.weixinUserlist = weixinUserlist;
    }
    @Override
    public void attach(Observer observer) {
        if (weixinUserlist != null){
            weixinUserlist.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        if (weixinUserlist != null){
            weixinUserlist.remove(observer);
        }
    }

    @Override
    public void notify(String message) {
        if (weixinUserlist != null){
            for (Observer observer : weixinUserlist) {
                observer.update(message);
            }
        }
    }
}
