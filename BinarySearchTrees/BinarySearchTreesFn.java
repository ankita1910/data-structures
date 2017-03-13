class BinarySearchTreesFn {
	private Node left, right, root;
	private int noOfNodes, noOfLeafNodes;

	public BinarySearchTreesFn() {
		left = right = root = null;
	}

	public void insertNode(int data) {
		Node newNode = new Node(data);

		if(root == null) {
			root = newNode;
		} else {
			Node p = root;
			Node follow = null;

			/* Finding appropriate location for inserting new node.
				After while loop completes, p will be null and follow will point to the parent against which we have to insert new node.
				NewNode will always be inserted as a leaf node */

			while(p != null) {

				follow = p;

				if(p.data <= data) {
					p = p.left;
				} else {
					p = p.right;
				}
			}

			/* Checking if the new node is to be inserted to the left or right of follow */

			if(data <= follow.data) {
				follow.left = newNode;
			} else {
				follow.right = newNode;
			}
		}
	}

	/* PreOrder Traversal
		1. Visit the node
		2. Traverse left tree
		3. Traverse right tree
	*/

	public void callPreOrderTraversal() {
		if(root == null) {
			System.out.println("Tree is empty");
			return;
		}

		preOrderTraversal(root);
	}

	public void preOrderTraversal(Node root) {
		if(root != null) {
			System.out.println(root.data);
		
			preOrderTraversal(root.left);

			preOrderTraversal(root.right);
		}
	}

	/* Inorder Traversal - 
		1. Traverse the left tree
		2. Visit the node
		3. Traverse the right tree
	*/

	public void callInOrderTraversal() {
		if(root == null) {
			System.out.println("Tree is empty");
			return;
		}

		inOrderTraversal(root);
	}

	public void inOrderTraversal(Node root) {
		if(root != null) {

			inOrderTraversal(root.left);

			System.out.println(root.data);

			inOrderTraversal(root.right);
		}
	}

	/* Post Order Traversal - 
		1. Traverse left tree
		2. Traverse right tree
		3. Visit the node
	*/

	public void callPostOrderTraversal() {
		if(root == null) {
			System.out.println("Tree is empty");
			return;
		}

		postOrderTraversal(root);
	}

	public void postOrderTraversal(Node root) {

		if(root != null) {

			postOrderTraversal(root.left);

			postOrderTraversal(root.right);

			System.out.println(root.data);
		}

	}

	public void deleteNode(int data) {

		Node p = root;
		Node follow = null;

		/* Locating the node that we have to delete */
		while(p != null) {
			if(data == p.data) {
				break;
			}

			follow = p;
			if(data < p.data) {
				p = p.left;
			} else {
				p = p.right;
			}
		}

		if(p == null) {
			System.out.println("Required node not found");
			return;
		}

		/* p points to the node that we have to delete and follow points to its parent. 
			case 1: p does not have a left child. so, all it has is right child or no right child.
			if p is the left child of follow, we place p's right child as the left child of follow or
			if p is the right child of follow, we place p's right child as the right child of follow. 
			if p is the root with no left child, promote p.right to be the root. */

		/* case 2: We consider p does not have a right child and follow the same steps as done in case 1.*/

		/* case 3: This implies that p has both left and right child. 
			The node eligible to replace p should be such that its value is the highest compared to left subtree
			and lowest compared to the right subtree. 

			steps:	1. consider a temporary node pointing to the right subtree of p. 
					2. find the minimum node in the right subtree
					3. keep a track of the p node as f
					4. copy the value of t in p as this is the appt node to replace p
					5. Last condition is to check if the node to the deleted is the root node
						with only onr right node. In that case, f will be same as p
						Othersie f will point to the parent of the node that we have shifted to the p's position*/

		if(p.left == null) {
			if(p != root) {
				if(follow.left == p) {
					follow.left = p.right
				} else {
					follow.right = p.right;
				}
			} else {
				root = p.right;
			}
		} else if(p.right == null) {
			if(p != root) {
				if(follow.left == p) {
					follow.left = p.left;
				} else {
					follow.right = p.left;
				}
			} else {
				root = p.left;
			}
		} else {
			t = p.right;
			f = p;

			while(t.left != null) {
				t = t.left;
				f = t;
			}

			p.data = t.data;

			if(f != p) {
				f.left = t.right;
			} else {
				f.right = t.right;
			}
		}

	}

	public void searchNode(int data) {

		Node p = root;

		while(p != null) {
			if(p.data == data) {
				break;
			} else if(data < p.data) {
				p = p.left;
			} else {
				p = p.right;
			}
		}

		if(p == null) {
			System.out.println("Required node not found");
		} else {
			System.out.println("Node found at address " + p);
		}

	}

	public void findNodeLevel(int data) {
		int nodeLevel = 0;
		Node p = root;

		while(p != null) {
			
			if(data == p.data) {
				break;
			}
			
			nodeLevel++;

			if(data < p.data) {
				p = p.left;
			} else {
				p = p.right;
			}
		}

		System.out.println("Node found at level " + nodeLevel);
	}

	public void getNoOfNodes() {
		if(root == null) {
			System.out.println("Tree is empty");
			return;
		}
		noOfNodes = 0;
		countNodes(root);

		System.out.println("Total nodes in the tree is "+ noOfNodes);
	}

	public void countNodes(Node root) {
		if(root != null) {
			countNodes(root.left);
			noOfNodes++;
			countNodes(root.right);
		}
	}

	public void getNoOfLeafNodes() {

		if(root == null) {
			System.out.println("Tree is empty");
			return;
		}

		noOfLeafNodes = 0;
		countLeafNodes(root);

		System.out.println("Total no of leaf nodes in the tree is " + noOfLeafNodes);
	}

	public void countLeafNodes(Node root) {

		if(root != null) {
			countLeafNodes(root.left);

			if(root.left == null && root.right == null) {
				noOfLeafNodes++;
			}

			countLeafNodes(root.right);
		}
	}

	public void findSmallestNode() {
		if(root == null) {
			System.out.println("Tree is empty");
			return;
		}

		Node p = root;
		while(p.left != null) {
			p = p.left;
		}

		System.out.println("Smallest node in the tree is " + p.data);

	}

	public void findLargestNode() {
		if(root == null) {
			System.out.println("Tree is empty");
			return;
		}
		Node p = root;

		while(p.right != null) {
			p = p.right;
		}

		System.out.println("Largest node in the tree is " + p.data);
	}
}