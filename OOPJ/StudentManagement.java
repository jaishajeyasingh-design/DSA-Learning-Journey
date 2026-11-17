package OOPJ;

public class StudentManagement {
    String name;
    int regno;
    int mark1,mark2,mark3;
    double average(){
       return (mark1+mark2+mark3)/3.0;
      }
      void display(){
        System.out.println("Name:"+name);
        System.out.println("Register Number:"+regno);
        System.out.println("Marks:"+mark1+" "+mark2+" "+mark3);
        System.out.println("Average:"+average());
      }
      public static void main(String[] args){
        StudentManagement s1=new StudentManagement();
        s1.name="Jaisha";
        s1.regno=205091;
        s1.mark1=90;
        s1.mark2=95;
        s1.mark3=99;
        s1.display();
      }
}
