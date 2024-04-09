import java.util.HashMap;
import java.util.Map;

public class Room {
    private Map<Direction, Wall> sides = new HashMap<>();
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }
    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public Wall getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, Wall wall) {
        sides.put(direction, wall);
    }

    public int getRoomNo() {
        return roomNo;
    }

    public Room clone() {
        Room clonedRoom = new Room(this.roomNo);
        for (Direction d : sides.keySet()) {
            clonedRoom.setSide(d, sides.get(d).clone());
        }
        return clonedRoom;
    }
}
