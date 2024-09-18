package app;

//класс реализации шаблона вывода на печать - для реализации D принципа SOLID

import java.util.List;

public class TeachersViewInRow implements PrinterUser<Teacher> {

    @Override
    public void printAll(List<Teacher> teachers) {
        System.out.print("[");
        for (Teacher teacher : teachers) {
            System.out.print(teacher);
        }
        System.out.print("]");
    }

    @Override
    public void printOne(Teacher teacher) {
        System.out.println("[" + teacher + "]");
    }
}
