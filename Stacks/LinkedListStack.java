package Stacks;

class Node {
	int data;
	Node next;
}

class listStack {
	Node head;
	int size = 0;

	void push(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		node.next = head;
		head = node;
		size++;
	}

	int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!");
			return 0;
		} else {
			int data = head.data;
			head = head.next;
			size--;
			return data;
		}

	}

	int peek() {
		if (isEmpty())
			return 0;
		else
			return head.data;
	}

	void show() {
		if (isEmpty())
			System.out.println("Stack is Empty!");
		else {
			Node node = head;
			while (node.next != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
			System.out.println(node.data);
		}
	}

	void stackSize() {
		Node node = head;
		int size = 0;
		if (isEmpty()) {
			System.out.println("Stack is Empty! Hence, Size is 0.");
			return;
		}
		while (node.next != null) {
			size++;
			node = node.next;
		}
		size++;
		System.out.println("Stack size is: " + size);
	}

	int stackSizeNew() {
		return size;
	}

	boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}
}

public class LinkedListStack {

	public static void main(String[] args) {
		listStack stk = new listStack();
		stk.pop();
		stk.push(25);
		stk.show();
		stk.push(254);
		stk.show();
		stk.push(265);
		stk.show();
		stk.push(487);
		stk.show();
		stk.push(214);
		stk.show();
		stk.stackSize();
		System.out.println(stk.peek());
		System.out.println(stk.pop());

		stk.show();
		stk.stackSize();
		System.out.println(stk.stackSizeNew());
		System.out.println(stk.peek());

	}

}
