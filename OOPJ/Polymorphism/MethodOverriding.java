package OOPJ.Polymorphism;
class Animal{
    void dance(){
        System.out.println(".....");
    }
    void sound(){
        System.out.println("animal sound");
    }
}
class Dog extends Animal{
    @Override 
    void sound(){
        System.out.println("Dog barks");
    }
}
public class MethodOverriding {
    public static void main(){
        Animal a=new Dog();
        a.sound();
        a.dance();
    }
}
