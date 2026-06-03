public class Hotel {

    String roomType;
    int roomNumber;

    Hotel(String roomType, int roomNumber) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    void displayRoom() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Number: " + roomNumber);
    }
}