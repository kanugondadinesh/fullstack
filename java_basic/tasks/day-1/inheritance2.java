public class inheritance2 {
    public static void main(String[] args) {
        circle c=new circle();
        rectangle r=new rectangle();

    }
}
/**
 * 
 */
class shape{
    String color;
    void display_color(){

    }
}

class circle extends shape {
    
    
    void calculaterarea(){
        double radius=10;
        
    }

    
}
class rectangle extends shape{
    rectangle() {
       int len=20;
    int wid=10 ;
    color = "red";
    }
    

}