package OOPJ;
abstract class Vehicle{
    abstract void start();
    void fuel(){
        System.out.println("Vehicle needs energy.");
    }
}
class Car extends Vehicle{
    @Override //i am providing new implementation of an inherited method
    void start(){
        System.out.println("car is started using key");

    }
}
public class Abstraction {
    public static void main(String[] args){
        Car c=new Car();
        c.start();
        c.fuel();
    }
}
