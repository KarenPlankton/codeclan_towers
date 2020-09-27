import java.util.ArrayList;

public class BedRoom extends Room {

    private  String roomNumber;
    private RoomTypeOptions roomType;
    private double rate;

    public BedRoom(String roomNumber, RoomTypeOptions roomType, int rate){
        super(roomType.getValue());
        this.roomNumber=roomNumber;
        this.roomType=roomType;
        this.rate=rate;

    }
    public double getRate(){
        return this.rate;
    }

    public void checkInGuest(Guest guest){
        if(!this.isRoomFull()) {
            super.checkInGuest(guest);
        } else {
            System.out.println("Room is full");
        }
    }

    public boolean isRoomFull(){
        int guests=super.getGuestListSize();
        if(guests<super.getCapacity()){
            return false;
        }
        return true;
    }

     public void checkOutGuest(Guest guest){
        super.checkoutGuest(guest);
     }
}
