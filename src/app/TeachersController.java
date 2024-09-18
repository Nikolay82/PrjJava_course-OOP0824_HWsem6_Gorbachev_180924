package app;

//класс реализует API работы с сущностями Teacher - реализация S, O, L, D принципов SOLID
//вывод на печать расширяется не меняя текущий код добавлением нового класса TeachersView...
//для сортировки расширяется другим условием сортировки не меняя текущий код добавлением нового класса TeachersComparatorBy...

import java.util.List;

public class TeachersController {
    private final TeachersService teachersService;
    private PrinterUser<Teacher> teachersView;

    public TeachersController() {
        this.teachersService = new TeachersService();
        this.teachersView = new TeachersViewInColumn();
    }

    public PrinterUser<Teacher> getTeachersView() {
        return teachersView;
    }

    public void setTeachersView(PrinterUser<Teacher> teachersView) {
        this.teachersView = teachersView;
    }

    public List<Teacher> getAllTeachers() {
        return teachersService.getTeachers();
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        teachersService.createTeacher(firstName, lastName, middleName);
    }

    public void editTeacher(Teacher editTeacher, Teacher newTeacher) {
        teachersService.editTeacher(editTeacher, newTeacher);
    }

    public void removeTeacherByID(int teacherID) {
        Teacher teacherToRemove = teachersService.searchTeacherByID(teacherID);
        if (teacherToRemove != null) teachersService.removeTeacher(teacherToRemove);
    }

    public Teacher searchTeacherByID(int teacherID) {
        return teachersService.searchTeacherByID(teacherID);
    }

    public List<Teacher> searchTeachersByFIO(String firstName, String lastName, String middleName) {
        return teachersService.searchTeachersByFIO(firstName, lastName, middleName);
    }
    public void printAllTeachers() {
        teachersView.printAll(teachersService.getTeachers());
    }

    public void printTeachers(List<Teacher> teachersToPrint) {
        teachersView.printAll(teachersToPrint);
    }

    public void printTeacher(Teacher teacherToPrint) {
        teachersView.printOne(teacherToPrint);
    }


    public List<Teacher> getSortedTeachers(UsersComparator<Teacher> teachersComparator) {
        return teachersService.getSortedTeachersByComparator(teachersComparator);
    }

}
