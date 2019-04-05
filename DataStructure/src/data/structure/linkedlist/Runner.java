package data.structure.linkedlist;

public class Runner {
public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.insert(5);
	list.insert(10);
	list.insert(12);
	list.insert(13);
	
	list.insertAtStart(22);
	list.insertAt(3, 55);
	list.insertAt(0, 73);
	
	list.deleteAt(0);
	
	list.show();
}
}