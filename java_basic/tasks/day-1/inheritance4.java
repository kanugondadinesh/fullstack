
public class inheritance4 {
    public static void main(String[] args) {
        android a=new android();
        iphone i= new iphone();
        a.turnon();
        i.turnon();
        a.makecall();
        i.makecall();
        
    }
}
class Device {
    String powersource;
    void turnon(){
        System.out.println("device power on ");
    }
}
class Mobile extends Device{
    double screensize;
    void makecall(){
        System.out.println("called");
    }
}
class android extends Mobile{
    void open_playstore(){

    }

}
class iphone extends Mobile{
    void open_apptore(){

    }
    
}