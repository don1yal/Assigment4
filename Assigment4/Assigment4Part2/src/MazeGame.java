public class MazeGame {
    public static void main(String[] args) {
        Director director = new Director(new SimpleMazeBuilder());
        Maze maze = director.constructMaze();
        System.out.println("Maze created: \n" + maze);
    }
//    public static void createMaze() {
//        // Logic to create the maze
//        Maze maze = new Maze();
//        Room r1 = new Room(1);
//        Room r2 = new Room(2);
//        DoorWall d = new DoorWall(r1, r2);
//
//        maze.addRoom(r1);
//        maze.addRoom(r2);
//
//        r1.setSide(Direction.NORTH, d);
//        r1.setSide(Direction.EAST, new Wall());
//        r1.setSide(Direction.SOUTH, new Wall());
//        r1.setSide(Direction.WEST, new Wall());
//        r2.setSide(Direction.NORTH, new Wall());
//        r2.setSide(Direction.EAST, new Wall());
//        r2.setSide(Direction.SOUTH, d);
//        r2.setSide(Direction.WEST, new Wall());
//
//        System.out.println("Maze created: \n" + maze);
//    }
}

