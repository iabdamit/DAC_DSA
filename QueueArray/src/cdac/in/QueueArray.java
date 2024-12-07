package cdac.in;

public class QueueArray {
    int[] arr;
    int frontEnd;// deleting
    int rearEnd;// insertion

    // ! constructor
    public QueueArray(int size) {
        this.arr = new int[size];
        this.frontEnd = -1;
        this.rearEnd = -1;
        System.out.println("The Quere is successfully create with size of " + size);
    }

    // ! isFull
    public boolean isFull() {
        if (rearEnd == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    // ! isEmpty
    public boolean isEmpty() {
        if (frontEnd == -1 && rearEnd == -1) {
            return true;
        } else {
            return false;
        }
    }

    // ! Enqueue (insert in queue)
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is full");
        } else {
            frontEnd = 0;
            rearEnd++;
            arr[rearEnd] = value;
            System.out.println(value + " is inserted into queue");
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return -1;
        } else {
            return arr[frontEnd];
        }
    }
}
