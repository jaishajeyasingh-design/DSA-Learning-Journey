package OOPJ;
class Student
{
    String name;
    int age;
    void study(){
        System.out.println("Student is studying");
    }
    void display(){
        System.out.println(name+" "+age);
    }
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Jaisha";
        s1.age=19;
        s1.display();
        s1.study();
    }
}
/*
    student-classname
    name,age-instance variable
    study()-method
*/
//output:Jaisha 19
/*understand 
student s1=new student();
student-class/reference type
s1-reference variable
new-allocates the object
student()-constructor invocation(calling or executing a method in java)
*/