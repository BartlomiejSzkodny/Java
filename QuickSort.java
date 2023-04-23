import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = { 8, 5, 3, 4, 1, 9, 0, 6 };
        quickSortAlg(array);
    }

    private static void quickSortAlg(int[] array) {
        int[] TempArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            int pivot = (int) (Math.random() * (array.length - 0 + 1) + 0);
            System.out.println(pivot);
            
        }
        int pivot = (int) (Math.random() * (array.length - 0 + 1) + 0);

    }
}
