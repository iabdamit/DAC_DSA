package cdac.in;

public class Main {

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.createNode(10);
		System.out.println(cll.head.value);
//		System.out.println(cll.head.next.value);
//		System.out.println(cll.head.next.next.value);
		
		cll.insertNode(20, 1);
		cll.insertNode(30, 2);
		cll.insertNode(40, 3);
		
		// print all the nodes
		cll.printAllNodes();
		System.out.println();
		cll.searchNode(30);
		
		// delete the node 
		System.out.println();
		cll.deleteNode(1);
		
		//cll.deleteEntireList();
		// print all the nodes
		cll.printAllNodes();
	}
}