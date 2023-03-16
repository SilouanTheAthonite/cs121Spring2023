import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main{


    public static void main(String[] args){

    
        final String FILENAME = "test.txt";
        
        try{
        // Open a file
        //PrintWriter outfile = new PrintWriter(new File(FILENAME));

        // append
        File outFileObj = new File(FILENAME);
        FileOutputStream outstream = new FileOutputStream(outFileObj);
        PrintWriter outfile = new PrintWriter(outstream);

        // Write to the file
        outfile.println("Writing once again");
        outfile.println("Once upon a time, there was a purple dragon");

        // Close the file
        outfile.close();

        } catch (FileNotFoundException e){
            System.out.println("Unable to open the file");
        }
    }
}
