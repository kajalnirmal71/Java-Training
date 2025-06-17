package corejava.opps.concepts;


    abstract class Animals {
      public abstract  void sound () ;

   }
       class Donkey extends Animals {
           @Override
           public void sound () {
               System.out.println ("dog barks");

           }
       }


public class MethodOverriding {
    public static void main(String[] args) {
        Animals a = new Donkey ();


        a.sound ();
       // b.sound ();
    }
}
