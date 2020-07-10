package Stacks;

class stack {
	private int[] arr;
	private int top;

	stack(int size) {
		arr = new int[size];
		top = -1;
	}

	void push(int data) {
		if (isFull())
			System.out.println("Stack is Full!");
		else
			arr[++top] = data;
	}

	int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!");
			return 0;
		}
		int data = arr[top];
		arr[top--] = 0;

		return data;
	}

	int peek() {
		int value = arr[top];
		return value;
	}

	void show() {
		System.out.println("Elements in the Stack are: ");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println("");
	}

	void stackSize() {
		System.out.println("Size of the stack is: " + (top + 1));
	}

	boolean isFull() {
		if (top == arr.length - 1)
			return true;
		else
			return false;
	}

	boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

}

public class ArrayStack {

	public static void main(String[] args) {
		stack stk = new stack(5);
		
		stk.pop();
		stk.stackSize();

		stk.push(29);
		stk.show();
		stk.push(24);
		stk.show();
		stk.push(55);
		stk.show();
		stk.push(89);
		stk.show();
		stk.push(27);
		stk.show();
		
		stk.push(85);
		stk.show();
		stk.stackSize();
		System.out.println(stk.peek());
		stk.show();
		stk.stackSize();
		System.out.println("Pooped value:"+stk.pop());
		stk.pop();
		stk.stackSize();
		stk.show();
		stk.pop();
		stk.stackSize();
		stk.pop();
		stk.stackSize();
		stk.pop();
		stk.stackSize();
		stk.pop();
		stk.stackSize();
		

	}

}
