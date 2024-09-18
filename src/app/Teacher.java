package app;

//класс наследуемой сущности от базовой - реализация S, O, L принципов SOLID

public class Teacher extends User {

    private Integer teacherId;

    public Teacher(Integer teacherId, String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName=" + super.getFirstName() +
                ", lastName=" + super.getLastName() +
                ", middleName=" + super.getMiddleName() +
                '}';
    }
}
