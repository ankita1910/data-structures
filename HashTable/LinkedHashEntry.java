class LinkedHashEntry {
	String key;
	int value;
	LinkedHashEntry next;

	public LinkedHashEntry(String key, int value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
}