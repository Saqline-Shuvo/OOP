import java.util.*;

public class LinkedListEquality {
    public static boolean areEqual(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        return l1.equals(l2);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3));
        System.out.println("Lists are equal: " + areEqual(list1, list2));
    }
}
