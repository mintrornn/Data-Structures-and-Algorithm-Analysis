
public class lab03Task2 {
	
	public static void main(String[] args){
	DoublyLinkedList theList = new DoublyLinkedList();

	theList.insertFirst(5);       // insert at front
	theList.insertFirst(15);
	theList.insertFirst(25);
	theList.insertFirst(30);

	theList.insertLast(3);        // insert at rear
	theList.insertLast(13);
	theList.insertLast(23);
	theList.insertLast(33);

	theList.insertAfter(23, 100);	// insert 100 after 23
	
	theList.deleteFirst();        // delete first item
	theList.deleteLast();         // delete last item
	
	theList.deleteKey(25);        // delete item with key 25
	
	theList.displayForward();     // display list forward
	theList.displayBackward();    // display list backward
	}
}