package app;

//класс реализации шаблона компаратора - для реализации D принципа SOLID

public class TeachersComparatorByID implements UsersComparator<Teacher>{
    @Override
    public int compare(Teacher teacher1, Teacher teacher2) {
        return teacher1.getTeacherId().compareTo(teacher2.getTeacherId());
    }
}
