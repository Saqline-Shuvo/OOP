import java.util.*;

public class Kth_Smallest {
    public static int findKthSmallest(ArrayList<Integer> list, int k) {
        Collections.sort(list);
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 10, 4, 3, 20, 15));
        int k = 3;
        System.out.println("Kth smallest element: " + findKthSmallest(list, k));
    }
}
