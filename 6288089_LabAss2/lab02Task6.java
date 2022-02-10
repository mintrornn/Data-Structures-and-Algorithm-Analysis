
public class lab02Task6 {
	   public static void main(String[] args)
	      {
	      Queue theQueue = new Queue(50);  // queue holds 5 items

	      theQueue.insert(10);            // insert 4 items
	      theQueue.insert(20);
	      theQueue.insert(30);
	      theQueue.insert(40);

	      theQueue.remove();              // remove 3 items
	      theQueue.remove();              //    (10, 20, 30)
	      theQueue.remove();

	      theQueue.insert(5);            // insert 4 more items
	      theQueue.insert(15);            //    (wraps around)
	      theQueue.insert(25);
	      theQueue.insert(30);

	      while( !theQueue.isEmpty() )    // remove and display
	         {                            //    all items
	         long n = theQueue.remove();  // (40, 50, 60, 70, 80)
	         System.out.print(n);
	         System.out.print(" ");
	         }
	      System.out.println("");
	      }  // end main()
}
