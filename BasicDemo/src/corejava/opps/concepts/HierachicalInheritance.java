package corejava.opps.concepts;
class Employee{
    void work(){
        System.out.println ("demo.basic.Employee is working");
    }
}
class Manager extends Employee{
    void manageTeam(){
        System.out.println ("Manager is managing the team");
    }
}
class Developer extends Employee{
    void writeCode(){
        System.out.println ("Developer is writing the code");
    }
}
public class HierachicalInheritance {
    public static void main(String[] args) {
      //  manager object
        Manager m = new Manager ();
        m.work ();             // employee method
        m.manageTeam ();        //manager method

       // developer object
        Developer d = new Developer ();
        d.work ();             //employee method
        d.writeCode ();        //developer method
    }

}
