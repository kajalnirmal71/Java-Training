package demo.basic;

public class Employee {
    int id;
    String name;
    char qualification;
    float salary;
    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.id=11;
        e1.name= "Priyanka";
        e1.qualification= 'B';
        e1.salary= 20000f;
        System.out.println("id ="+e1.id);
        System.out.println("Name ="+e1.name);
        System.out.println("Qualification ="+e1.qualification);
        System.out.println("salary = "+e1.salary);
    }
}

