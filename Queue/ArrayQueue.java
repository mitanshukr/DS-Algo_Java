package Queue;

class Queue {
	int[] queue;
	int front;
	int rear;
	int arrSize;
	int qSize;

	Queue(int arrSize) {
		queue = new int[arrSize];
		this.arrSize = arrSize;
	}

	void enQueue(int data) {
		if (isFull()) {
			System.out.println("Queue is Full!");
		} else {
			queue[rear] = data;
			rear = (rear + 1) % arrSize;
			qSize++;
		}
	}

	int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty!");
			return 0;
		}
		int data = queue[front];
		front = (front + 1) % arrSize;
		qSize--;
		return data;
	}

	int peek() {
		return queue[front];
	}

	int size() {
		return qSize;
	}

	void show() {
		System.out.print("Queue Elements: ");
		for (int i = 0; i < size(); i++) {
			System.out.print(queue[(front + i) % arrSize] + " ");
		}
		System.out.println();
		System.out.print("Array Elements: ");
		for (int i : queue)
			System.out.print(i + " ");
		System.out.println();
	}

	boolean isEmpty() {
		if (size() == 0)
			return true;
		else
			return false;
	}

	boolean isFull() {
		if (size() == arrSize)
			return true;
		else
			return false;
	}

}

public class ArrayQueue {

	public static void main(String[] args) {
		Queue q = new Queue(5);

		q.deQueue();
		q.enQueue(2);
		q.show();
		q.enQueue(5);
		q.show();
		q.enQueue(7);
		q.show();
		q.enQueue(17);
		q.show();
		q.deQueue();
		q.show();
		q.enQueue(22);
		q.show();
		q.enQueue(74);
		q.show();
		q.enQueue(74);
		q.show();
		q.enQueue(74);
		q.show();
		System.out.println("Peek value:" + q.peek());

	}

}
