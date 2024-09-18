package app;

//класс реализации шаблона компаратора - для реализации D принципа SOLID

public class TeachersComparatorByFIOreversed implements UsersComparator<Teacher>{
    @Override
    public int compare(Teacher teacher2, Teacher teacher1) {

        int resultOfComparing = teacher1.getFirstName().compareTo(teacher2.getFirstName());
        if (resultOfComparing != 0) return resultOfComparing;

        resultOfComparing = teacher1.getLastName().compareTo(teacher2.getLastName());
        if (resultOfComparing != 0) return resultOfComparing;

        resultOfComparing = teacher1.getMiddleName().compareTo(teacher2.getMiddleName());

        return resultOfComparing;
    }
}
