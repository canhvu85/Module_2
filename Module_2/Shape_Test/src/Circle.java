public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area(){
        return this.radius*this.radius*Math.PI;
    }

    public void draw(){
        System.out.println("This is Circle");
    }

}
