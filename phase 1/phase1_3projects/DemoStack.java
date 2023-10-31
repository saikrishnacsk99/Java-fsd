package phase1_3projects;

import java.util.Stack;
public class DemoStack {
public static void main (String args[]) {
	Stack stack = new Stack();
	stack.push("Realme");
	stack.push("Samsung");
	stack.push("MI");
	stack.push("Poco");
	stack.push("Apple");
	System.out.println("The stack elements are: " + stack);
	System.out.println("The element that was popped is: " +	stack.pop());
	System.out.println("The stack elements are:" + stack);
	}

}