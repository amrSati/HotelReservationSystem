package edu.cds.reservationsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {

    @Test
    void testHotel() {
        // Create hotel with 10 rooms
        Hotel myHotel = new Hotel("My Hotel", 10);

        // Add rooms
        for (int i = 0, j = 5; i < 5; i++, j++) {
            myHotel.getRooms()[i] = new SingleRoom(i + 1);
            myHotel.getRooms()[j] = new DoubleRoom(j + 1);
        }

        // Reserve rooms 1, 3, 5, 10 and 6 if not reserved
        assertTrue(myHotel.reserveRoom(myHotel.getRooms()[0]));
        assertTrue(myHotel.reserveRoom(myHotel.getRooms()[2]));
        assertTrue(myHotel.reserveRoom(myHotel.getRooms()[4]));
        assertTrue(myHotel.reserveRoom(myHotel.getRooms()[9]));
        if (!myHotel.getRooms()[5].isReserved())
            assertTrue(myHotel.reserveRoom(myHotel.getRooms()[5]));

        // Reserve room 1  if reserved then reserve room 2
        if (myHotel.getRooms()[0].isReserved())
            assertTrue(myHotel.reserveRoom(myHotel.getRooms()[1]));
        else
            assertTrue(myHotel.reserveRoom(myHotel.getRooms()[0]));
    }

}