import java.util.Scanner;

class BinarySearchTreesMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		BinarySearchTreesFn tree = new BinarySearchTreesFn();
		int choice, data;

		System.out.println("\n Binary Tree Operations \n" + 
							"1. Insert new node \n" + 
							"2. Pre Order Traversal \n" + 
							"3. In Order Traversal \n" + 
							"4. Post Order Traversal \n" + 
							"5. Delete node \n" + 
							"6. Search node \n" + 
							"7. Find level of the node \n" + 
							"8. Find number of nodes \n" + 
							"9. Find number of leaf nodes \n" + 
							"10. Find smallest node \n" + 
							"11. Find largest node \n" + 
							"12. Exit Program \n");

		do {
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch(choice) {
				case 1: 
					System.out.println("Enter the value of node");
					data = sc.nextInt();
					tree.insertNode(data);
					break;

				case 2: 
					System.out.println("Pre order traversal of the tree...");
					tree.callPreOrderTraversal();
					break;

				case 3: 
					System.out.println("In order traversal of the tree...");
					tree.callInOrderTraversal();
					break;

				case 4: 
					System.out.println("Post order traversal of the tree...");
					tree.callPostOrderTraversal();
					break;

				case 5: 
					System.out.println("Enter the value of node that you want to delete");
					data = sc.nextInt();
					tree.deleteNode(data);
					break;

				case 6: 
					System.out.println("Enter the value of node that you want to search");
					data = sc.nextInt();
					tree.searchNode(data);
					break;

				case 7: 
					System.out.println("Enter the value of node to find its level");
					data = sc.nextInt();
					tree.findNodeLevel(data);
					break;

				case 8: 
					tree.getNoOfNodes();
					break;

				case 9: 
					tree.getNoOfLeafNodes();
					break;

				case 10: 
					tree.findSmallestNode();
					break;

				case 11: 
					tree.findLargestNode();
					break;
			}
		} while(choice != 12);
	}
}