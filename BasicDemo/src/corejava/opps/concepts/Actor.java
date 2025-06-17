package corejava.opps.concepts;

public class Actor {
    String name;


    public String getName() {

        return name ;
    }
    public void setName(String name) {
        this.name = name;

    }
    public void display(){
        System.out.println (getName () );
    }

    public static void main(String[] args) {
        Actor  A = new Actor ();
        A.setName ("RITIK ROSHAN");
        A.getName ();
        A.display ();

        Actor B = new Actor ();
        B.setName ("RANBIR KAPPOR");
        B.getName ();
        B.display ();
    }
}
