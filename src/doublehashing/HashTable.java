package doublehashing;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class HashTable {

    private Data[] hashArray;
    private int size;
    private int totalPrimeSize;

    public HashTable(int size) {
        this.size = size;
        hashArray = new Data[size];
        totalPrimeSize = getPrime();
    }

    public int getPrime() {
        for (int i = size - 1; i >= 1; i--) {
            int cnt = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                return i;
            }
        }
        return 3;
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            if (hashArray[j] != null) {
                System.out.println(" | " + j + "\t | " + hashArray[j].getKey() + " |");
            } else {
                System.out.println(" | " + j + "\t | -- |");
            }
        }
        System.out.println("");
    }

    public int hashFunc1(int key) {
        return key % size;
    }

    public int hashFunc2(int key) {
        return totalPrimeSize - key % totalPrimeSize;
    }

    public void insert(int data) {
        Data item = new Data(data);
        int key = item.getKey();
        int hashing1 = hashFunc1(key);
        int hashing2 = hashFunc2(key);
        while (hashArray[hashing1] != null) {
            hashing1 += hashing2;
            hashing1 %= size;
        }
        hashArray[hashing1] = new Data(key);
    }

    public void delete(int key) {
        int hash1 = hashFunc1(key);
        int hash2 = hashFunc2(key);
        while (hashArray[hash1] != null && !(hashArray[hash1].getKey() == key)) {
            hash1 += hash2;
            hash1 %= size;
        }
        hashArray[hash1] = null;
    }

    public Data find(int key) {
        int hash1 = hashFunc1(key);
        int hash2 = hashFunc2(key);
        while (hashArray[hash1] != null) {
            if (hashArray[hash1].getKey() == key) {
                return hashArray[hash1];
            }
            hash1 += hash2;
            hash1 %= size;
        }
        return null;
    }
}
