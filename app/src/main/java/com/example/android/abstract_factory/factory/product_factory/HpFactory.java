package com.example.android.abstract_factory.factory.product_factory;

import com.example.android.abstract_factory.factory.ComputerFactory;
import com.example.android.abstract_factory.product.HPDesktopComputer;
import com.example.android.abstract_factory.product.HPNoteBookComputer;
import com.example.android.abstract_factory.super_abstract.DesktopComputer;
import com.example.android.abstract_factory.super_abstract.NoteBookComputer;

public class HpFactory extends ComputerFactory {

    @Override
    public DesktopComputer createDesktopComputer() {
        return new HPDesktopComputer();
    }

    @Override
    public NoteBookComputer createNoteBookComputer() {
        return new HPNoteBookComputer();
    }
}
