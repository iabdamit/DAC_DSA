package cdac.in;

public class Stack {
    LinkedList linkedList;
    
    //! Constructor
    public Stack(){
        linkedList=new LinkedList();
    }
    //! push method
    public void push(int value){
        linkedList.insertNode(value,0);
        System.out.println(value+" inserted into the stack");
    }
    
    //!isEmpty()
    public boolean isEmpty(){
        if (linkedList.head==null) {
            return true;
        }
        else{
            return false;
        }
    }
    
    //! pop() method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1; 
        } else {
            int result = linkedList.head.value;
            linkedList.deleteNode(0);
            System.out.println("\n"+result);
            return result;
        }
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack Elements:");
            linkedList.traverseLinkedList();
        }
    }
}
