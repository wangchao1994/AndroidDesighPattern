package com.example.android.factory;

/**
 * 静态工厂根据传入的类型进行产品的创建
 */
public class ComputerFactory {
    public static Computer createComputer(String type){
        Computer mComputer=null;
        switch (type){
            case "lenovo":
                mComputer = new LenovoComputer();
                break;
            case "hp":
                mComputer = new HpComputer();
                break;
        }
        return mComputer;
    }
}
