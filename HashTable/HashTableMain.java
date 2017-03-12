import java.util.Hashtable;

class HashTableMain {
	public static void main(String args[]) {
		Hashtable<Integer, String> employees = new Hashtable<Integer, String>();

		employees.put(1, "Harvey");
		employees.put(2, "Mike");
		employees.put(3, "Donna");
		employees.put(4, "Rachel");
		employees.put(5, "Jessica");
		employees.put(6, "Louis");
		employees.put(1, "Stephen");

		for(Integer item : employees.keySet()) {
			System.out.println(item + ": " + employees.get(item));
		}
	}
}