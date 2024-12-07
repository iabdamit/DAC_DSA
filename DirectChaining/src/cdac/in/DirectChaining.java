package cdac.in;

import java.util.LinkedList;

public class DirectChaining {
    private LinkedList<String>[] hashTable;
    private int maxChainSize = 5;

    // Constructor
    public DirectChaining(int size) {
        hashTable = new LinkedList[size];
    }

    // Hashing function
    public int modASCIIHashFunction(String word, int cellNumber) {
        char[] ch = word.toCharArray();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum += ch[i];
        }
        return sum % cellNumber;
    }

    // Insert function
    public void insertValue(String word) {
        int hashValue = modASCIIHashFunction(word, hashTable.length);

        if (hashTable[hashValue] == null) {
            hashTable[hashValue] = new LinkedList<>();
        }

        hashTable[hashValue].add(word);
    }

    // Display all keys
    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("\nHash table does not exist");
        } else {
            System.out.println("\n********** Hash Table **********");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + " Keys " + hashTable[i]);
            }
        }
    }
}
