package corejava.opps.concepts;

public class ConstructorOverloading {
    String name ;
    int age ;

    public ConstructorOverloading(){
        name = "unknown";
        age = 0;
    }
    public ConstructorOverloading(String name){
        this.name = name;
        this. age = 0;
    }
    public ConstructorOverloading(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println ("name : " + name + "  , " + "age :"+age);
    }

    public static void main(String[] args) {
        ConstructorOverloading C1 = new ConstructorOverloading ();
        ConstructorOverloading C2 = new ConstructorOverloading ("roy");
        ConstructorOverloading C3 = new ConstructorOverloading ("charlie",25);

        C1.display ();
        C2.display ();
        C3.display ();

    }
}
