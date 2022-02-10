import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lab02Task3 {
	 public static void main(String[] args) throws IOException
     {
     BracketChecker a = new BracketChecker("f(x) = 2x(8 + xsin(2x - 6)))");
     a.check();
     
     String input;
     while(true)
        {
        System.out.print(
                     "Enter string containing delimiters: ");
        System.out.flush();
        input = getString();     // read a string from kbd
        if( input.equals("") )   // quit if [Enter]
           break;
                                 // make a BracketChecker
        BracketChecker theChecker = new BracketChecker(input);
        theChecker.check();      // check brackets
        }  // end while
     
     }  // end main()
//--------------------------------------------------------------
  public static String getString() throws IOException
     {
     InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(isr);
     String s = br.readLine();
     return s;
     }
}
