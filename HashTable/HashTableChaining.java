class HashTableChaining {
	private int totNodes;
	private int size;
	private LinkedHashEntry [] table;

	HashTableChaining(int size) {
		this.totNodes = 0;
		this.size = size;
		table = new LinkedHashEntry[this.size];

		for(int i=0; i<this.size; i++) {
			table[i] = null;
		}
	}

	public void insert(String key, int value) {

	}

	public void remove(String key) {

	}

	public void get(String key) {

	}

	public void clear() {
		for(int i=0; i<this.size; i++) {
			table[i] = null;
		}
	}

	public void getSize() {
		System.out.println("Total nodes in the hashtable is "+ this.totNodes);
	}

	public void display() {

	}

	private int myHash(String key) {
		int hashValue = key.hashCode();
		hashValue = hashValue % this.size;

		if(hashValue < 0) {
			hashValue += this.size;
		}

		return hashValue;
	}
}