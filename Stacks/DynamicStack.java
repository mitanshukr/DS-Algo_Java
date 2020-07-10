package Stacks;

class DynStack {
	private int[] arr;
	private int top;

	DynStack(int size) {
		arr = new int[size];
		top = -1;
	}

	void push(int data) {
		if (isFull()) {
			//System.out.println("Stack is Full!");
			expand();
		}
			arr[++top] = data;
	}

	int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!");
			return 0;
		}
		int data = arr[top];
		arr[top--] = 0;
		if(size() <= (arr.length/2)/2)
			shrink();
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

	int size() {
		//System.out.println("Size of the stack is: " + (top + 1));
		return (top+1);
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
	
	void expand() {
		int temp[] = new int[arr.length * 2];
		for(int i=0;i<size();i++)
			temp[i] = arr[i];
		arr  =temp;
	}
	
	void shrink() {
		int temp[] = new int[arr.length/2];
		for(int i=0;i<size();i++)
			temp[i] = arr[i];
		arr  =temp;
	}
	
}

public class DynamicStack {

	public static void main(String[] args) {
		DynStack stk = new DynStack(6);
		
		stk.pop();

		stk.push(29);
		stk.push(24);
		stk.push(43);
		stk.push(76);
		stk.push(12);
		stk.push(9);
		stk.push(94);
		
		stk.show();
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		
		
		stk.show();
		//System.out.println("Pooped value:"+stk.pop());
		System.out.println("Size of the stack is: " + stk.size());
		

	}

}

