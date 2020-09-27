import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<BedRoom> bedroomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;

    public String getName() {
        return name;
    }

    public ArrayList<BedRoom> getBedroomList() {
        return this.bedroomList;
    }

    public ArrayList<ConferenceRoom> getConferenceRoomList() {
        return conferenceRoomList;
    }

    public Hotel(String name) {
        this.name = name;
        this.bedroomList = new ArrayList<BedRoom>();
        this.conferenceRoomList = new ArrayList<ConferenceRoom>();

    }

    public int getRoomCount() {
        return this.bedroomList.size() + this.conferenceRoomList.size();
    }

    public void addBedRoomToRoomList(BedRoom room) {
        this.bedroomList.add(room);
    }

    public void addConferenceRoomToRoomList(ConferenceRoom room) {
        this.conferenceRoomList.add(room);
    }

    public boolean checkInGuestRoom(Guest guest) {

        for (BedRoom i : this.bedroomList)
            if (!i.isRoomFull()) {
                i.checkInGuest(guest);
                return true;
            }
        return false;
    }

    public void checkOutGuestRoom(Guest guest) {


        for (BedRoom i : this.bedroomList)
            i.checkOutGuest(guest);

    }

//    public Booking bookRoom(BedRoom room, int nightsBooked) {
//
//        Booking bookingNew = new Booking(room, nightsBooked);
//        return bookingNew;
//
//
//    }


}

