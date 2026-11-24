import java.util.Scanner;
public class calculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n1 =sc.nextInt();
        System.out.println("enter another number :");
        int n2= sc.nextInt();
        System.out.println("enter the appporator {-,+,*,/}:");
        String str=sc.next();
        char opp =str.charAt(0);
        switch (opp) {
            case '+':
                System.out.println(n1+n2);                
                break;

            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
        
            default:
                break;
        }

    }
}
