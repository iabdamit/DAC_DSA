package cdac.in;

public class CircularLinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public Node createNode(int nodeValue) {
        head = new Node();
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = newNode; 
        head = newNode;
        tail = newNode;
        size = 1;
        return newNode;
    }
    
    // insertion method
    public void insertNode(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        if(head == null) {
            createNode(10);
            return;
        }
        else if(location == 0) {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        else if(location >= size) {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        else {
            Node tempNode = head;
            int index = 0;
            while(index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;			
        }
        size++;
    }
    
    // traversal the Circular Linked List
    public void printAllNodes() {
        if(head != null) {
            Node tempNode = head;
            for(int iTemp = 0; iTemp < size; iTemp++) {
                System.out.print(tempNode.value);
                if(iTemp != size - 1) {
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
            }
        }
        else {
            System.out.println("Circular Linked List does not exit. ");
        }
    }
    
    // search node in the Circular Linked List
    public boolean searchNode(int nodeValue) {
        if(head != null) {
            Node tempNode = head;
            for(int iTemp = 0; iTemp < size; iTemp++) {
                if(tempNode.value == nodeValue) {
                    System.out.println("Node found at the location " + iTemp);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;		
    }
    
    // delete the node from a particular location
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The Circular Linked List doesn't exist");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            
            if (size == 0) {
                tail = null;
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
            } else {
                tempNode.next = head;
                tail = tempNode;
            }
            
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    
    
    // delete the entire Circular Linked List
    
    public void deleteEntireList() {
        if(head == null) {
            System.out.println("The Circular Linked doesn't exist");
        }
        else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The Circular Linked deleted ");
        }
    }
    
    
}
