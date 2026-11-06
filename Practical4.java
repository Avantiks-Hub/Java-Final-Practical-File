// Method Overloading
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Method Overriding
class EmployeePay {

    double calculatePay() {
        return 0;
    }
}

class FullTimeEmployee extends EmployeePay {

    double salary;

    FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    double calculatePay() {
        return salary;
    }
}

class PartTimeEmployee extends EmployeePay {

    int hours;
    double rate;

    PartTimeEmployee(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculatePay() {
        return hours * rate;
    }
}

public class Practical4 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Method Overloading");

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(2.5, 3.5));

        System.out.println("\nMethod Overriding");

        EmployeePay e1 = new FullTimeEmployee(50000);
        EmployeePay e2 = new PartTimeEmployee(80, 300);

        System.out.println("Full Time Pay: " +
                           e1.calculatePay());

        System.out.println("Part Time Pay: " +
                           e2.calculatePay());
    }
}