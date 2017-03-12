class DoublyLinkedListFn {
	private Node first, last;

	public DoublyLinkedListFn() {
		first = last = null;
	}

	public void insertFirstNode(int data) {
		Node newNode = new Node(data);
		first = last = newNode;
	}

	public void insertBefore(int nodeData, int data) {
		Node newNode = new Node(data);

		Node p = first;

		while(p != null) {
			if(p.data == nodeData) {
				break;
			} else {
				p = p.next;
			}
		}

		if(p == null) {
			System.out.println("Node not found");
		} else if(p == first) {
			newNode.next = p;
			p.prev = newNode;
			first = newNode;
		} else {
			newNode.next = p;
			newNode.prev = p.prev;
			p.prev.next = newNode;
			p.prev = newNode;
		}
	}

	public void insertAfter(int nodeData, int data) {
		Node newNode = new Node(data);

		Node p = first;

		while(p != null) {
			if(p.data == nodeData) {
				break;
			} else {
				p = p.next;
			}
		}

		if(p == null) {
			System.out.println("Required node not found");
		} else if(p == last) {
			newNode.prev = p;
			p.next = newNode;
			last = newNode;
		} else {
			newNode.prev = p;
			newNode.next = p.next;
			p.next.prev = newNode;
			p.next = newNode;

		}
	}

	public void deleteNode(int data) {
		Node p = first;

		while(p != null) {
			if(p.data == data) {
				break;
			} else {
				p = p.next;
			}
		}

		if(p == null) {
			System.out.println("Required node not found");
		} else if(p == first) {
			first = p.next;
			p.prev = null;
		} else if(p == last) {
			last = p.prev;
			p.prev.next = null;
		} else {
			p.prev.next = p.next;
			p.next.prev = p.prev;
		}

	}

	public void searchNode(int data) {
		Node p = first;

		while(p != null) {
			if(p.data == data) {
				break;
			} else {
				p = p.next;
			}
		}

		if(p == null) {
			System.out.println("Required node not found");
		} else {
			System.out.println("Required node found at position " + p);
		}

	}

	public void countNodes() {
		Node p = first;

		int totNodes = 0;
		while(p != null) {
			totNodes++;
			p = p.next;
		}

		System.out.println("Total no. of nodes in the list is " + totNodes);

	}

	public void traverseLeftToRight() {
		Node p = first;

		while(p != null) {
			System.out.println(p.data);
			p = p.next;
		}

	}

	public void traverseRightToLeft() {
		Node p = last;

		while(p != null) {
			System.out.println(p.data);
			p = p.prev;
		}

	}

	public void destroyList() {
		first = last = null;
		System.out.println("Congratulations, you have successfully destroyed the list");
	}

	public void checkEmpty() {
		if(first == null && last == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("List is not empty");
		}
	}
}