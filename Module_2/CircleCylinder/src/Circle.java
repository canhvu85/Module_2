public class Circle {
    private double radius;
    private String color;


    public Circle(){}

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString(){
        return "A Circle with radius="
                + getRadius() + " with color: " + getColor();
    }
}
