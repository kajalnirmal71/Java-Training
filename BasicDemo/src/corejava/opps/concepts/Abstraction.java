package corejava.opps.concepts;

abstract class Vehicles{
    abstract void start();
    void stop(){
        System.out.println ("vehicle is stopped");
    }
}
   class Bike extends Vehicles{

        @Override
        void start() {
            System.out.println ("bike started");
        }
    }
   public class Abstraction {
     public static void main(String[] args) {
        Vehicles v = new Bike ();

        v.start ();
        v.stop ();
    }

}
