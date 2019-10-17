public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(){
        return this.width * this.height;
    }

    public void draw(){
        System.out.println("This is Rectangle");
    }
}
