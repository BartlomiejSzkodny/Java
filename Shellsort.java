public class Shellsort {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void ShellSortAlgorithm(int[] array) {
        int h = 1;
        while (h < (array.length - 1) / 9) {
            h = 3 * h + 1;
        }
        while (h > 0) {
            for (int i = h + 1; i <= array.length - 1; i++) {
                int x = array[i];
                int j = i;
                while (j >= h + 1 && x < array[j - h]) {
                    array[j] = array[j - h];
                    j = j - h;
                }
                array[j] = x;
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 6, 4, 8, 5, 9, 4, 5, 7, 10, 13, 16, 18, 14, 18, 12, 14, 19, };
        ShellSortAlgorithm(array);
        printArray(array);
        ;
    }

}
