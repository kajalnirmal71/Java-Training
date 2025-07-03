package corejava.opps.concepts;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDEMO {
    public static void main(String[] args) {


                String filePath = "KAJAL.txt";

                try {
                    // Step 1: Create FileReader
                    FileReader fr = new FileReader(filePath);

                    // Step 2: Wrap with BufferedReader
                    BufferedReader br = new BufferedReader(fr);

                    // Step 3: Read lines in a loop
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }

                    // Step 4: Close the reader
                    br.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }


    }
}
