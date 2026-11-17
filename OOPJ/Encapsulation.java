package OOPJ;
//Bank Account
public class Encapsulation {
    private double balance;//prevents direct external access
    public double getBalance(){//reads balance
        return balance;
    }
    public void deposit(double amount){//provides contolled modification
        if(amount>0){//input validation
            balance+=amount;
        }
    }
}
class Bank{
    public static void main(String[] args){
        Encapsulation account=new Encapsulation();
        account.deposit(5000);
        System.out.println(account.getBalance());
    }
}
