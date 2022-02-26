import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);

        int element1 = 3;
        int element2 = 11;

        System.out.println("List before swapping :" + list);

        swap(list, element1, element2);

        System.out.println("List after swapping :" + list);
    }

    public static void swap(LinkedList<Integer> list, int ele1, int ele2){
        int index1 = list.indexOf(ele1);
        int index2 = list.indexOf(ele2);

        if (index1 ==-1 || index2 == -1){
            return;
        }
        list.set(index1, ele2);
        list.set(index2, ele1);
    }
}
