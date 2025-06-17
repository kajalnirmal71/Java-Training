package corejava.opps.concepts;

public class Main {
    public static void main(String[] args) {
        AccessModifier P = new AccessModifier ();
        P.accessBalance ();   // (access balance method is public so access anywhere in project)
       // P.showBalance();  (Show balance method is private not access outside the class.)
        P.setBalance ();     // (setBalance method is default method which is access within package)
        P.addBalance ();     //(add balance is protected modifier which access within package)
    }
}