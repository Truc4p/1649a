package fgw.Extra_Topics.UML_Association;

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Order {
    private Customer customer;
    private String product;

    public Order(Customer customer, String product) {
        this.customer = customer;
        this.product = product;
    }

    public void printDetails() {
        System.out.println("Customer: " + customer.getName() + ", Product: " + product);
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice");
        Order order1 = new Order(customer1, "Laptop");
        Order order2 = new Order(customer1, "Keyboard");

        order1.printDetails(); // Output: Customer: Alice, Product: Laptop
        order2.printDetails(); // Output: Customer: Alice, Product: Keyboard
    }
}