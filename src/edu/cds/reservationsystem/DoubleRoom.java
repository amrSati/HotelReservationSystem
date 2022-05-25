package edu.cds.reservationsystem;

public class DoubleRoom extends Room {

    // Type field
    private final RoomType type = RoomType.DOUBLE;

    /**
     *  Constructor
     */
    public DoubleRoom(int roomNumber) {
        setRoomNumber(roomNumber);
        setReserved(false);
    }

    /**
     *  Methods
     */
    @Override
    public String getType() {
        return type.getDisplayName();
    }

    // Implementation of abstract method
    @Override
    public double getPrice() {
        return 300;
    }
}
