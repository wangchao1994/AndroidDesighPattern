package com.example.android.proxy.static_proxy;

/**
 * B代购
 */
public class Purchasing implements IShop{
    private IShop iShop;
    public Purchasing(IShop iShop){
        this.iShop = iShop;
    }
    @Override
    public void buy() {
        if (iShop != null){
            iShop.buy();
        }
    }
}
