class Employee {

    String employeeName;
    double salary;

    static int employeeCount = 0;

    // Default Constructor
    Employee() {
        this("Unknown", 0);
    }

    // Parameterized Constructor
    Employee(String employeeName, double salary) {

        this.employeeName = employeeName;
        this.salary = salary;

        employeeCount++;
    }

    void display() {

        System.out.println("Employee Name: " +
                           this.employeeName);

        System.out.println("Salary: " + this.salary);
    }

    // Static Method
    static void displayCount() {

        System.out.println("Total Employees: " +
                           employeeCount);
    }
}

public class Practical9 {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Rahul", 35000);

        Employee e3 = new Employee("Aman", 45000);

        e1.display();

        System.out.println();

        e2.display();

        System.out.println();

        e3.display();

        System.out.println();

        Employee.displayCount();
    }
}