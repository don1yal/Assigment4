import java.util.HashMap;
import java.util.Map;

public class Maze {
    private Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room room) {
        rooms.put(room.getRoomNo(), room);
    }
    public Room roomNo(int r) {
        return rooms.get(r);
    }

    public Map<Integer, Room> getRooms() {
        return rooms;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Maze{rooms=");
        builder.append(rooms.keySet());
        builder.append("}");
        return builder.toString();
    }
}

