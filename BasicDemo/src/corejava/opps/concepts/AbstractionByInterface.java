package corejava.opps.concepts;
interface RemoteControl{
    void turnOn();
    void turnoff();
}
class TV implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println ("TV is turned on");
    }

    @Override
    public void turnoff() {
        System.out.println ("TV  is turned off");
    }
}

public class AbstractionByInterface {
    public static void main(String[] args) {
        RemoteControl r = new TV ();
        r.turnOn ();
        r.turnoff ();
    }
}
