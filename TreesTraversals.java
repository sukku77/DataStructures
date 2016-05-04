package Trees;

public class TreesTraversals {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		TreesTraversals i = new TreesTraversals();
		System.out.println("Inorder Traversal:");
		i.inorderRecursive(root);
		System.out.println("\nPreorder Traversal:");
		i.preOrderRecursive(root);
		System.out.println("\nPostorder Traversal:");
		i.postOrderRecursive(root);
	}

	private void postOrderRecursive(Node root) {
		if(root!=null){
			postOrderRecursive(root.right);
			postOrderRecursive(root.left);
			System.out.println(root.item);
		}
		
	}

	private void preOrderRecursive(Node root) {
		if(root!=null){
			System.out.println(root.item);
			preOrderRecursive(root.left);
			preOrderRecursive(root.right);
		}
	}

	private void inorderRecursive(Node root) {
		if(root!=null){
			inorderRecursive(root.left);
			System.out.println(root.item);
			inorderRecursive(root.right);
		}
	}

}

