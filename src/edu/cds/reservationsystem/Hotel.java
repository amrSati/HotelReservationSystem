package edu.cds.reservationsystem;

public class Hotel {

    /**
     *  Data Fields
     */
    private String name;
    private Room[] rooms;

    /**
     *  Constructor
     */
    public Hotel(String name, int numberOfRooms) {
        this.name = name;
        rooms = new Room[numberOfRooms];
    }

    /**
     *  Methods
     */
    public String getName() {
        return name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    // Checks if rooms are all reserved
    public boolean isFull() {
        for (Room room: rooms)
            if (!room.isReserved()) return false;

        return true;
    }

    // Reserves a room in hotel and return true if success
    public boolean reserveRoom(Room room) {
        if (rooms[room.getRoomNumber() - 1].isReserved())   return false;

        rooms[room.getRoomNumber() - 1].setReserved(true);
        return true;
    }
}
