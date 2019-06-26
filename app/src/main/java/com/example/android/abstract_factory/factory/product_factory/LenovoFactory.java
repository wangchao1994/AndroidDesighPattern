package com.example.android.abstract_factory.factory.product_factory;

import com.example.android.abstract_factory.factory.ComputerFactory;
import com.example.android.abstract_factory.product.LenovoDesktopComputer;
import com.example.android.abstract_factory.product.LenovoNoteBookComputer;
import com.example.android.abstract_factory.super_abstract.DesktopComputer;
import com.example.android.abstract_factory.super_abstract.NoteBookComputer;

public class LenovoFactory extends ComputerFactory {
    @Override
    public DesktopComputer createDesktopComputer() {
        return new LenovoDesktopComputer();
    }

    @Override
    public NoteBookComputer createNoteBookComputer() {
        return new LenovoNoteBookComputer();
    }
}
