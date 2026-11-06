class Book {

    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    // Parameterized Constructor
    Book(String title, String author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy Constructor
    Book(Book b) {

        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    void display() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

        System.out.println("----------------");
    }
}

public class Practical6 {
    public static void main(String[] args) {

        Book b1 = new Book();

        Book b2 = new Book(
            "The Alchemist",
            "Paulo Coelho",
            399
        );

        Book b3 = new Book(b2);

        System.out.println("Default Constructor");
        b1.display();

        System.out.println("Parameterized Constructor");
        b2.display();

        System.out.println("Copy Constructor");
        b3.display();

        // Modifying copied object
        b3.price = 450;

        System.out.println("After Modification");

        System.out.println("Original Price: " + b2.price);
        System.out.println("Copied Price: " + b3.price);
    }
}