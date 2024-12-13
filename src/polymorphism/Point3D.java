package polymorphism;

public class Point3D extends Point{
    private int z;

    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    protected String location(){
        return super.location() + ", " + z; //resulting string form "x,y,z";
    }

    @Override
    public int manHattanDistanceFromOrigin() {
        //first fetch the data from superclass based on x,y
        // then add z to that
        return super.manHattanDistanceFromOrigin() + Math.abs(z);
    }
}
