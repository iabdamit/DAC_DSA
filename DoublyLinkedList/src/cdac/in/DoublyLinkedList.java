package cdac.in;

public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;
    
    public DoublyNode createNode(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.prev = null;
        newNode.next = null;
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
    
    public void insertNode(int nodevalue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodevalue;
        
        if (head == null) {
            createNode(nodevalue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            DoublyNode nextNode = tempNode.next;
            tempNode.next = newNode;
            newNode.prev = tempNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;
        }
        size++;
    }
    
    //todo : traversing the Doubly linked list
    public void traverseDoublyLinkedList() {
        if (head == null) {
            System.out.println("Doubly Linked List is empty");
        } else {
            DoublyNode tempNode = head;
            for (int iTemp = 0; iTemp < size; iTemp++) {
                System.out.print(tempNode.value);
                if (iTemp != size - 1) {
                    System.out.print("-->");
                }
                tempNode = tempNode.next;
            } 
            System.out.println("");
        }
    }
    
    // todo : Reverse Doubly linked list
    public void reverseDoublyLinkedList() {
        if (head == null) {
            System.out.println("Doubly Linked List is empty");
        } else {
            DoublyNode tempNode = tail;
            for (int iTemp = 0; iTemp < size; iTemp++) {
                System.out.print(tempNode.value);
                if (iTemp != size - 1) {
                    System.out.print("<--");
                }
                tempNode = tempNode.prev;
            }
            System.out.println("");
        }
    }
    
    //todo : Searching the node in the Doubly linked list
    boolean searchNode(int nodeValue){
        if (head!=null) {
            DoublyNode tempNode = head;
            for (int i = 0; i <size; i++) {
                if (tempNode.value==nodeValue) {
                    System.out.println('\n'+"Node found at the location : "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println('\n'+"Node not found");
        return false;
    }
    
    //todo : delete the node
    public void deleteNode(int location){
        if (head==null) {
            System.out.println("Linked List is empty");
            return;
        }
        else if (location == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            
            if (head == null) {
                tail = null;
            }
        }
        else if (location >= size) {
            System.out.println("Node not found.");
            return;
        } 
        else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location) {
                tempNode = tempNode.next;
                index++;
            }
            
            tempNode.prev.next = tempNode.next;
            if (tempNode.next != null) {
                tempNode.next.prev = tempNode.prev;
            } else {
                tail = tempNode.prev;
            }
        }
        size--;
        
    }
    //todo : delete the entire doubly linked list
    // public void deleteAllNodes() {
        //     head = null;
        //     tail = null;
        //     size = 0;
        //     System.out.println("Doubly Linked List deleted successfully");
        // }
        
        //!
        // delete the entire Doubly Linked List
        public void deleteDoublyLinkedList() {
            DoublyNode tempNode = head;
            for(int iTemp = 0; iTemp < size; iTemp++) {
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = null;
            tail = null;
            System.out.println("Doubly Linked List deleted....");
        }
        
    }
    
    