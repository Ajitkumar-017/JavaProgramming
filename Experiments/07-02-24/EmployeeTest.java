import java.util.Scanner;

class Employee {
    private String FirstName;
    private String LastName;
    private double MonthlySalary;

    public void setName(String name) {
        this.FirstName = name;
    }

    public void setLast(String LastName) {
        this.LastName = LastName;
    }

    public void setMonthly(double monthly) {
        this.MonthlySalary = monthly;
    }

    public String getName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getMonthly() {
        return MonthlySalary;
    }

    public double DisplayYearly() {
        double yearly = getMonthly() * 12;
        double raise = yearly + yearly * 10 / 100;
        System.out.println("Yearly raised salary is " + raise);
        return raise;
    }

    public void displayobj() {
        System.out.println("First name is :" + getName());
        System.out.println("Last name is :" + getLastName());
        System.out.println("Monthly salary is :" + getMonthly());
        System.out.println("Yearly salary after raise is: "+DisplayYearly());
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee o1 = new Employee();
        Employee o2 = new Employee();
        o1.setName("Ajit");
        o1.setLast("Rathod");
        o1.setMonthly(100000);
        o1.displayobj();

        o2.setName("ABC");
        o2.setLast("XYZ");
        o2.setMonthly(1000);
        o2.displayobj();
    }
}
