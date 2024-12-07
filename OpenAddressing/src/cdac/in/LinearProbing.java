package cdac.in;
import java.util.ArrayList;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    public LinearProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    // Hash Function or magic function
    public int modASCIIHashFunction(String word, int cellNumber) {
        char ch[];
        ch = word.toCharArray();
        int i, sum;
        for(i = 0, sum = 0; i < word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % cellNumber;
    }

    public double getLoadFactor() {
        double loadFactor = usedCellNumber * 1.0 / hashTable.length;
        return loadFactor;
    }

    // Rehashing 
    public void rehashKeys(String word) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<String>();
        for(String str : hashTable) {
            if(str != null) {
                data.add(str);
            }
        }
        data.add(word);
        hashTable = new String[hashTable.length * 2];
        for(String str : data) {
            insertData(str);
        }
    }

    // Inserting Data into the hash table with linear probing
    public void insertData(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor > 0.75) {
            rehashKeys(word);
        } else {
            int index = modASCIIHashFunction(word, hashTable.length);

            while (hashTable[index] != null) {
                index = (index + 1) % hashTable.length;
            }

            hashTable[index] = word;
            usedCellNumber++;
            System.out.println("Word '" + word + "' has been successfully inserted at index " + index);
        }
    }
}
