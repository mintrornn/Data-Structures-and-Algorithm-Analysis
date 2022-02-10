
public class lab03Task4 {
	public static void main(String[] args)
    {
    int maxSize = 50;             // array size
    DArray arr;                    // reference to array
    arr = new DArray(maxSize);     // create the array

    arr.insert(11);                // insert items
    arr.insert(12);
    arr.insert(8);
    arr.insert(5);
    arr.insert(3);
    arr.insert(15);
    arr.insert(20);
    arr.insert(18);
    arr.insert(36);
    arr.insert(17);

    arr.mergeSort();               // merge sort the array

    arr.display();                 // display items again
    }  
 }

