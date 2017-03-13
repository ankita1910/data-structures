/* Class Variables 
	totNodes - Contains the total items in the table
	LinkedHashEntry - an array of nodes. Each node contains key(String), value(int) and next(LinkedHashEntry)
	TABLE_SIZE - User initialises the size of hashtable
*/

class HashTableChaining {
	private int totNodes;
	private LinkedHashEntry [] table;
	private int TABLE_SIZE;

	public HashTableChaining(int size) {
		totNodes = 0;
		TABLE_SIZE = size;
		table = new LinkedHashEntry[TABLE_SIZE];

		/* Initialising all the nodes to null */

		for(int i=0; i<TABLE_SIZE; i++) {
			table[i] = null;
		}
	}

	public void insert(String key, int value) {

		/* Evaluating the hash with respect to the key */
		int hash = myHash(key) % TABLE_SIZE;

		/* If this hashValue doesn't already exist, create a new entry in the table with this hash
			If the hash already exists in the table, we will connect its siblings (Nodes with the same hash)
			using its next. Next will store the address of its siblings. 		
		*/

		if(table[hash] == null) {
			table[hash] = new LinkedHashEntry(key, value);
		} else {
			LinkedHashEntry entry = table[hash];

			while(entry.next != null && !entry.key.equals(key)) {
				entry = entry.next;
			}

			/* If a node is found with the same key, override it with the new value. 
				Else attach this value to its next */

			if(entry.key.equals(key)) {
				entry.value = value;
			} else {
				entry.next = entry;
			}
		}
		totNodes++;
	}

	public void remove(String key) {
		int hash = myHash(key) % TABLE_SIZE;

		if(table[hash] == null) {
			System.out.println("Node not found. Its hash doesn't exist in the table");
			return;
		}

		LinkedHashEntry entry = table[hash];
		LinkedHashEntry follow = null;

		while(entry.next != null && !entry.key.equals(key)) {
			entry = entry.next;
		}

		if(entry.key.equals(key)) {

			/* If the node to be removed is first in the list*/
			if(follow == null) {
				table[hash] = entry.next;
			} else {
				follow.next = entry.next;
			}
		}
		totNodes--;
	}

	public void get(String key) {
		int hash = myHash(key) % TABLE_SIZE;

		if(table[hash] == null) {
			System.out.println("Node not found");
		} else {
			LinkedHashEntry entry = table[hash];

			while(entry.next != null && !entry.key.equals(key)) {
				entry = entry.next;
			}

			if(entry == null) {
				System.out.println("Hash found but node not found");
			} else {
				System.out.println("Node found with value " + entry.value);
			}
		}
	}

	public void getSize() {
		System.out.println("Total nodes in the table is " + totNodes);
	}

	public void clear() {
		for(int i=0; i<TABLE_SIZE; i++) {
			table[i] = null;
		}
	}

	public void display() {
		for(int i=0; i<TABLE_SIZE; i++) {
			System.out.print("\nBucket " + (i+1) + ": ");

			LinkedHashEntry entry = table[i];

			while(entry != null) {
				System.out.print(entry.value + " ");
				entry = entry.next;
			}
		}
	}

	private int myHash(String key) {
		int hashValue = key.hashCode();
		hashValue = hashValue % TABLE_SIZE;

		if(hashValue < 0) {
			hashValue += TABLE_SIZE;
		}

		return hashValue;
	}
}