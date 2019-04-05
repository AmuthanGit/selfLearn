package ds.stack.implementation;

public class Runner {

	public static void main(String[] args) {
		/*Stack nums = new Stack();*/
		DStack nums=new DStack();
		nums.push(1);
		nums.show();
		nums.push(2);
		nums.show();
		nums.push(5);
		nums.show();
		/*nums.push(6);
		nums.show();
		nums.push(7);
		nums.show();
		nums.push(3);
		nums.show();
		nums.push(4);
		nums.show();*/
		
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		
		
		/*System.out.println(nums.pop());
		
		System.out.println(nums.peek());*/
		/*nums.show();
		System.out.println("Size :"+nums.size());
		System.out.println("Is empty :"+nums.isEmpty());*/
	}

}
