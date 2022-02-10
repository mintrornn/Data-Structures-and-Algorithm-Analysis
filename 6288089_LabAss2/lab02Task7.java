
public class lab02Task7 {
	 public static void main(String[] args)
     {
     PriorityQ thePQ = new PriorityQ(50);
     thePQ.insert(30);
     thePQ.insert(5);
     thePQ.insert(15);
     thePQ.insert(25);
     thePQ.insert(30);

     while( !thePQ.isEmpty() )
        {
        long item = thePQ.remove();
        System.out.print(item + " ");  // 10, 20, 30, 40, 50
        }  // end while
     System.out.println("");
     }  // end main()
}
