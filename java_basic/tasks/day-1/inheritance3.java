public class inheritance3 {
    public static void main(String[] args) {
        Manager mn=new Manager();
        
        mn.display_person();
        mn.display_manager();
        mn.display_employee();

    }
}
class person{
    String name="abhi";
    void display_person(){
        System.out.println(name);
    }

}
class Employee extends person{
    int e_id=101;
    void display_employee(){
        System.out.println(e_id);
    }
}
class Manager extends Employee{
    String department ="sales";
    void display_manager(){
        System.out.println(department);
    }
}