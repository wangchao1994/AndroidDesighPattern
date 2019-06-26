package com.example.android.abstract_factory.product;

import com.example.android.abstract_factory.super_abstract.DesktopComputer;

/**
 * 具体产品类
 */
public class HPDesktopComputer extends DesktopComputer {
    @Override
    public void start() {
        System.out.println("惠普台式机-----》");
    }
}
