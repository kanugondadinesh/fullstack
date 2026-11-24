class Student{
    private  String name="dinesh";
    private int roll =2006;
    public void getName() {

        System.out.println(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getRoll() {
        System.out.println(roll);
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
}
public class Main {
    public static void main(String[] args) {
        Student stu =new Student();
        stu.getName();
        stu.getRoll();
        stu.setName("kishore");
        stu.setRoll(120);
        stu.getName();
        stu.getRoll();
    }
}
