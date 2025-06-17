package corejava.opps.concepts;

public class EmployeeConstructor {
    int id;
    String name;
    float salary;

    EmployeeConstructor(String name,int id,float salary){
        this.id =id;
        this.name=name;
        this.salary=salary;

    }
    void display(){
        System.out.println ("NAME ="+name);
        System.out.println ("ID ="+ id);
        System.out.println ("salary ="+salary);

    }

    public static void main(String[] args) {
        EmployeeConstructor E = new EmployeeConstructor ("riya sharma",1,50000);
        E.display ();
    }
}
