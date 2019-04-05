package ds.stack.implementation;

public class DStack {
	int capacity=2;
	int stack[] = new int[capacity];
	int top = 0;

	public void push(int data) {
		if (size()==capacity) {
			expand();
			stack[top] = data;
			top++;
		} else {
			stack[top] = data;
			top++;
		}
	}

	private void expand() {
		int length=size();
		capacity*=2;
		int newStack[]= new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;
	}

	public void show() {
		if(top<=0) {
			//System.err.println("Stack is empty");
		}
		else {
			for (int data : stack) {
				System.out.print(" "+data);
			}
			System.out.println();
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
			shrink();
			return data;
		}
		
		return data;
	}
	private void shrink() {
		int length=size();
		if(length<=(capacity/2)/2) {
			capacity/=2;
			int newStack[]=new int[capacity];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack=newStack;
		}
		
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

