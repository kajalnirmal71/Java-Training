package corejava.opps.concepts;

public class Cricketer {


    String name;
    int odiRuns;
    int testRuns;
    int t20Runs;

    public int totalRuns() {
        int totalRuns = odiRuns + testRuns + t20Runs;
        return totalRuns;
    }
    public void display(){
        System.out.println (name);
        System.out.println (odiRuns);
        System.out.println (testRuns);
        System.out.println (t20Runs);
        System.out.println (totalRuns ());

    }

        public static void main (String[]args){

         Cricketer C = new Cricketer ();
         C.name="ROHIT SHARMA";
         C.odiRuns=50;
         C.t20Runs=70;
         C.testRuns=80;
         C.totalRuns ();
         C.display ();
        }
    }

