public class MazeGame {
    public static void main(String[] args) {
        Room roomPrototype = new Room(0);
        Wall wallPrototype = new Wall();
        DoorWall doorWallPrototype = new DoorWall(roomPrototype, roomPrototype);

        MazePrototypeFactory factory = new MazePrototypeFactory(roomPrototype, wallPrototype, doorWallPrototype);

        Maze maze = factory.createMaze();

        System.out.println("The maze has " + maze.getRooms().size() + " rooms.");
        for (Room room : maze.getRooms().values()) {
            System.out.println("Room #" + room.getRoomNo() + " has:");
            for (Direction direction : Direction.values()) {
                Wall wall = room.getSide(direction);
                String wallType = wall instanceof DoorWall ? "DoorWall" : "Wall";
                System.out.println("  " + direction + ": " + wallType);
            }
        }
    }
    }

