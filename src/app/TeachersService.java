package app;

//класс с сервисами(методами) работы с сущностями Teacher - реализация S, O, D принципов SOLID

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeachersService {

    private List<Teacher> teachers;

    public TeachersService() {
        this.teachers = new ArrayList<>();
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        int newTeacherId = 1;
        if (teachers.size() > 0) {
            newTeacherId = teachers.get(teachers.size() - 1).getTeacherId() + 1;
        }
        teachers.add(new Teacher(newTeacherId, firstName, lastName, middleName));
    }

    public Teacher searchTeacherByID(int teacherID) {
        for (Teacher teacher: teachers) {
            if (teacher.getTeacherId() == teacherID) {
                return teacher;
            }
        }
        return null;
    }

    public List<Teacher> searchTeachersByFIO(String firstName, String lastName, String middleName) {
        List<Teacher> foundTeachers = new ArrayList<>();
        for (Teacher teacher: teachers) {
            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName) && teacher.getMiddleName().equals(middleName)) {
                foundTeachers.add(teacher);
            }
        }
        return foundTeachers;
    }

    public void removeTeacher(Teacher teacherToRemove) {
        teachers.remove(teacherToRemove);
    }

    public boolean editTeacher(Teacher editTeacher, Teacher newTeacher) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).equals(editTeacher)) {
                teachers.set(i, newTeacher);
                return true;
            }
        }
        return false;
    }


    public List<Teacher> getSortedTeachersByComparator(UsersComparator<Teacher> teachersComparator) {
        List<Teacher> sortedTeachersList = new ArrayList<>(teachers);
        Collections.sort(sortedTeachersList, teachersComparator);
        return sortedTeachersList;
    }
}
