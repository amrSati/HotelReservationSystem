package edu.cds.reservationsystem;

public abstract class Room {

    /**
     *  Data Fields
     */
    private int roomNumber;
    private boolean isReserved;

    /**
     *  Methods
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public abstract double getPrice();

    public abstract String getType();
}
