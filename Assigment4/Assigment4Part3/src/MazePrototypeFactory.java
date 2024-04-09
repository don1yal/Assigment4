public class MazePrototypeFactory {
    private Room roomPrototype;
    private Wall wallPrototype;
    private DoorWall doorWallPrototype;

    public MazePrototypeFactory(Room roomPrototype, Wall wallPrototype, DoorWall doorWallPrototype) {
        this.roomPrototype = roomPrototype;
        this.wallPrototype = wallPrototype;
        this.doorWallPrototype = doorWallPrototype;
    }

    public Maze createMaze() {
        Maze maze = new Maze();

        Room room1 = roomPrototype.clone();
        room1.setRoomNo(1);
        Room room2 = roomPrototype.clone();
        room2.setRoomNo(2);

        DoorWall door = (DoorWall) doorWallPrototype.clone();
        door.initialize(room1, room2);

        room1.setSide(Direction.NORTH, wallPrototype.clone());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, wallPrototype.clone());
        room1.setSide(Direction.WEST, wallPrototype.clone());

        room2.setSide(Direction.NORTH, wallPrototype.clone());
        room2.setSide(Direction.EAST, wallPrototype.clone());
        room2.setSide(Direction.SOUTH, door);
        room2.setSide(Direction.WEST, wallPrototype.clone());

        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }
}
