import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        System.out.println(random(1000, 9999, 500));
    }
    public static int random (int min, int max, int size){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            Random r = new Random();
            list.add(r.nextInt((max - min) + 1) + min);
        }
        System.out.println("500 Random integer list: " + list);
        Random r = new Random();
        int var = r.nextInt((max - min) + 1) + min;
        for (int i = 0; i < size; i++) {
            if (var == list.get(i)) {
                System.out.print("Position: ");
                return i;
            }
        }
        System.out.print("Not found: ");
        return -1;
    }
}


