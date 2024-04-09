public interface MazeBuilder {
    void reset();
    void addRoom(Room room);
    void addWall(Direction direction, Wall wall);
    void addDoor(Room room1, Room room2, DoorWall doorWall);
    Maze build();
}
