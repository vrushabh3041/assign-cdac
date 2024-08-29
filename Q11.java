class Q111 {
    String firstName;
    String lastName;
    double monthlySalary;

    void emp_init(String fName, String lName, double salary) {
        firstName = fName;
        lastName = lName;
        if (salary > 0.0) {
            monthlySalary = salary;
        }
    }

    void set_salary(double salary) {
        if (salary > 0.0) {
            monthlySalary = salary;
        }
    }

    void emp_display() {
        System.out.println("Employee: " + firstName + " " + lastName);
        System.out.println("Monthly Salary: " + monthlySalary);
    }

    double yearlySalary() {
        return monthlySalary * 12;
    }
}

public class Q11 {
    public static void main(String[] args) {
        Q111 emp1 = new Q111();
        emp1.emp_init("John", "Doe", 3000);
        emp1.emp_display();
        System.out.println("Yearly Salary: " + emp1.yearlySalary());

        Q111 emp2 = new Q111();
        emp2.emp_init("Jane", "Smith", 3500);
        emp2.emp_display();
        System.out.println("Yearly Salary: " + emp2.yearlySalary());

        emp1.set_salary(emp1.monthlySalary * 1.10);
        emp2.set_salary(emp2.monthlySalary * 1.10);

        System.out.println("After 10% raise:");
        emp1.emp_display();
        System.out.println("Yearly Salary: " + emp1.yearlySalary());

        emp2.emp_display();
        System.out.println("Yearly Salary: " + emp2.yearlySalary());
    }
}
