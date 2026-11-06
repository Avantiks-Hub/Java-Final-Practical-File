class ComplexNumber {

    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Addition of complex numbers
    ComplexNumber add(ComplexNumber c) {

        double r = this.real + c.real;
        double i = this.imaginary + c.imaginary;

        return new ComplexNumber(r, i);
    }

    void display() {

        if (imaginary >= 0) {
            System.out.println(real + " + " +
                               imaginary + "i");
        } else {
            System.out.println(real + " - " +
                               Math.abs(imaginary) + "i");
        }
    }
}

public class Practical5 {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(2, 3);

        System.out.print("First Number: ");
        c1.display();

        System.out.print("Second Number: ");
        c2.display();

        ComplexNumber result = c1.add(c2);

        System.out.print("Sum: ");
        result.display();
    }
}