public class Director {
    private final MazeBuilder builder;

    public Director(MazeBuilder builder) {
        this.builder = builder;
    }

    public Maze constructMaze() {
        builder.reset();

        Room room1 = new Room(1);
        Room room2 = new Room(2);
        builder.addRoom(room1);
        builder.addRoom(room2);

        builder.addWall(Direction.NORTH, new Wall());
        builder.addWall(Direction.EAST, new Wall());
        builder.addWall(Direction.SOUTH, new Wall());
        builder.addWall(Direction.WEST, new Wall());
        builder.addWall(Direction.NORTH, new Wall());
        builder.addWall(Direction.EAST, new Wall());
        builder.addWall(Direction.SOUTH, new Wall());
        builder.addWall(Direction.WEST, new Wall());
        DoorWall door = new DoorWall(room1, room2);
        builder.addDoor(room1, room2, door);

        return builder.build();
    }
}
