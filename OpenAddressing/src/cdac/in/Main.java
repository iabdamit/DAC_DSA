package cdac.in;

public class Main {

    public static void main(String[] args) {
        // Create a hash table with an initial size of 5
        LinearProbing lp = new LinearProbing(5);

        // Insert some data into the hash table
        lp.insertData("Java");
        lp.insertData("Python");
        lp.insertData("C++");
        lp.insertData("JavaScript");

        // Display the load factor
        System.out.println("Load Factor: " + lp.getLoadFactor());

        // Insert more data to trigger rehashing
        lp.insertData("Ruby");
        lp.insertData("C#");
        lp.insertData("Go");

        // Display the load factor after rehashing
        System.out.println("Load Factor after rehashing: " + lp.getLoadFactor());
    }
}
