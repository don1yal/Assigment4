import java.util.Map;

public class SimpleMazeBuilder implements MazeBuilder{
    private Maze maze;

    @Override
    public void reset() {
        maze = new Maze();
    }

    @Override
    public void addRoom(Room room) {
        maze.addRoom(room);
    }

    @Override
    public void addWall(Direction direction, Wall wall) {
        Room currentRoom = maze.getRooms().get(maze.getRooms().size() - 1);
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
        return maze;
    }
    private Direction getDirection(Room room1, Room room2) {
        for (Map.Entry<Direction, Wall> entry : room1.getSides().entrySet()) {
            if (entry.getValue() == null) {
                Direction direction = entry.getKey();
                if (room1.getAdjacentRoom(direction) == room2) {
                    return direction;
                }
            }
        }
        return null;
    }
}
