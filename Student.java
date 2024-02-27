public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid = 0;
    private int feesTotal = 30000;

    Student(int id, String name, int grade) {

        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    public void setGrade(int grade) {

        this.grade = grade;

    }

    public void paysFees(int fees) {

        feesPaid += fees;

    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;

    }

    public int getGrade() {

        return grade;

    }

    public int getFeesPaid() {

        return feesPaid;

    }

    public int getFeesTotal() {

        return feesTotal;

    }

    public int getRemainingFees() {

        return feesTotal - feesPaid;

    }

    public String toString() {

        return name;
    }
}