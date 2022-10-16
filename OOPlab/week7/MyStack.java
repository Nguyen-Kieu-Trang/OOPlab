package week7;

public class MyStack {
	private Object[] arr;
	private int index;
	private int CAPACITY;
	public MyStack(int capacity) {
		index = 0;
		this.CAPACITY = capacity;
		arr = new Object[CAPACITY];
	}
	public void push(Object obj) {
		if(int)
	}
	public Object pop() {
		if(index == 0) {
			System.out.println("Stack is empty!");
			return null;
		}else {
			index--;
			return arr[index];
		}
	}
	

	public static void main(String[] args) {
		MyStack stack = new MyStack[10];
		stack.push("David");
		stack.push("Bob");
		stack.push("Alice");
		stack.push(5);
		
		String s = (String) stack.pop();
		System.out.println(s);
		
		s = (String) stack.pop();
		System.out.println(s);

	}

}
