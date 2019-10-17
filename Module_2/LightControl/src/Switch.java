public class Switch {
    private boolean status;

    public Switch(boolean status) {
        this.status = status;
    }

    public void turnOn(Light l){
        if (l.isConnected()){
            this.status = true;
            l.setOn();
        }
    }

    public  void turnOff(Light l){
       if (l.isConnected()){
           this.status = false;
           l.setOff();
       }
    }

    public boolean getStatus() {
        return status;
    }

    public String toString(){
        return "Switch status is: " + this.status;
    }

    public static void main(String[] args) {

        Switch mySwitch = new Switch(false);
        Light myLight = new Light(true);

        System.out.println(myLight);
        System.out.println(mySwitch);
        System.out.println("********************");

        mySwitch.turnOn(myLight);
        System.out.println(myLight);
        System.out.println(mySwitch);
        System.out.println("********************");

        myLight.connect(mySwitch);
        System.out.println(myLight);
        System.out.println(mySwitch);
        System.out.println("********************");

        mySwitch.turnOn(myLight);
        System.out.println(myLight);
        System.out.println(mySwitch);

    }

}
