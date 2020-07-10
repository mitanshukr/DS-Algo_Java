package LinkedList;

class dNode {
	int data;
	dNode next;
	dNode prev;
}

class dLinkedList {
	dNode head;

	void insert(int data) {
		dNode node = new dNode();
		node.data = data;
		node.next = null;
		node.prev = null;

		if (head == null) {
			head = node;
		} else {
			dNode n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			node.prev = n;
		}

	}

	void insertAtStart(int data) {
		dNode node = new dNode();
		node.data = data;

		node.prev = null;
		node.next = head;
		head.prev = node;
		head = node;
	}

	void insertAt(int index, int data) {
		dNode node = new dNode();
		node.data = data;
		node.prev = null;
		node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			dNode n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
				if (n.next == null) {
					System.out.println("Invalid Index!");
					return;
				}
			}
			node.next = n.next;
			n.next = node;
			node.prev = n;
		}
	}

	void deleteAt(int index) {
		dNode node = head;
		if (index == 0) {
			head = head.next;
			head.prev = null;
			// The below commands will give same result.
			// head.next.prev = null;
			// head = head.next;
			return;
		}
		for (int i = 0; i < index; i++) {
			if (node.next == null) {
				System.out.println("Invalid Index!");
				return;
			}
			node = node.next; // Traversing at the node to be deleted.
		}
		if (node.next == null) {
			deleteAtEnd();
		} else {
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}

	}

	void deleteAtEnd() {
		dNode node = head;
		while (node.next != null) {
			node = node.next;
		}
		node.prev.next = null;
	}

	void show() {
		dNode node = head;
		while (node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.print(node.data);
		System.out.println();
	}

	double question() {
		double steps = 0.0;
		dNode node = head;
		if (head.next == null) {
			return 0;
		}
		while (node.next.next != null) {
			node = node.next;
			node = node.next;
			steps = steps + 1;
			if (node.next != null) {
				node = node.prev;
				steps++;
			} else
				break;
		}
		return steps;
	}

}

public class DoublyLinkedList {

	public static void main(String[] args) {
		dLinkedList dlist = new dLinkedList();
		dlist.insert(25);
		dlist.insert(35);
		dlist.insert(40);
		dlist.insert(88);
		dlist.insert(43);
		dlist.insert(34);
		dlist.show();
		dlist.insertAtStart(11);
		dlist.show();
		// dlist.deleteAt(3);
		dlist.show();
		dlist.insertAtStart(11);
		dlist.show();
		// System.out.println(dlist.question());
		dlist.insertAt(2, 56);
		dlist.deleteAtEnd();
		dlist.show();
	}

}
