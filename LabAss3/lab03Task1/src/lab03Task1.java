
public class lab03Task1 {
	public static void main(String[] args){
	FirstLastList theList = new FirstLastList();

    theList.insertFirst(5);       // insert at front
    theList.insertFirst(10);
    theList.insertFirst(25);
    theList.insertFirst(30);

    theList.insertLast(3);        // insert at rear
    theList.insertLast(13);
    theList.insertLast(23);
    theList.insertLast(33);


    theList.displayList();         // display the list

    while(!theList.isEmpty()) {
		theList.deleteFirst();         
		theList.displayList();         
	}
	}
}
