public class inheritance1 {
    public static void main(String[] args) {
        car c=new car();
        c.honk();
        c.display_details();
    }
    
}
/**
 * vehicle
 */
class vehicle {
    String brand="bmw";
    void honk(){
        System.out.println("beeep..beep......");
    } 
}
class car extends vehicle{
    String modelno="m4";
    void display_details(){
        System.out.println(brand);
        System.out.println(modelno);

    }
}