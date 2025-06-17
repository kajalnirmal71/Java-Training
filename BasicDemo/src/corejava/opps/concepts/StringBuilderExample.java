package corejava.opps.concepts;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder  sb = new StringBuilder ();

        sb.append ("java");
        sb.insert (4,"  ");

        sb.append ("programming");
        sb.insert (17,"  ");

        sb.append ("language");
        sb.replace(0,4,"python");


        System.out.println (sb.toString ());
    }
}
