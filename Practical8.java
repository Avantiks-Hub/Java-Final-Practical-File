class Product {

    String productName;
    double price;
    int quantity;

    // No Argument Constructor
    Product() {
        this("Unknown", 0, 0);
    }

    // One Parameter Constructor
    Product(String productName) {
        this(productName, 0, 0);
    }

    // Two Parameter Constructor
    Product(String productName, double price) {
        this(productName, price, 1);
    }

    // Three Parameter Constructor
    Product(String productName, double price, int quantity) {

        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void display() {

        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);

        System.out.println("Total Cost: " +
                           calculateTotalCost());

        System.out.println("-------------------");
    }
}

public class Practical8 {
    public static void main(String[] args) {

        Product p1 = new Product();

        Product p2 = new Product("Keyboard");

        Product p3 = new Product("Mouse", 599);

        Product p4 = new Product("Monitor", 8500, 2);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}