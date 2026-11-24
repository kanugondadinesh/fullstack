import java.util.Scanner;

public class encapsulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double len=sc.nextDouble();
        double wid=sc.nextDouble();
        rectangle rec= new rectangle();
        rec.setLength(len);
        rec.setWidth(wid);
        System.out.println(2*(rec.getLength()+rec.getWidth()));
    }
    
}
class rectangle{
    private double length ;
    private double width ;
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
}
