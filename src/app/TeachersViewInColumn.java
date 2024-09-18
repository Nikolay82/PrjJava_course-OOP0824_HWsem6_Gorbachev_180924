package app;

//класс реализации шаблона вывода на печать - для реализации D принципа SOLID

import java.util.List;

public class TeachersViewInColumn implements PrinterUser<Teacher> {

    @Override
    public void printAll(List<Teacher> teachers) {
        System.out.println("[");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("]");
    }

    @Override
    public void printOne(Teacher teacher) {
        System.out.println("[" + teacher + "]");
    }
}
