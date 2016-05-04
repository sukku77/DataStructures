package Trees;

import java.util.Stack;

public class DepthFirstTraversal {

	public static void main(String args[]){
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		DepthFirstTraversal d = new DepthFirstTraversal();
		System.out.println("Depth-First-Search : ");
		d.DFS(root);
	}

	private void DFS(Node root) {
		Stack<Node> s= new Stack<Node>();
		s.add(root);
		while(!s.isEmpty()){
			Node x = s.pop();
			if(x.right!=null){
				s.add(x.right);		
			}
			if(x.left!=null){
				s.add(x.left);
			}
			System.out.println(x.item);
		}
		
	}

}
