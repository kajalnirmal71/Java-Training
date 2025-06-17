package corejava.opps.concepts;

public class MethodOverloading {

    public int add (int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c ;
    }
    public double add(double a,double b){
        return a+b ;
    }
    public double add(double a,int b){
        return a+b;
    }
    public double add (int a,double b){
        return a+b;
    }


    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading ();
        System.out.println ("add (int,int):" +m.add (5,10));
        System.out.println ("add (int,int,int):" +m.add (3,4,5));
        System.out.println ("add (double,double):" +m.add (5.6,4.2));
        System.out.println ("add (double,int):" +m.add (5.2,10));
        System.out.println ("add (int,double):" +m.add (5,10.4));

    }
}

