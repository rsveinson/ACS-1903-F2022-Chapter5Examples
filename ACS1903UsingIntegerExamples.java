
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  assignemnt
 * 
 * Description: brief description
 **********************************************************************/

// import statements go here
 import java.util.Scanner;
 import javax.swing.JOptionPane;
 import java.util.Random;

public class ACS1903UsingIntegerExamples {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
    
        int n = 0;
        int m = 0;
        int p = 0;
        
      
    // ***** do some Integer experiments *****
    
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        n = 256;
        m = 128;
        
        // max and min, very similar to Math.max and Math.min
        p = Integer.max(n, m);
        System.out.println(p);
        
        p = Integer.min(n, m);
        System.out.println(p);
        
        // toString
        System.out.println(Integer.toString(m));
        
        
        
        
        
        
        
           
    // ***** output *****
    
       
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
