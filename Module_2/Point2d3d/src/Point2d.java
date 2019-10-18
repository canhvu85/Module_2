import java.util.Arrays;

public class Point2d {

    private float x;
    private float y;

    public Point2d(){}

    public Point2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public  float[] getXY(){
        float[] xy = new float[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    public String toString(){
        return "Position of 2d point: " + Arrays.toString(getXY());
    }
}
