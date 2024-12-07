package cdac.in;

public class Main {
    public static void main(String[] args) {
        StackDemo sd=new StackDemo(5);
        sd.push(10);
        sd.push(20);
        sd.push(30);
        sd.push(40);
        sd.push(50);
        sd.push(60);
        
        sd.printStack();
        sd.pop();
        sd.printStack();
    }
    
} 