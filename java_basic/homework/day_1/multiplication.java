import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer to generate a multiplicaation table :");
        int n=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println("n * "+i+" = "+n*i);
        }
    }
}
