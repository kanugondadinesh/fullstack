class Employeee{
  String name;
  double base_salary;
  void displayBaseInfo(){
    System.out.println("name and salary is "+name +" : "+ base_salary);
  }
}
class Developer extends Employeee{
  String programmingLanguage;
  void writeCode(){
    System.out.println("writing code of :"+programmingLanguage);
  }
}
class Tester extends Employeee{
  String testingTool;
  void runTest(){
    System.out.println("tester testing using tool :"+testingTool);
  }
}
public class inheritancetask3 {
  public static void main(String[] args) {
    Developer dev=new Developer();
    Tester test=new Tester();
    dev.name="kishore";
    test.name="kiran";
    dev.programmingLanguage="java";
    dev.base_salary=200000.2;
    dev.displayBaseInfo();
    dev.writeCode();
    test.testingTool="IBM";
    test.runTest();
  }
  
}