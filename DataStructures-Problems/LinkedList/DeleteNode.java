/* Implement an algorithm to delete a node in the middle of a single linked list, 
	given only access to that node*/

/* Solution - Copy the contents of the next node in this node and delete the next node. 
	This problem cannot be solved if the node to be deleted is the last node. */

class DeleteNode {
	public static void main(String args[]) {
		System.out.println("Node deleted: " + deleteSingleNode(Node p));
	}

	public static boolean deleteSingleNode(Node p) {
		if(p == null || p.next == null) {
			return false;
		}

		Node nextNode = p.next;
		p.data = nextNode.data;
		p.next = nextNode.next;
		return true;
	}
}