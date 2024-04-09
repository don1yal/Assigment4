import java.util.Map;

public class ComplexMazeBuilder implements  MazeBuilder{
    private Maze maze;
    private Room currentRoom;

    @Override
    public void reset() {
        maze = new Maze();
    }

    @Override
    public void addRoom(Room room) {
        maze.addRoom(room);
        currentRoom = room;
    }

    @Override
    public void addWall(Direction direction, Wall wall) {
        currentRoom.setSide(direction, wall);
    }

    @Override
    public void addDoor(Room room1, Room room2, DoorWall doorWall) {
        Direction direction = getDirection(room1, room2);
        if (direction != null) {
            room1.setSide(direction, doorWall);
            room2.setSide(Direction.getOpposite(direction), doorWall);
        }
    }

    @Override
    public Maze build() {
        return null;
    }
    private Direction getDirection(Room room1, Room room2) {
        for (Map.Entry<Direction, Wall> entry : currentRoom.getSides().entrySet()) {
            if (entry.getValue() == null) {
                Direction direction = entry.getKey();
                if (room1 == room2) {
                    return direction;
                }
                Room adjacentRoom = room1.getAdjacentRoom(direction);
                if (adjacentRoom == room2) {
                    return direction;
                }
            }
        }
        return null;
    }
}
