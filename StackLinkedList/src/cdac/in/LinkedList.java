package cdac.in;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public Node createNode(int nodeValue){
        head=new Node();//engine
        Node newNode=new Node();//cart
        newNode.next=null;
        newNode.value=nodeValue;
        head=newNode;// assigning address of the new node to the head node
        tail =newNode;
        size=1;
        return head;
    }
    public void insertNode(int nodevalue,int location){
        Node newNode=new Node();
        newNode.value=nodevalue;
        if (head==null) {
            createNode(nodevalue);
            return;
        }
        //! add the newNode at the beginning of the linked list
        else if (location==0) {
            newNode.next=head;
            head=newNode;
        }
        //! add the newNode at the end of the linked list
        else if (location>=size) {
            newNode.next=null;
            tail.next=newNode;
            tail =newNode;
        }
        //! add the newNode at the middle of the linked list
        
        else{
            Node tempNode=head;
            int index=0;
            while (index<location-1) {
                tempNode=tempNode.next;
                index++;
            }
                Node nextNode=tempNode.next;
                tempNode.next=newNode;
                newNode.next=nextNode;
            }
            size++;
        }
        //!
        //todo : traversing the linked list
        public void traverseLinkedList(){
            if (head==null) {
                System.out.println("Single Linked List is empty");
            }
            else{
                Node tempNode=head;
                for (int iTemp = 0; iTemp < size; iTemp++) {
                    System.out.print(tempNode.value);
                    if (iTemp!=size-1) {
                        System.out.print("-->");
                    }
                    tempNode=tempNode.next;
                }
            }
        }
        //todo : Searching the node in the linked list
        boolean searchNode(int nodeValue){
            if (head!=null) {
                Node tempNode=head;
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
            else if(location==0 ){
                head=head.next;
                //! means head and tail are equal
            }
            else if (location>=size) {
                System.out.println(" Node not found.");
                return;
            }
            else {
                Node tempNode = head;
                int index = 0;
                while (index < location - 1) {
                    tempNode = tempNode.next;
                    index++;
                }
                tempNode.next = tempNode.next.next;
                if (location == size - 1) {
                    tail = tempNode;
                }
            }
            size--;
        }
        
        // delete the node 
        public void deleteNode1(int location) {
            if(head == null) {
                System.out.println("Linked List is empty");
                return;
            }
            // delete the first node
            else if(location == 0) {
                head = head.next;
                size--;
                if(size == 0) {
                    tail = null;
                }
            }
            else if(location >= size) {
                Node tempNode = head;
                for(int iTemp = 0; iTemp < size-1; iTemp++) {
                    tempNode = tempNode.next;
                }
                if(tempNode == head) {
                    tail = head = null;
                    size--;
                    return;
                }
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
            else {
                Node tempNode = head;
                for(int iTemp = 0; iTemp < location -1; iTemp++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                size--;
            }
        }
        //! delete the entire linked list
        public void deleteAllNodes(){
            head=null;
            tail=null;
            System.out.println("Linked List deleted successfully");
        }
    }