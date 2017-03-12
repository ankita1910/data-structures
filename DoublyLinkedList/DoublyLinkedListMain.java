import java.util.Scanner;

class DoublyLinkedListMain {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Menu \n \n" + 
							"1. Insert first node \n" + 
							"2. Insert before \n" + 
							"3. Insert after \n" + 
							"4. Delete \n" + 
							"5. Search \n" + 
							"6. Count no. of nodes \n" + 
							"7. Traverse left to right \n" + 
							"8. Traverse right to left \n" + 
							"9. Destroy \n" + 
							"10. CheckEmpty \n" + 
							"11. Exit Program");

		int choice, nodeData, data;
		DoublyLinkedListFn list = new DoublyLinkedListFn();
		do {
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch(choice) {
				case 1: 
					System.out.println("Enter the value of node");
					data = sc.nextInt();
					list.insertFirstNode(data);
					break;

				case 2: 
					System.out.println("Enter the value of node before which you have to insert the new node");
					nodeData = sc.nextInt();
					System.out.println("Enter the value of node");
					data = sc.nextInt();
					list.insertBefore(nodeData, data);
					break;

				case 3: 
					System.out.println("Enter the value of node after which you have to insert the new node");
					nodeData = sc.nextInt();
					System.out.println("Enter the value of node");
					data = sc.nextInt();
					list.insertAfter(nodeData, data);
					break;

				case 4: 
					System.out.println("Enter the value of node that you have to delete");
					data = sc.nextInt();
					list.deleteNode(data);
					break;

				case 5:
					System.out.println("Enter the value of node that you have to search");
					data = sc.nextInt();
					list.searchNode(data);
					break;

				case 6:
					list.countNodes();
					break;

				case 7: 
					System.out.println("Traversing the list from left to right...");
					list.traverseLeftToRight();
					break;

				case 8:
					System.out.println("Traversing the list from right to left...");
					list.traverseRightToLeft();
					break;

				case 9:
					list.destroyList();
					break;

				case 10: 
					list.checkEmpty();
					break;
			}
		} while(choice != 11);
	}
}