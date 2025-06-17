package corejava.opps.concepts;

public class PublicAccessModifier {


    public void show () {
            System.out.println ("public modifier access within the package or outside of the package.OR within project anywhere.");
        }

    public static void main(String[] args) {
         PublicAccessModifier P = new PublicAccessModifier ();
         P.show ();

    }
    }
