import java.util.Scanner;

class SinglyLinkedListMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		int choice, nodeValue, data;
		
		System.out.println("\n Menu \n \n" + 
							"1. Insert first node \n" + 
							"2. Insert before \n" + 
							"3. Insert after \n" + 
							"4. Delete \n" + 
							"5. Search \n" + 
							"6. Reverse \n" + 
							"7. CheckEmpty \n" + 
							"8. Traverse \n" + 
							"9. Count no. of nodes \n" + 
							"10. Destroy \n" + 
							"11. Exit Program");

		do {
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the value of first node");
					nodeValue = sc.nextInt();
					list.insertFirstNode(nodeValue);
					break;

				case 2: 
					System.out.println("Enter the value of node before which you have to insert the new node");
					nodeValue = sc.nextInt();
					System.out.println("Enter the value of new node");
					data = sc.nextInt();
					list.insertBefore(nodeValue, data);
					break;

				case 3:
					System.out.println("Enter the value of node after which you have to insert the new node");
					nodeValue = sc.nextInt();
					System.out.println("Enter the value of node");
					data = sc.nextInt();
					list.insertAfter(nodeValue, data);
					break;

				case 4: 
					System.out.println("Enter the value of node that you have to delete");
					nodeValue = sc.nextInt();
					list.deleteNode(nodeValue);
					break;

				case 5: 
					System.out.println("Enter the value of node that you have to search");
					nodeValue = sc.nextInt();
					list.searchNode(nodeValue);
					break;

				case 6: 
					System.out.println("Reversing the linked list...");
					list.reverseList();
					break;

				case 7:
					System.out.println("Checking if the list is empty...");
					list.isEmpty();
					break;

				case 8: 
					list.displayNodes();
					break;

				case 9: 
					list.countNodes();
					break;

				case 10: 
					list.destroyList();
					break;
			}
		} while(choice != 11);
	}
}