package OOPJ;

abstract class Employee {
    int salary;
    abstract int calculateSalary();
}
class FullTimeEmployee extends Employee{
    @Override 
    int calculateSalary(){
        return salary=10000;
    }
}
class PartTimeEmployee extends Employee{
    @Override 
    int calculateSalary(){
        return salary=5000;
    }
}
public class EmployeeManagement{
    public static void main(String[] args){
        Employee e1=new FullTimeEmployee();
        Employee e2=new PartTimeEmployee();
        System.out.println("Full Time Salary:"+e1.calculateSalary());
        System.out.println("Part Time Salary:"+e2.calculateSalary());
    }
}
