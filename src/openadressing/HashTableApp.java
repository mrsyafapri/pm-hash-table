package openadressing;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class HashTableApp {

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
        hashTable.insert(11);
        hashTable.insert(12);
        hashTable.insert(13);
        hashTable.insert(14);
        hashTable.insert(15);
        hashTable.delete(10);
        hashTable.displayTable();
    }
}
