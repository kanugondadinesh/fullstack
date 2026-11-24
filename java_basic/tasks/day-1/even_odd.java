import java.util.Scanner;

public class even_odd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int num= sc.nextInt();
        if (num%2==0){
            if(num%4==0){
                System.out.println("entered number is even and a leep year");
            }
            else{
                System.out.println("entered number is even and not a leep year");
            }
        }
        else{
            System.out.println("entered number is odd and not a leep year");
        }
    }
}