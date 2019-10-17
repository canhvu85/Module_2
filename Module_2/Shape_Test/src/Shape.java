public class Shape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,5);
        Circle circle = new Circle(3);
        Square square = new Square(5);

        rectangle.draw();
        System.out.println(rectangle.area());

        circle.draw();
        System.out.println(circle.area());

        square.draw();
        System.out.println(square.area());
    }
}
