import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String roomName;
    private RoomTypeOptions roomType;



    public ConferenceRoom(String roomName, RoomTypeOptions roomType){
        super(roomType.getValue());

    }

    public String getRoomName() {
        return roomName;
    }

    public RoomTypeOptions getRoomType() {
        return roomType;
    }
}
