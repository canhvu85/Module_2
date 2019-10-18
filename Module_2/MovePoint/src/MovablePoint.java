import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(){}

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(int x, int y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] speed = new float[2];
        speed[0] = this.xSpeed;
        speed[1] = this.ySpeed;

        return speed;
    }

    @Override
    public String toString(){
        return Arrays.toString(getXY()) + " has speed: " + Arrays.toString(getSpeed());
    }

    public void move(){
        setX(getX()+this.xSpeed);
        setY(getY()+this.ySpeed);
    }

    public static void main(String[] args) {
        
        MovablePoint movablePoint = new MovablePoint(4,4,1,2);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);

    }
}
