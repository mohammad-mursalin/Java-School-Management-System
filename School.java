import java.util.List;

public class School {
    
    private List<Teacher> teachers;
    private List<Student> students;
    private int earning = 0;
    private int Spent = 0;

    School(List<Teacher> teachers, List<Student> students) {

        this.teachers = teachers;
        this.students = students;

    }

    public List<Teacher> getTeachers() {

        return teachers;
    }

    public List<Student> getStudents() {

        return students;
    }

    public int getEarning() {

        return earning;

    }

    public int getSpent() {

        return Spent;

    }

    public void addTeacher(Teacher teacher) {

        teachers.add(teacher);
    }

    public void addStudent(Student student) {

        students.add(student);
    }

    public void updateEaring(int earning) {

        this.earning +=earning;
    }

    public void updateSpent(int spending) {

        this.Spent +=spending;
    }

    public int getNetIncome() {

        return earning - Spent;
    }

    
}
