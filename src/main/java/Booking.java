public class Booking {
    private BedRoom room;
    int nightsBooked;

 public Booking (BedRoom room, int nightsBooked){

     this.room = room;
     this.nightsBooked= nightsBooked;


 }

    public double totalBill(){
     return this.nightsBooked * this.room.getRate();

    }





}
