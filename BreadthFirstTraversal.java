package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {

	public static void main(String[] args) throws java.lang.Exception {
		Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);

		BreadthFirstTraversal i = new BreadthFirstTraversal();
		System.out.println("Breadth First Search : ");
		i.levelOrderQueue(root);
	}

	private void levelOrderQueue(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(q.size() > 0){
			Node n = q.remove();
			if(n!=null){
				System.out.println(n.item);
				q.add(n.left);
				q.add(n.right);
			}			
		}
	}

}
