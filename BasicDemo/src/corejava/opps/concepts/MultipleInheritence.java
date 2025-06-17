package corejava.opps.concepts;

   interface Printer{
       void print();
}

   interface Scanner{
        void scan();
}

class AllInOneMachine implements Printer,Scanner{

    public void print() {
        System.out.println ("printing documents");
    }

    public void scan() {
        System.out.println ("scanning documents");
    }
}
public class MultipleInheritence {
    public static void main(String[] args) {
        AllInOneMachine machine = new AllInOneMachine ();
        machine.print ();
        machine.scan ();
    }

}
