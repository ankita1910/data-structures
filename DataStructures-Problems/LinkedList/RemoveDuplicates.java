/* Remove Duplicates from an unsorted linked list */

class RemoveDuplicates {
	public static void main(String args[]) {
		remDuplicates();
	}

	public static void remDuplicates() {
		Hashtable table = new Hashtable();

		Node p = head;
		Node follow = null;

		while(p != null) {
			if(table.containskey(p.data)) {
				follow.next = p.next;
			} else {
				table.put(p.data, true);
				follow = p;
			}

			p = p.next;
		}
	}
}