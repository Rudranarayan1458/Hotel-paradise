public class Customer {

    String name;
    String email;

    Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
    }
}
