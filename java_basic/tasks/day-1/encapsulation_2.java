public class encapsulation_2 {
    public static void main(String[] args) {
        bankaccount bc =new bankaccount();
        bc.getBalance();
        bc.deposit(1990);
        bc.getBalance();
        bc.withdraw(5000);
        bc.getBalance();

    }
}
class bankaccount {
    private String accountholder="rakesh";
    private double balance=100000;
    public void withdraw(double n){
        if (balance<n)
            balance-=n;
        else{
            System.out.println("invalid");
        }


    }
    public void deposit(double n){
        balance+=n;
        
    }
    public void getBalance() {
        System.out.println(balance);
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
