
public class lab03Task5 {
	 public static void main(String[] args)
     {
     int maxSize = 100;             // array size

     ordArray arr;                  // reference to array
     arr = new ordArray(maxSize);   // create the array

     arr.insert(72);                // insert items
     arr.insert(90);
     arr.insert(45);
     arr.insert(126);
     arr.insert(54);
     arr.insert(99);
     arr.insert(144);
     arr.insert(27);
     arr.insert(135);
     arr.insert(81);
     arr.insert(18);
     arr.insert(108);
     arr.insert(9);
     arr.insert(117);
     arr.insert(63);
     arr.insert(36);

     int searchKey = 135;           
		if( arr.find(searchKey) != arr.size() )
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can't find " + searchKey);
		
		int searchKey1 = 98;           
		if( arr.find(searchKey1) != arr.size() )
			System.out.println("Found " + searchKey1);
		else
			System.out.println("Can't find " + searchKey1);
		
		int searchKey2 = 64;          
		if( arr.find(searchKey2) != arr.size() )
			System.out.println("Found " + searchKey2);
		else
			System.out.println("Can't find " + searchKey2);
     }
}
