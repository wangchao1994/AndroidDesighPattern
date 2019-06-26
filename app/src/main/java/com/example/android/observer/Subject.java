package com.example.android.observer;

/**
 * 抽象被观察着
 */
public interface Subject {
    /**
     * 增加订阅者
     * @param observer
     */
    public void attach(Observer observer);
    /**
     * 移除订阅者
     * @param observer
     */
    public void detach(Observer observer);

    /**
     * 通知订阅者更新信息
     * @param message
     */
    public void notify(String message);
}
