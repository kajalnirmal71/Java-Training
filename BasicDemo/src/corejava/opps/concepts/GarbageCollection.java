package corejava.opps.concepts;

public class GarbageCollection {
    GarbageCollection gc3;
    public static void main(String[] args) {
        GarbageCollection gc1 = new GarbageCollection ();
        GarbageCollection gc2 = new GarbageCollection ();

        gc1.gc3 =gc2;
        gc2.gc3 = gc1;

       gc1  = null;      //( 1. set all available object reference null)
        gc2 = null;
       gc1 = gc2 ;   // (2.make the reference variable to another object)

                    // (3. creating island of an isolation)

    //  System.gc ();
      Runtime.getRuntime ().gc ();
        System.out.println ("main method is done");

    }
    @Override
    protected void finalize()throws Throwable{
        System.out.println ("finalize method is called");


    }
}


