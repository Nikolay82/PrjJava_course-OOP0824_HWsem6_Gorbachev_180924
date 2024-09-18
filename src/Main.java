import app.*;

public class Main {
    public static void main(String[] args) {

        TeachersController teachersController = new TeachersController(); //вывод по умолчанию в столбец

        //teachersController.setTeachersView(new TeachersViewInRow()); // включаем вывод в строку

        //teachersController.printAllTeachers();
        teachersController.createTeacher("fName1", "lName1", "mName1");
        teachersController.createTeacher("fName2", "lName2", "mName2");
        teachersController.createTeacher("fName3", "lName3", "mName3");
        teachersController.createTeacher("fName2", "lName2", "mName2");
        teachersController.createTeacher("fName4", "lName4", "mName4");
        teachersController.createTeacher("fName5", "lName5", "mName5");

        System.out.println("Все учителя:");
        teachersController.printAllTeachers();
        System.out.println();

        System.out.println("Поиск учителя по ФИО=\"fName2\", \"lName2\", \"mName2\":");
        teachersController.printTeachers(teachersController.searchTeachersByFIO("fName2", "lName2", "mName2"));
        System.out.println();

        System.out.println("Поиск учителя по ID=3:");
        teachersController.printTeacher(teachersController.searchTeacherByID(3));
        System.out.println();

        System.out.println("Удаление учителя по ID=1");
        //teachersController.removeTeacherByID(1);
        System.out.println("Все учителя:");
        teachersController.printAllTeachers();
        System.out.println();

        System.out.println("Сортировка по ID по возрастанию:");
        teachersController.printTeachers(teachersController.getSortedTeachers(new TeachersComparatorByID()));
        System.out.println();

        System.out.println("Сортировка по ID по убыванию:");
        teachersController.printTeachers(teachersController.getSortedTeachers(new TeachersComparatorByIDreversed()));
        System.out.println();

        System.out.println("Сортировка по ФИО по возрастанию:");
        teachersController.printTeachers(teachersController.getSortedTeachers(new TeachersComparatorByFIO()));
        System.out.println();

        System.out.println("Сортировка по ФИО по убыванию:");
        teachersController.printTeachers(teachersController.getSortedTeachers(new TeachersComparatorByFIOreversed()));
        System.out.println();


    }
}
