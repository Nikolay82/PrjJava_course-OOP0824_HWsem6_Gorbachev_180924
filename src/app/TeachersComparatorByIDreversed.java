package app;

//класс реализации шаблона компаратора - для реализации D принципа SOLID

public class TeachersComparatorByIDreversed implements UsersComparator<Teacher>{
    @Override
    public int compare(Teacher teacher2, Teacher teacher1) {
        return teacher1.getTeacherId().compareTo(teacher2.getTeacherId());
    }
}
