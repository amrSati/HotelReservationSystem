package edu.cds.reservationsystem;

public class SingleRoom extends Room {

    // Type field
    private final RoomType type = RoomType.SINGLE;

    /**
     *  Constructor
     */
    public SingleRoom(int roomNumber) {
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
        return 200;
    }
}
