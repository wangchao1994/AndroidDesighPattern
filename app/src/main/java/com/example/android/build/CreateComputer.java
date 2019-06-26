package com.example.android.build;

/**
 * 使用建造者模式可以使客户端不必知道产品内部组成的细节。
 * 具体的建造者类之间是相互独立的，容易扩展。
 * 由于具体的建造者是独立的，因此可以对建造过程逐步细化，而不对其他的模块产生任何影响
 */
//缺点：产生多余的Build对象以及Dirextor类
public class CreateComputer {
    public static void main(String[] arg){
        Builder builder = new MoonComputerBuilder();
        Dirextor direcror = new Dirextor(builder);
        Computer computer = direcror.createComputer("HUA", "128", "WEI");
        System.out.println(computer.getmBrand());
    }
}
