import java.util.HashSet;

public class FindingMissingNumbers {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 5, 6, 7, 9, 10, 15 };
        FindMissing(array);

    }

    private static void FindMissing(int[] array) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : array) {
            set.add(num);
        }
        int n = array[array.length - 1];
        for (int i = 0; i < n; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
