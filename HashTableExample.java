import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashTable = new HashMap<>();

       
        hashTable.put("Alice", 25);
        hashTable.put("Bob", 30);
        hashTable.put("Charlie", 35);

        
        System.out.println("Alice's age: " + hashTable.get("Alice"));

        hashTable.remove("Bob");

       
        System.out.println("Hash table: " + hashTable);
    }
}
