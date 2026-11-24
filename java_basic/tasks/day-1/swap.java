import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n1 = sc.nextInt();
        System.out.println("enter a number :");
        int n2 = sc.nextInt();
        n2 = n1 * n2;
        n1 = n2 / n1;
        n2 = n2 / n1;
        System.out.println("n1 " + n1 + "\nn2 " + n2);
    }

}
