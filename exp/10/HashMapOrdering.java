import java.util.*;

public class HashMapOrdering {
    public static void main(String[] args) {
       
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Apple");
        hashMap.put(1, "Banana");
        hashMap.put(2, "Orange");
        hashMap.put(4, "Grapes");
        
  
        System.out.println("HashMap (initial ordering by hash code):");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2, hashMap.get(2));
        linkedHashMap.put(4, hashMap.get(4));
        linkedHashMap.put(1, hashMap.get(1));
        linkedHashMap.put(3, hashMap.get(3));
        

        System.out.println("\nLinkedHashMap (insertion order maintained):");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
