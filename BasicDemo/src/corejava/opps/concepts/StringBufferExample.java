package corejava.opps.concepts;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer ("hello");

        sb.append ("world");
        sb.insert (5," ,");
        sb.replace (6,11,"java");
        sb.delete (10,11);

        System.out.println (sb.toString ());
    }
}
