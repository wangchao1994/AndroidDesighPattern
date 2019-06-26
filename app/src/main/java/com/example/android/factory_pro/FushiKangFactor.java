package com.example.android.factory_pro;

/**
 * 通过发射来获取当前Computer对象
 */
public class FushiKangFactor extends ComputerFactory {
    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        Computer mComputer = null;
        String clzName = clz.getName();
        try {
            mComputer = (Computer) Class.forName(clzName).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) mComputer;
    }
}
