package OOPJ;

public class BankAccount {
    private double balance;//Encapsulation
    public void deposit(double amount){
        if(amount>0){
        balance+=amount;
        }
        else{
            System.out.println("Invalid Deposit");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Invalid Withdrawal");
        }
    }
    public double getBalance(){//getter method
        return balance;
    }
}
class Main{
    public static void main(String[] args){
        BankAccount acc=new BankAccount();
        acc.deposit(5000);
        System.out.println("Balance:"+acc.getBalance());
        acc.withdraw(1000);
        System.out.println("Balance:"+acc.getBalance());
        acc.withdraw(6000);
        System.out.println("Balance:"+acc.getBalance());
    }
}