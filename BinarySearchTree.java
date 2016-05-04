package Trees;

public class BinarySearchTree {
    public static Node root = null;
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.insert(3);b.insert(8);
	    b.insert(1);b.insert(4);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
        b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		
		b.display(root);
		
		System.out.println(b.find(17));
		
		b.delete(15);
		
		b.display(root);
	}

	private void insert(int i) {
		Node node = new Node(i);
		if(root == null){
			root = node;
			return;
		}
		Node current = root;
		Node parent = null;
		
	while(true){
		parent = current;
		if(i<current.item){
			current =current.left;
			if(current == null){
				parent.left = node;
				return;
			}			
		}else{
			current = current.right;
			if(current == null){
				parent.right = node;
				return;
			}
		}
	}
	}
	
	public boolean find(int id){
		Node current = root;
		
		while(current != null){			
			if(id == current.item){
				return true;
			}else if(id > current.item){
				current = current.right;
				
			}else if(id < current.item){
				current = current.left;				
			}
		}		
		return false;
	}
	
	
	public void delete(int id){
		Node current = root;
		Node parent = null;
		while(current != null){		
			parent = current;
			if(id > current.item){
				current = current.right;
				if(id == current.item){
				    parent.right = null;
				    return;
				}
				
			}else if(id < current.item){
				current = current.left;
				if(id == current.item){
				    parent.left = null;
				    return;
				}
			}
		}		
		
	}
	
	public void display(Node root) {
		// Inorder
		if (root != null) {
			display(root.left);
			System.out.println(root.item);
			display(root.right);
		}
		//pre order
		if (root != null) {
			display(root.left);
			System.out.println(root.item);
			display(root.right);
		}
		//postorder
		if(root !=null){
  		   display(root.left);
			   System.out.println(root.item);
			   display(root.right);
		}
	}
	
	}
	

class Node{
	int item;
	Node left;
	Node right;
	Node(int item){
		this.item = item;
		this.left = null;
		this.right = null;		
	}
}