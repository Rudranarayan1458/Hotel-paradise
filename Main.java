public class Main {

    public static void main(String[] args) {

        Hotel room = new Hotel("Luxury Suite", 101);
        room.displayRoom();

        Customer customer = new Customer(
                "Rahul",
                "rahul@gmail.com"
        );

        customer.displayCustomer();

        Booking booking = new Booking();
        booking.confirmBooking();
    }
}