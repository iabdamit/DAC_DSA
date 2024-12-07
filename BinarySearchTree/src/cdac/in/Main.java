package cdac.in;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertNode(70);
		bst.insertNode(50);
		bst.insertNode(90);
		bst.insertNode(80);
		bst.insertNode(100);
		bst.insertNode(30);
		bst.insertNode(60);
		bst.insertNode(20);
		bst.insertNode(40);
		
		bst.preOrder(bst.root);
	}

}
