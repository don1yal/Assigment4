public class DoorWall extends Wall{
    private Room r1;
    private Room r2;
    private boolean isOpen;

    public DoorWall(Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
        this.isOpen = false;
    }

    public void initialize(Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
    @Override
    public DoorWall clone() {
        DoorWall clonedDoorWall = new DoorWall(this.r1.clone(), this.r2.clone());
        clonedDoorWall.isOpen = this.isOpen;
        return clonedDoorWall;
    }
}
