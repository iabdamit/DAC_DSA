package cdac.in;

public class Main {
	
	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.createNode(10);
		dll.insertNode(21,1);
		dll.insertNode(31,2);
		dll.insertNode(41,3);
		dll.insertNode(51,4);
		//!
		dll.traverseDoublyLinkedList();
		dll.reverseDoublyLinkedList();

		//! 
		dll.searchNode(31);
		//dll.deleteDoublyLinkedList();
		dll.deleteNode(1);
		dll.traverseDoublyLinkedList();
	}
}
