import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lab02Task4 {
	 public static void main(String[] args) throws IOException
     {
        InToPost a = new InToPost("2 + ((2 + 3) * (7 - 1)))");
        String x = a.doTrans();
        System.out.println(x);
     
     String input, output;
     while(true)
        {
        System.out.print("Enter infix: ");
        System.out.flush();
        input = getString();         // read a string from kbd
        if( input.equals("") )       // quit if [Enter]
           break;
                                     // make a translator
        InToPost theTrans = new InToPost(input);
        output = theTrans.doTrans(); // do the translation
        System.out.println("Postfix is " + output + '\n');
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
