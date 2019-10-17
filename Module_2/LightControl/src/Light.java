public class Light {
    private boolean status;
    private boolean isConnected;

    public Light(boolean status) {
        this.status = status;
        this.isConnected = false;
    }

    public void setOff() {
        this.status = false;
    }

    public void setOn() {
        this.status = true;
    }

    public void connect(Switch s){
        this.status = s.getStatus();
        this.isConnected = true;
    }

    public boolean isConnected(){
        if (this.isConnected){
            return true;
        }
        return false;
    }


    public String toString(){
        return "Light status is : " + this.status;
    }
}
