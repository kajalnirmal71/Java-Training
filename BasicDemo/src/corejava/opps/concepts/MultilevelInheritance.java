package corejava.opps.concepts;
class Vehicle{
    void startEngine(){
        System.out.println ("engine started");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println ("car is driving");
    }
}
class ElectricCar extends Car{
    void chargeBattery(){
        System.out.println ("battery is charging");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
       ElectricCar xuv = new ElectricCar ();
       xuv.startEngine ();
       xuv.drive ();
       xuv.chargeBattery ();
    }
}
