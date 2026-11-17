package OOPJ;
interface Payment{
    void pay(double amount);
}
class UPI implements Payment{
    @Override 
    public void pay(double amount){
        System.out.println("UPI payment of Rs."+amount);
    }
}
public class Interface {
    public static void main(String[] args){
        UPI u=new UPI();
        u.pay(500);
    }
}
