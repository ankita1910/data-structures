/* Changes as compared to Queue 
	rear = (rear + 1) % size
	front = (front + 1) % size
*/

class CircularQueue {
	private int front;
	private int rear;
	private int size;
	private int totalItems;
	private int [] q;

	public CircularQueue() {
		front = 0;
		rear = 0;
		size = 100;
		totalItems = 0;
		q = new int[size];
	}

	public CircularQueue(int size) {
		front = 0;
		rear = 0;
		this.size = size;
		totalItems = 0;
		q = new int[this.size];
	}

	public boolean isFull() {
		if(this.size == totalItems) {
			return true;
		} else {
			return false;
		}
	}

	public boolean enqueue(int item) {
		if(isFull()) {
			return false;
		} else {
			totalItems ++;
			q[rear] = item;
			rear = (rear + 1) % size;
			return true;
		}
	}

	public boolean isEmpty() {
		if(totalItems == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int dequeue() {
		if(isEmpty()) {
			return -1;
		} else {
			totalItems--;
			int item = q[front];
			front = (front + 1) % size;
			return item;
		}
	}

	public void displayItems() {
		int f = front;
		for(int i=0; i<totalItems; i++) {
			System.out.println(q[f]);
			f = (f+1)%size;
		}
	}
}