package com.example.android.abstract_factory.factory;

import com.example.android.abstract_factory.super_abstract.DesktopComputer;
import com.example.android.abstract_factory.super_abstract.NoteBookComputer;

public abstract class ComputerFactory {
    public abstract DesktopComputer createDesktopComputer();
    public abstract NoteBookComputer createNoteBookComputer();
}
