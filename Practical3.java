// First Interface
interface Printable {
    void print();
}

// Second Interface
interface Scannable {
    void scan();
}

// Implementing Multiple Interfaces
class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

// Hybrid Inheritance
class Machine {
    void switchOn() {
        System.out.println("Machine switched on");
    }
}

class OfficePrinter extends Machine implements Printable {

    public void print() {
        System.out.println("Office Printer is printing");
    }
}

public class Practical3 {
    public static void main(String[] args) {

        System.out.println("Multiple Inheritance");

        AllInOnePrinter printer = new AllInOnePrinter();

        printer.print();
        printer.scan();

        System.out.println("\nHybrid Inheritance");

        OfficePrinter op = new OfficePrinter();

        op.switchOn();
        op.print();
    }
}