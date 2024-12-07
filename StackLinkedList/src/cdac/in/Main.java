package cdac.in;

public class Main {
	
	public static void main(String[] args) {
		Stack stack=new Stack();
		// boolean result=stack.isEmpty();
		// System.out.println(result);
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.printStack();
		
	}
	
}
