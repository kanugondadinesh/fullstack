class animal{
  String name="kiran";
  void eat(){
    System.out.println("is eating "+name);
  }
}
class Dog extends animal{
  String breed="jarman shafad";
  void bark(){
    System.out.println(name+" the "+breed+" is barking");
  }
}

public class inheritansetask1 {
  public static void main(String[] args) {
    Dog obj = new Dog();
    obj.name="chintu";
    obj.breed="special";
    System.out.println(obj.breed);
    System.out.println(obj.name);
    obj.bark();
    obj.eat();
  }
  
}