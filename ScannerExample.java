
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Convert to Methods
 * 
 * Description: Take a simple program and convert it so that as much of 
 *              the processing as possible is encapsulated using static
 *              methods.
 **********************************************************************/

// import statements go here
 import java.util.Scanner;
 import javax.swing.JOptionPane;

public class ScannerExample {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
                   
        Scanner scanner = new Scanner(System.in);        

    // ***** Output Banners *****
    
        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Simple Event Loop");
        System.out.println("****************************\n");
  
    
    // ***** get some input from the keyboard *****
      
    // ***** Processing *****
        String sample = "The quick brown fox"
        + " jumped over the lazy fox";
        Scanner s = new Scanner(sample);
        int count=0;
        while (s.hasNext()){
            String token = s.next();
            count++;
        }
        System.out.println(count);

           
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
