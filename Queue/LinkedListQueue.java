package Queue;

class Node {
	int data;
	Node next;
}

class ListQueue {
	Node head;
	int qSize = 0;

	void enQueue(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
			qSize++;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			qSize++;
		}
	}

	int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty!");
			return 0;
		}
		int data = head.data;
		head = head.next;
		qSize--;
		return data;
	}

	int peek() {
		return head.data;
	}

	int size() {
		return qSize;
	}

	void show() {
		Node node = head;
		System.out.print("Elements in Queue: ");
		while (node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);
	}

	boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

}

public class LinkedListQueue {

	public static void main(String[] args) {
		ListQueue q = new ListQueue();
		q.deQueue();
		q.enQueue(25);
		q.enQueue(45);
		q.enQueue(74);
		q.enQueue(90);
		q.show();
		System.out.println("Peek: "+ q.peek());
		System.out.println("Size: "+ q.size());
		q.deQueue();
		q.deQueue();
		q.show();
		System.out.println("Peek: "+ q.peek());
		System.out.println("Size: "+ q.size());
		q.deQueue();
		q.enQueue(7);
		q.deQueue();
		q.show();
		System.out.println("Size: "+ q.size());
		
	}

}
