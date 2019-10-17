public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area(){
        return this.side * this.side;
    }

    public void draw(){
        System.out.println("This is Square");
    }
}
