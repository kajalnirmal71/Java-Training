package corejava.opps.concepts;

public class AccessModifier {
    private double balance = 1000;
     double total;
    private void showBalance() {
        System.out.println ("Balance : " + balance);
    }

    public void accessBalance() {
        showBalance ();

    }
    void setBalance(){
        balance = 2000;
        System.out.println ("setting the balnce :"+ balance);
    }

    protected void addBalance() {
            total = 1000 + balance;
            System.out.println (total);

    }





    public static void main(String[] args) {
        AccessModifier P = new AccessModifier ();
        P.showBalance ();
    }
    }
