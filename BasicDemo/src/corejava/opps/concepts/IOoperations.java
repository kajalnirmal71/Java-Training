package corejava.opps.concepts;
import java.io.*;

public class IOoperations {


        public static void main(String[] args) {
            String inputFile = "students.txt";
            String outputFile = "report.txt";

            try (

                    BufferedReader reader = new BufferedReader (new FileReader (inputFile));
                    BufferedWriter writer = new BufferedWriter (new FileWriter (outputFile))
            ) {
                String line;
                while ((line = reader.readLine ()) != null) {
                    String[] parts = line.split (","); // Split by comma
                    String name = parts[0].trim ();
                    int marks = Integer.parseInt (parts[1].trim ());

                    String result = marks >= 40 ? "Pass" : "Fail";
                    writer.write (name + " - " + marks + " - " + result);
                    writer.newLine (); // Go to next line
                }
                System.out.println ("Report generated successfully in " + outputFile);
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }



