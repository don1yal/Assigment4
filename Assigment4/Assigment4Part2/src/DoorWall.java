public class DoorWall extends Wall{
    private Room r1;
    private Room r2;
    private boolean isOpen;

    public DoorWall (Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
        this.isOpen = false;
    }
    public boolean isOpen() {
        return isOpen;
    }
    public void setOpen(boolean open) {
        isOpen = open;
    }
    public Room getR1() {
        return r1;
    }

    public Room getR2() {
        return r2;
    }

    @Override
    public String toString() {
        return "DoorWall{" +
                "r1=" + r1 +
                ", r2=" + r2 +
                ", isOpen=" + isOpen +
                '}';
    }
}
