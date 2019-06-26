package com.example.android.appearance.appear;

import com.example.android.appearance.subsystem.JingMai;
import com.example.android.appearance.subsystem.NeiGong;
import com.example.android.appearance.subsystem.ZhaoShi;

public class Zhangwuji {
    private JingMai jingMai;
    private ZhaoShi zhaoShi;
    private NeiGong neiGong;

    public Zhangwuji(){
        jingMai = new JingMai();
        zhaoShi = new ZhaoShi();
        neiGong = new NeiGong();
    }

    /**
     * 使用前坤达挪移
     */
    public void UserQianKun(){
        jingMai.JingMai();
        neiGong.QianKun();
    }

    /**
     * 使用七伤拳
     */
    public void UserQiShang(){
        jingMai.JingMai();
        zhaoShi.QiShangQuan();
    }
}
