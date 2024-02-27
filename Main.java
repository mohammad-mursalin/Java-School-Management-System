import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        Teacher sohag = new Teacher(101, 2000, "Sohag Sarkar");
        Teacher Liza = new Teacher(102, 2500, "Liza");
        Teacher anowar = new Teacher(103, 3000, "Anowar");

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(anowar);
        teachers.add(sohag);
        teachers.add(Liza);

        Student rafi = new Student(220626, "Rafi", 21);
        Student joy = new Student(220629, "Joy", 21);
        Student toki = new Student(220628, "Toki", 21);

        List<Student> students = new ArrayList<>();

        students.add(toki);
        students.add(rafi);
        students.add(joy);

        School pust = new School(teachers, students);
        
        toki.paysFees(10000);
        joy.paysFees(20000);
        rafi.paysFees(30000);

        pust.updateEaring(10000);
        pust.updateEaring(20000);
        pust.updateEaring(30000);

        sohag.salaryPaid(2000);
        Liza.salaryPaid(2500);
        anowar.salaryPaid(3000);

        pust.updateSpent(2000);
        pust.updateSpent(2500);
        pust.updateSpent(3000);

        System.out.println("Earning : " +pust.getEarning());
        System.out.println("Net Income : " +pust.getNetIncome());
        System.out.println("Total spent : " +pust.getSpent());

    }
}
