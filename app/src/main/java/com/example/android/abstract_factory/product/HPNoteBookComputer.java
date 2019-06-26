package com.example.android.abstract_factory.product;

import com.example.android.abstract_factory.super_abstract.NoteBookComputer;

/**
 * 具体产品类
 */
public class HPNoteBookComputer extends NoteBookComputer {
    @Override
    public void start() {
        System.out.println("惠普笔记本-----》");
    }
}
