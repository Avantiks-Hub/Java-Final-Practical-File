class Student {
    int rollNumber;
    String name;
    double marks1, marks2, marks3;

    // Constructor
    Student(int rollNumber, String name,
            double marks1, double marks2, double marks3) {

        this.rollNumber = rollNumber;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Calculate total marks
    double calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    // Calculate percentage
    double calculatePercentage() {
        return calculateTotal() / 3;
    }

    // Display student details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());

        System.out.println("Percentage: " +
                           calculatePercentage() + "%");

        System.out.println("---------------------");
    }
}

public class Practical1 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Aarav", 85, 90, 88);
        Student s2 = new Student(102, "Diya", 92, 89, 95);
        Student s3 = new Student(103, "Kabir", 76, 81, 79);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}