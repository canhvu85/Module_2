public class Shape {
    private Rectangle rectangle;
    private Square square;
    private Circle circle;

    public Shape(Rectangle rectangle, Square square, Circle circle) {
        this.rectangle = rectangle;
        this.square = square;
        this.circle = circle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public void draw(){
        square.draw();
        rectangle.draw();
        circle.draw();
    }

    public double area(){
        return square.area()+rectangle.area()+circle.area();
    }

    public static void main(String[] args) {
//       Rectangle rectangle = new Rectangle(3,5);
//       Square square = new Square(6);
//       Circle circle = new Circle(8);
       Shape shape = new Shape(new Rectangle(3,5),new Square(3),new Circle(2));

       shape.draw();
       System.out.println(shape.getRectangle().area());
    }
}
