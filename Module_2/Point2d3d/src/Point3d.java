import java.util.Arrays;

public class Point3d extends Point2d{
    private float z;

    public Point3d(){

    }

    public Point3d(int x, int y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] XYZ = new float[3];
        XYZ[0] = super.getXY()[0];
        XYZ[1] = super.getXY()[1];
        XYZ[2] = this.z;

        return XYZ;
    }

    @Override
    public String toString(){
        return "Position of 3d point: " + Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Point3d point3d = new Point3d(1,2,3);
        System.out.println(point3d);
    }
}
