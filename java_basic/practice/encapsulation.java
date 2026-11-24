class Mobile{
  private String brand = "iq ";
  void  getter(){
    System.out.println(brand);
  }
  void setter(String s){
    brand=s;
  }

}
public class encapsulation {
  public static void main(String[] args) {
    Mobile obj =new Mobile();
    obj.getter();
    obj.setter("samsung");
    obj.getter();
  }
  
}