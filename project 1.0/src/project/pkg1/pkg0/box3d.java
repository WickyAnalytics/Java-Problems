package project.pkg1.pkg0;

public class box3d extends box {
    private int height;

    // empty constructor
    public box3d() {
        super();
        height = 0;
    }

    // constructor
    public box3d(int x, int y, int z) {
        super.setvalue(x, y);
        height = z;
    }

    public void setvalue(int x, int y, int z) {
        super.setvalue(x, y);
        height = z;
    }

    public int volume() {
        return (super.area() * height);
    }
}
