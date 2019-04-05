package data.structure.linkedlist;

public class LinkedList {

	Node head;
	/*Insert st end*/
	public void insert(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}
		else {
			Node temp = head;
			while (temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		node.next=head;
		head=node;
	}
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		if(index==0) {
			insertAtStart(data);
		}
		else {
			Node n = head;
			for (int i = 0; i < index-1; i++) {
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	
	public void deleteAt(int index) {
		if(index==0) {
			head =head.next;
		}
		else {
			Node n = head;
			for (int i = 0; i < index-1; i++) {
				n=n.next;
			}
			Node n1 = n.next;
			n.next=n1.next;
		}
		
	}
	public void show() {
		Node temp = head;
		while (temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}
