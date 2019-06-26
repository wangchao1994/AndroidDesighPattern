package com.example.android.build;
/**
 * 用于组装
 */
public class MoonComputerBuilder extends Builder {
    private Computer mComputer = new Computer();
    @Override
    public void createMainBroad(String mainBroad) {
        mComputer.setmMainBroad(mainBroad);
    }
    @Override
    public void createRam(String ram) {
        mComputer.setmRam(ram);
    }
    @Override
    public void createBrand(String brand) {
        mComputer.setmBrand(brand);
    }

    @Override
    public Computer createComputer() {
        return mComputer;
    }
}
