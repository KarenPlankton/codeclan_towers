import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guestList;

    public Room (int capacity) {
        this.capacity = capacity;
        this.guestList= new ArrayList<Guest>();
    }

    public void checkInGuest(Guest g){
        this.guestList.add(g);
    }

    public void checkoutGuest(Guest g){
        this.guestList.remove(g);
    }

    public int getCapacity() {
        return capacity;
    }

    /**
     * This method returns the number of guests.
     */
    public int getGuestListSize(){
        return guestList.size();
    }
}





