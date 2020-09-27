import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;

    Hotel hotel;
    BedRoom bedroom1;
    Guest guest;


    @Before
    public void setUp() {
        bedroom1 = new BedRoom("114A", RoomTypeOptions.KING , 20);
        booking= new Booking(bedroom1,3);
        hotel = new Hotel("CodeClan Towers");
        guest = new Guest();
        hotel.addBedRoomToRoomList(bedroom1);

    }

    @Test
    public void calculateTotalBill() {

        assertEquals(60.0, booking.totalBill(),0.2);
    }

}
