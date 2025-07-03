package corejava.opps.concepts;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class FileWriterDemo {


        public static void main(String[] args) {
            //create a .txt file
            String filePath = "KAJAL.txt";
            String content = "Hi  this is a sample text written to the file.";

            try {
                // Step 1: Create FileWriter
                FileWriter fw = new FileWriter(filePath);

                // Step 2: Wrap with BufferedWriter (optional but efficient)
                BufferedWriter bw = new BufferedWriter(fw);

                // Step 3: Write content
                bw.write(content);

                // Step 4: Close the writer
                bw.close();

                System.out.println("File written successfully.");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



