package ds.queue.implementation;

public class Queue {
	int queue[]=new int[5];
	int front=0;
	int rear=0;
	int size;
		
	public void enQueue(int data) {
		queue[rear]=data;
		rear++;
		size++;
	}

	public void show() {
		System.out.print("Elements :");
		for (int i = 0; i < size; i++) {
			System.out.print(" "+queue[i]);
		}
		
	}

	
}
