import java.util.HashMap;
import java.util.Map;

public class Room {
    private Map<Direction, Wall> sides = new HashMap<>();
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }
    public Map<Direction, Wall> getSides() {
        return sides;
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
    public Room getAdjacentRoom(Direction direction) {
        Wall wall = sides.get(direction);
        if (wall instanceof DoorWall) {
            DoorWall door = (DoorWall) wall;
            if (door.getR1() == this) {
                return door.getR2();
            } else {
                return door.getR1();
            }
        }
        return null;
    }
    public void enter(Direction direction) {
        Wall wall = sides.get(direction);
        wall.enter();
    }

    @Override
    public String toString() {
        return "Room{" +
                "sides=" + sides +
                ", roomNo=" + roomNo +
                '}';
    }
}
