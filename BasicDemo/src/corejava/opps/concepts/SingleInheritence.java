package corejava.opps.concepts;
 class Animal{
    void eat(){
        System.out.println (" this animal eats food .");
    }


}
class Dog extends Animal{
    void bark(){
        System.out.println ("the dog barks.");
    }
}
public class SingleInheritence {
    public static void main(String[] args) {
        Dog d = new Dog ();
        d.eat ();
        d.bark ();
    }
}
