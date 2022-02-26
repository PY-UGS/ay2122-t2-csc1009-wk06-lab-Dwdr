import java.util.*;

// Able to make, but not a good idea as HashMap is not meant to keep entries in sorted order
// Rather than sorting the data according to a key, it computes the location of the data from the key
// Read more: https://www.java67.com/2015/01/how-to-sort-hashmap-in-java-based-on.html#ixzz7LyRbLDRM
// A good hash function is essential for hash table performance. A poor choice of hash function is likely to lead to an excess amount of collisions which will degrade performance significantly.
public class Q4{

    public static void addAndSort(HashMap<Integer, Integer> hashMap, int value) {
        hashMap.put(hashMap.size(), value);
        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    public static void main(String[] args){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(0,1);
        hashMap.put(1,3);
        hashMap.put(2,5);
        hashMap.put(3,7);
        hashMap.put(4,9);
        hashMap.put(5,11);
        System.out.println("\nThe HashMap before: " + hashMap);

        System.out.println("\nThe HashMap after: ");
        addAndSort(hashMap, 8);
    }
}

