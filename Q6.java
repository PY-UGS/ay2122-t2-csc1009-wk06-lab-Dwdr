import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        System.out.println(random(1000, 9999, 500));
    }

    public static int random(int min, int max, int size){
        HashMap<Integer, Integer> rand = new HashMap<Integer, Integer>();
        for (int i=0; i<size; i++){
            Random r = new Random();
            rand.put(i, r.nextInt((max - min) + 1) + min);
        }
        System.out.println("500 Random integer hashMap: " + rand);
        Random r = new Random();
        int var = r.nextInt((max - min) + 1) + min;
        Set<Integer> keys = rand.keySet();
        for(Integer key:keys){
            if (var == rand.get(key)){
                System.out.print("Position: ");
                return key;
            }
        }
        System.out.print("Not found: ");
        return -1;
    }
}