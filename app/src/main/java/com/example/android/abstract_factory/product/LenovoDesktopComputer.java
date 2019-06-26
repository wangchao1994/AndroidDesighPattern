package com.example.android.abstract_factory.product;

import com.example.android.abstract_factory.super_abstract.DesktopComputer;

/**
 * 具体产品类
 */
public class LenovoDesktopComputer extends DesktopComputer {
    @Override
    public void start() {
        System.out.println("联想台式机-----》");
    }
}
