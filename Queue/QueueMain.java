import java.util.Scanner;

class QueueMain {
	public static void main(String args[]) {
		// Queue q1 = new Queue();
		// q1.enqueue(1);
		// q1.enqueue(2);
		// q1.enqueue(3);
		// q1.enqueue(4);
		// q1.enqueue(5);
		// q1.enqueue(6);
		// q1.enqueue(7);
		// q1.displayItems();

		// q1.dequeue();
		// q1.dequeue();
		// q1.displayItems();

		CircularQueue q2 = new CircularQueue(5);
		q2.enqueue(1);
		q2.enqueue(2);
		q2.enqueue(3);
		q2.enqueue(4);

		// q2.displayItems();

		q2.dequeue();
		q2.dequeue();
		// q2.displayItems();

		q2.enqueue(5);
		q2.enqueue(6);
		q2.displayItems();
	}
}