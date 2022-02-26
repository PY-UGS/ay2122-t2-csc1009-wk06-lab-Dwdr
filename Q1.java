import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);

        System.out.println("List before the change: " + list);
        addAndSort(list, 8);
        System.out.println("List after the change: " + list);
    }
    public static void addAndSort(LinkedList<Integer> list,int value) {
        for (int i = 0; i < list.size(); i++) {
            if (value < list.get(i)) {
                list.add(i, value);
                return;
            }
        }

    }
}
