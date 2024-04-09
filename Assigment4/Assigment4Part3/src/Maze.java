import java.util.HashMap;
import java.util.Map;

public class Maze {
    private Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room r) {
        rooms.put(r.getRoomNo(), r);
    }
    public Map<Integer, Room> getRooms() {
        return rooms;
    }

    public Room roomNo(int r) {
        return rooms.get(r);
    }
}
