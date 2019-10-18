public class Cylinder extends Circle{
    private double height;

    public Cylinder(){

    }

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return getArea() * this.height;
    }

    @Override
    public  String toString(){
        return "This is Cylinder, has volume: " + getVolume() + " with color: " + getColor();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3,6,"yellow");
        System.out.println(cylinder);
    }
}
