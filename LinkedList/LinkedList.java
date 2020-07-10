package LinkedList;


public class LinkedList {
	public Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;

		node.next = head;
		head = node;
	}

	void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
				if (n.next == null) {
					System.out.println("Invalid Index!");
					return;
				}
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			System.out.println("Element at index [" + index + "] >> {" + head.data + "} is deleted!");
			head = head.next;
		} else {
			Node n = head;
			Node temp = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
				if (n.next == null) {
					System.out.println("Invalid Index!");
					return;
				}
			}
			temp = n.next;
			n.next = temp.next;
			System.out.println("Element at index [" + index + "] >> {" + temp.data + "} is deleted!");
			temp = null;
		}
	}

	void deleteAtEnd() {
		Node n = head;
		Node temp = n;
		while (temp.next != null) {
			n = n.next;
			temp = n.next;
		}
		n.next = null;
		temp = null;
		System.out.println("Last Element deleted Successfully!");
	}

	void display() {
		if (head == null)
			System.out.println("List is Empty!");
		else {
			Node node = head;
			while (node.next != null) {
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
		}
	}

	void search(int data) {
		int index = 0;
		Node n = head;
		while (n.data != data) {
			if (n.next == null) {
				System.out.println("Search data not Found!");
				return;
			}
			n = n.next;
			index++;
		}

		System.out.println("Search data {" + n.data + "} found at index: " + index);

	}

	void getData(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			if (node.next == null) {
				System.out.println("Invalid Index!");
				return;
			}
			node = node.next;
		}
		System.out.println("Data at index [" + index + "] is: " + node.data);

	}

	void updateAt(int index, int newData) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			if (node.next == null) {
				System.out.println("Invalid Index!");
				return;
			}
			node = node.next;
		}
		int oldData = node.data;
		node.data = newData;
		System.out.println("Data at index [" + index + "] is updated from {" + oldData + "} to: " + node.data);

	}

	void reverse() {
		Node node = head;
		Node prev = null;
		Node next1 = null;

		// node.next = prev;

		while (node != null) {
			// if(node == head)
			// node.next = prev;
			next1 = node.next;
			node.next = prev;
			prev = node;
			node = next1;
			// next1 = node.next;

			// node.next = prev;
		}
		node = head;
		// next1.next = prev;
		// next1 = head;

	}
}
