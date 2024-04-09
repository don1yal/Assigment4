public class SolidWall extends Wall{
    @Override
    public Wall clone() {
        return new SolidWall();
    }
}
