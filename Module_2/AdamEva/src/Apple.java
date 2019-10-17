public class Apple {
    private int size;
    private String color;
    public Apple(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void beEaten() {
        if (this.size>0){
            this.size--;
        } else
            System.out.println("No more");
    }

    public int getSize(){
        return this.size;
    }

    @Override
    public String toString(){
        return ("Apple " + this.color + " have size: " + this.size);
    }
}
