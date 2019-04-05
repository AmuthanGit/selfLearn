package ds.stack.implementation;

public class Stack {
	int stack[] = new int[5];
	int top = 0;

	public void push(int data) {
		if (top >= 5) {
			System.out.println("Stack is full");
		} else {
			stack[top] = data;
			top++;
		}
	}

	public void show() {
		if(top<=0) {
			System.err.println("Stack is empty");
		}
		else {
			for (int data : stack) {
				System.out.println(data);
			}
		}
	}

	public int pop() {
		int data=0;
		if(top<=0) {
			System.out.println("Stack is empty");
		}
		else {
			data = stack[top - 1];
			stack[top - 1] = 0;
			top--;
			return data;
		}
		return data;
	}

	public int peek() {
		int data = stack[top - 1];
		return data;
	}

	public int size() {
		return top;

	}

	public boolean isEmpty() {
		return top <= 0;
	}

}
