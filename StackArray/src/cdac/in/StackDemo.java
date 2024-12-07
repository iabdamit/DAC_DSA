package cdac.in;
public class StackDemo {
	//! declare an array
	int[] arr;
	int topOfStack;
	
	//! Constructor to initialize the stack with a specified size
	public StackDemo(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("The Stack is created with a size of: " + size);
	}
	
	//! Check whether the stack is empty
	public boolean isEmpty() {
		return topOfStack == -1;
	}
	
	//! Check whether the stack is full
	public boolean isFull() {
		return topOfStack == arr.length - 1;
	}
	
	//! Push operation
	public void push(int value) {
		if (isFull()) {
			System.out.println("The Stack is full!");
		} else {
			topOfStack++; // Increment before assigning the value
			arr[topOfStack] = value;
			System.out.println("The Value " + value + " is inserted into the stack");
		}
	}
	
	
	//! Pop operation
	public void pop() {
		if (isEmpty()) {
			System.out.println("The Stack is Empty!");
		} else {
			System.out.println("Popped Value: " + arr[topOfStack]);
			topOfStack--;
		}
	}
	
	//! Print the elements of the Stack)
	public void printStack() {
		for (int i = 0; i <=topOfStack ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

