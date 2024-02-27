public class Teacher {
    
    private int id;
    private String name;
    private int totalSalary;
    private int salaryPaid = 0;

    Teacher(int id, int salary, String name) {

        this.id = id;
        this.name = name;
        this.totalSalary = salary;

    }

    public String getName() {

        return name;

    }

    public int getId() {

        return id;

    }

    public int getTotalSalary() {

        return totalSalary;

    }

    public void salaryPaid(int salary) {

        salaryPaid +=salary;
    }

    public int getSalaryPaid() {

        return salaryPaid;

    }

    public int remainingSalary() {

        return totalSalary - salaryPaid;
        
    }

    public String toString() {

        return name;
    }

}
