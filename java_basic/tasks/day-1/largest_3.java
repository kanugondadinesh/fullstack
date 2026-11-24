import java.util.Scanner;
public class largest_3 {
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 :");
        int n1=sc.nextInt();
        System.out.println("enter 2 :");
        int n2=sc.nextInt();
        System.out.println("enter 3 :");
        int n3=sc.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println("largest is "+n1);
        }
        else if (n2>n3){
            System.out.println("largest is "+n2);
        }
        
        else{
            System.out.println("largest is "+n3);
        }
    }
}