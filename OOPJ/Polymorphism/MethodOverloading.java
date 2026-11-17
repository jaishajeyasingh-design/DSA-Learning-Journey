package OOPJ.Polymorphism;
class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverloading {//Same method name different parameters
    public static void main(String[] args){
        Calculator c=new Calculator();
        System.out.println(c.add(1,3));
        System.out.println(c.add(3,4,5));
    }
}
