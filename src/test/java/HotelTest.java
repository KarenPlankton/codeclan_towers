import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class HotelTest {

    Hotel hotel;
    BedRoom bedroom1;
    ConferenceRoom confRoom1;
    Guest guest;


    @Before
    public void setUp() {
        hotel = new Hotel("CodeClan Towers");
        guest =new Guest();
        bedroom1= new BedRoom("114A", RoomTypeOptions.KING, 20 );
        confRoom1=new ConferenceRoom("Lincoln",RoomTypeOptions.BOARDROOM);
        hotel.addBedRoomToRoomList(bedroom1);
        hotel.addConferenceRoomToRoomList(confRoom1);
    }

   @Test
   public void canCheckInGuests() {
        hotel.checkInGuestRoom(guest);

       assertEquals(1, bedroom1.getGuestListSize());
  }
   @Test
   public void canCheckOutGuests() {
        hotel.checkInGuestRoom(guest);
        hotel.checkOutGuestRoom(guest);


        assertEquals(0,bedroom1.getGuestListSize());


   }






}
