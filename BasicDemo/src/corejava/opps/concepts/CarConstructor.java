package corejava.opps.concepts;

public class CarConstructor {
    String name;
    String company;
    double price;

    CarConstructor(String name,String company,double price){
        this.name=name;
        this.company=company;
        this.price= price;
    }
    public void display(){
        System.out.println ("Name = "+ name);
        System.out.println ("company ="+ company);
        System.out.println ("price = "+ price);
    }

    public static void main(String[] args) {
        CarConstructor C = new CarConstructor ("XUV300","Mahindra",1300000);
        C.display ();
    }
}
