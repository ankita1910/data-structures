/* To check if linked list has cycles */

/* Put this function in your linkedlist class
	head points to the first node. Node is the datatype of the linked list nodes */

/* Solution - We have two pointers to traverse the list 
	fast - runs twice as the slow pointer
	If the two pointers collide during their traversal, we know there is a loop in the list.
*/

class LinkedListCycles {
	public boolean hasCycles() {
		if(head == null) {
			return false;
		}

		Node fast = head.next;
		Node slow = head;

		while(fast != null && fast.next != null) {
			if(fast == slow) {
				return true;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		return false;
	}
}