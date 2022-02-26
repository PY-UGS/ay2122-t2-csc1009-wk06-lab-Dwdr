import java.util.*;
public class Q5 {
    public static void main(String[] args){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(0,1);
        hashMap.put(1,3);
        hashMap.put(2,5);
        hashMap.put(3,7);
        hashMap.put(4,9);
        hashMap.put(5,11);
        System.out.println("\nThe HashMap before: " + hashMap);
        swap(hashMap, 1,5);
        System.out.println("\nThe HashMap after swap: " + hashMap);

    }

    public static void swap(HashMap<Integer, Integer> hashMap, int ele1, int ele2){
        int value = hashMap.get(ele2);
        hashMap.put(ele2, hashMap.get(ele1));
        hashMap.put(ele1, value);

        if (ele1 ==-1 || ele2 == -1){
            return;
        }
    }
}
