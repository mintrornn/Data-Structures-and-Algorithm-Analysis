
public class lab03Task3 {
	 public static void main(String[] args)
     {
     LinkStack theStack = new LinkStack(); // make stack

     theStack.push(16);                    // push items
     theStack.push(25);
     theStack.push(36);
     theStack.push(49);

     while(!theStack.isEmpty()) {
			theStack.pop();						// pop items
			theStack.displayStack();  			// display stack
		}
     }      
}
