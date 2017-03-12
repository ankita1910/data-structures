class SinglyLinkedList {
	private Node head;

	SinglyLinkedList() {
		head = null;
	}

	public void insertFirstNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else {
			System.out.println("First node already exists");
		}
	}

	public void insertBefore(int beforeNode, int data) {
		Node newNode = new Node(data);
		Node p = head;
		Node follow = null;
		while(p != null) {
			if(p.data == beforeNode) {
				break;
			} else {
				follow = p;
				p = p.next;
			}
		}

		if(p == null) {
			System.out.println("Node not found");
		} else if(p == head) {
			newNode.next = p;
			head = newNode;
		} else {
			newNode.next = p;
			follow.next = newNode;
		}

	}

	public void insertAfter(int afterNode, int data) {
		Node newNode = new Node(data);
		Node p = head;

		while(p != null) {
			if(p.data == afterNode) {
				break;
			} else {
				p = p.next;
			}
		}

		if(p == null) {
			System.out.println("Node not found");
		} else {
			newNode.next = p.next;
			p.next = newNode;
		}
	}

	public void deleteNode(int data) {
		Node p = head;
		Node follow = null;

		while(p != null) {
			if(p.data == data) {
				break;
			} else {
				follow = p;
				p = p.next;
			}
		}

		if(p == null) {
			System.out.println("Node not found");
		} else if(p == head) {
			head = p.next;
		} else {
			follow.next = p.next;
		}

	}

	public void searchNode(int data) {
		Node p = head;

		while(p != null) {
			if(p.data == data) {
				break;
			} else {
				p = p.next;
			}
		}

		if(p == null) {
			System.out.println("Node not found");
		} else {
			System.out.println("Node found in the list at position" + p);
		}

	}

	public void reverseList() {
		Node p = head;
		Node ahead = null;
		Node follow = null;

	/* Ahead helps us to traverse the list. p and follow keep on interchanging their positions. 
		Ahead points to next node after p, we keep it safe to traverse the list ahead.
		p should point to the previous node ie follow 
		To continue the process, follow will come a step ahead and point to p 
		and p will point to the ahead node.

		At the end, the head will point to the last node ie follow. p will become null till then.
	*/
		while(p != null) {
			ahead = p.next;
			p.next = follow;
			follow = p;
			p = ahead;
		}

		head = follow;
		System.out.println("New reversed linked list is");
		displayNodes();
	}

	public void isEmpty() {
		if(head == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("List is not empty");
		}
	}

	public void displayNodes() {
		if(head == null) {
			System.out.println("List is empty");
		} else {
			Node p = head;
			while(p != null) {
				System.out.println(p.data);
				p = p.next;
			}
		}
	}

	public void countNodes() {
		if(head == null) {
			System.out.println("List is empty");
		} else {
			Node p = head;
			int totalNodes = 0;
			while(p != null) {	
				totalNodes++;
				p = p.next;
			}
			System.out.println("Total no. of nodes in the list is " + totalNodes);
		} 
	}

	public void destroyList() {
		head = null;
		System.out.println("Congratulations, You have destroyed the list");
	}
}