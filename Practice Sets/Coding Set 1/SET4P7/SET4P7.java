  /* 7. File Reading Utility */
package SET4P7;
import java.io.*;
import java.util.Scanner;

  public class SET4P7 {
    public static void main(String[] args){
        System.out.println("--File Reading Utility--");
        Scanner sc = null;
        try {
         FileReader file = new FileReader("document.txt");
         sc = new Scanner(file); // using buffer reader replace Scanner with BufferReader
         while (sc.hasNext()) {
             System.out.println(sc.nextLine());
         }
            /* String line;
            while ((line = br.readline()) != null) // Read line by line
            { sout("line"); }
            */
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File Not Found");
            } finally {
            System.out.println("Closing file...");
        }
        if (sc != null) {  // use try-catch with IOException print error closing file
            sc.close();
        }
    }
  }
