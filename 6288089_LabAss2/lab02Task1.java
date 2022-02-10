
public class lab02Task1 {
	public static void main(String[] args)
    {
    StackX theStack = new StackX(50);  // make new stack
    theStack.push(5);               // push items onto stack
    theStack.push(15);
    theStack.push(25);
    theStack.push(30);

    while( !theStack.isEmpty() )     // until it's empty,
       {                             // delete item from stack
       long value = theStack.pop();
       System.out.print(value);      // display it
       System.out.print(" ");
       }  // end while
    System.out.println("");
    }  // end main()
}
