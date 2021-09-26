
public class Stack {
	private int maxSize;
	private int[] arr;
	private int top;
	
	/**
	 * Class constructor
	 * @param size
	 */
	public Stack(int size) {
		this.maxSize = size;
		this.arr = new int[this.maxSize];
		this.top = -1;
	}
	
	
	/**
	 * Pushing value into the stack
	 * @param value
	 */
	public void push(int value) {
		this.arr[++this.top] = value;
	}
	
	/**
	 * Popping value out of the stack
	 * @return integer of the top most stack value
	 */
	public int pop() {
		return this.arr[this.top--];
	}
	
	/**
	 * Checking the top most stack value
	 * @return integer of the top value
	 */
	public int peek() {
		return this.arr[top];
	}
	
	/**
	 * Checking if stack is empty
	 * @return boolean if stack is empty
	 */
	public boolean isEmpty() {
		return top == -1;
	}
	
	
	/**
	 * Displaying all stack values
	 */
	public void displayValues() {
		while(!this.isEmpty()) {
			System.out.println(this.pop());
		}
	}
	
	
}
