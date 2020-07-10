package LinkedList;

class cNode {
	int data;
	cNode next;
}

class cLinkedList {
	cNode last;
	int size = 0;

	void insert(int data) {
		cNode node = new cNode();
		node.data = data;
		node.next = null;
		if (last == null) {
			last = node;
			last.next = last;
			size++;
		} else {
			node.next = last.next;
			last.next = node;
			last = node;
			size++;
		}
	}

	void insertAtStart(int data) {
		cNode node = new cNode();
		node.data = data;
		node.next = null;

		node.next = last.next;
		last.next = node;
		size++;
	}

	void insertAt(int index, int data) {
		cNode node = new cNode();
		node.data = data;
		node.next = null;

		if (index >= size()) {
			System.out.println("Invalid Index!");
			return;
		}

		if (index == 0)
			insertAtStart(data);
		else if (index == size() - 1)
			insert(data);
		else {
			cNode n = last;
			for (int i = 0; i < index; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
			size++;
		}
	}

	void deleteAt(int index) {
		cNode node = last.next;
		if (index >= size()) {
			System.out.println("Invalid Index!");
			return;
		}
		if (index == 0) {
			last.next = node.next;
			size--;
			System.out.println("Element at index [0] is deleted!");
		} else {
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			cNode temp = node.next;
			node.next = temp.next;
			size--;
			System.out.println("Element at index [" + index + "] >> {" + temp.data + "} is deleted!");
		}
	}

	void search(int data) {
		cNode node = last.next;
		int index = 0;
		while (node.data != data) {
			if (node.next == last.next) {
				System.out.println("Search data {" + data + "} not found!");
				return;
			}
			node = node.next;
			index++;
		}
		System.out.println("Search data {" + data + "} found at index: [" + index + "]");
	}

	void getData(int index) {
		if (index >= size()) {
			System.out.println("Invalid Index!");
			return;
		}
		cNode node = last.next;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		System.out.println("Element at index [" + index + "] is: " + node.data);
	}

	void show() {
		cNode node = last.next;
		do {
			System.out.print(node.data + " ");
			node = node.next;
		} while (node != last.next);
		System.out.println();
	}

	int size() {
		return size;
	}
}

public class CircularLinkedList {

	public static void main(String[] args) {
		cLinkedList list = new cLinkedList();

		list.insert(25);
		list.insert(58);
		list.insertAtStart(103);
		list.insertAtStart(104);
		list.insert(850);
		list.insertAt(0, 105);
		list.insertAt(2, 206);
		list.insert(900);
		list.show();
		System.out.println("Size: " + list.size());
		list.search(58);
		list.getData(6);
		list.deleteAt(7);
		list.show();
		System.out.println("Size: " + list.size());
	}

}
