public class Human {
    private String name;
    private double weight;
    private String sex;

    public Human(String name, double weight, String sex) {
        this.name = name;
        this.weight = weight;
        this.sex = sex;
    }

    public void eat(Apple a){
        if (a.getSize()>0){
            this.weight++;
            a.beEaten();
        } else
            this.say("have no apple");
    }

    public void say(String str){
        System.out.println(str);
    }

    @Override
    public String toString(){
        return this.name + " have weight: " + this.weight;
    }

    public static void main(String[] args) {

        Human adam = new Human("Adam", 65, "male");
        Human eva = new Human("Eva", 50, "female");
        Apple apple = new Apple(1, "green");

        System.out.println(adam);
        System.out.println(eva);
        System.out.println(apple);

        adam.eat(apple);
        System.out.println(adam);
        System.out.println(apple);

        eva.eat(apple);
        System.out.println(eva);
        System.out.println(apple);

        adam.say("hi Eva baby");
        eva.say("hi there");

    }
}
