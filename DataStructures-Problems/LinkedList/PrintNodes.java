/* Implement an algorithm to find the nth to last element of a singly linked list */

/* Solution: We need to find the nth node starting from the last element of the singly linked list.
	We are maintaining two pointers, pointing to the head node. 
	p2 will go n locations and p1 will still point to head.
	We will increment p1 and p2 together till p2.next is null 
	So, now p2 will point to the last node and till now p1 has covered length-n steps 
	p1 will point to the nth node from the last node. */

import java.util.Scanner;

class PrintNodes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter nth position from the last node");
		int n = sc.nextInt();
		nthToLast(n);
	}

	public static void nthToLast(int n) {

		if(head == null || n < 1) {
			System.out.println("Sufficient nodes not present");
			return;
		}

		Node p1 = p2 = head;

		for(int i=0; i<n; i++) {
			if(p2 == null) {
				System.out.println("List size is less than n, so couldn't reach to the nth node");
				return;
			}
			p2 = p2.next;
		}

		while(p2.next != null) {
			p2 = p2.next;
			p1 = p1.next;
		}

		/* p2 will point to the last node and p1 has covered length of linked list - n steps
		p1 points to the nth node from last. */

		System.out.println("nth node from the last node of a singly linked list is " + p1);
	}
}