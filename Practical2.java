// Single Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Multilevel Inheritance
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void work() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    void manage() {
        System.out.println("Department: " + department);
    }
}

// Hierarchical Inheritance
class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class Practical2 {
    public static void main(String[] args) {

        System.out.println("Single Inheritance");

        Car car = new Car();
        car.start();
        car.drive();

        System.out.println("\nMultilevel Inheritance");

        Manager m = new Manager("Rahul", 101, "IT");
        m.introduce();
        m.work();
        m.manage();

        System.out.println("\nHierarchical Inheritance");

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.display();
        System.out.println("Circle Area: " + c.area());

        r.display();
        System.out.println("Rectangle Area: " + r.area());
    }
}