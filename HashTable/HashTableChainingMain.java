import java.util.Scanner;

class HashTableChainingMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int size, choice;
		String key;
		int value;

		System.out.println("Enter the size of hashtable");
		size = sc.nextInt();

		HashTableChaining table = new HashTableChaining(size);

		System.out.println("\n Hashtable operations \n" + 
							"1. Insert \n" + 
							"2. Remove \n" +
							"3. Get \n" + 
							"4. Clear \n" + 
							"5. Size \n" +
							"6. Display Table \n" +
							"7. Exit Program");

		do {
			System.out.println("\nEnter your choice");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter key and value");
					key = sc.next();
					value = sc.nextInt();
					table.insert(key, value);
					break;

				case 2: 
					System.out.println("Enter the key of record that you have to remove");
					key = sc.next();
					table.remove(key);
					break;

				case 3: 
					System.out.println("Enter the key");
					key = sc.next();
					table.get(key);
					break;

				case 4:
					System.out.println("Clearing the hashtable...");
					table.clear();
					break;

				case 5: 
					table.getSize();
					break;

				case 6:
					table.display();
					break;
			}
		} while(choice != 7);
	}
}