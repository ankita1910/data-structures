class IntStack {
	private int top;;
	private int size;
	private int [] stack;

	public IntStack() {
		top = -1;
		size = 50;
		stack = new int[size];
	}

	public IntStack(int size) {
		top = -1;
		this.size = size;
		stack = new int[this.size];
	}

	public boolean isFull() {
		return (top == stack.length - 1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean push(int item) {
		if(!isFull()) {
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
	}

	public int pop() {
		if(!isEmpty()) {
			return stack[top--];
		} else {
			return -1;
		}
	}

	public int peek() {
		if(!isEmpty()) {
			return stack[top];
		} else {
			return -1;
		}
	}
}