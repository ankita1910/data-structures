class Queue {
	private int size;
	private int totalItems;
	private int [] q;
	private int rear;
	private int front;

	public Queue() {
		rear = 0;
		front = 0;
		size = 100;
		totalItems = 0;
		q = new int[size];
	}

	public Queue(int size) {
		rear = 0;
		front = 0;
		this.size = size;
		totalItems = 0;
		q = new int[this.size];
	}

	public boolean isFull() {
		if(totalItems == this.size) {
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
			rear++;
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
			return q[front++];
		}
	}

	public void displayItems() {
		for(int i=front; i<rear; i++) {
			System.out.println(q[i]);
		}
	}
}