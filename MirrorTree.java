package Trees;

public class MirrorTree {

	public static void main (String[] args) throws java.lang.Exception
	{
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(7);

		MirrorTree i  = new MirrorTree();
		i.mirror(root);
	}

	private void mirror(Node root) {
		
	}

}
