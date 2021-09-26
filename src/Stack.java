
public class Stack {
	private int maxSize;
	private int[] arr;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.arr = new int[this.maxSize];
		this.top = -1;
	}
	
	public void push(int value) {
		this.arr[++this.top] = value;
	}
	
	public int pop() {
		return this.arr[this.top--];
	}
	
	public int peek() {
		return this.arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void displayValues() {
		while(!this.isEmpty()) {
			System.out.println(this.pop());
		}
	}
	
	
}
