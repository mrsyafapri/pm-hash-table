package openhasing;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class HashChainApp {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(15);
        hashTable.insert(1);
        hashTable.insert(2);
        hashTable.insert(3);
        hashTable.insert(4);
        hashTable.insert(5);
        hashTable.insert(6);
        hashTable.insert(7);
        hashTable.insert(8);
        hashTable.insert(9);
        hashTable.insert(10);
        hashTable.displayTable();
    }
}
