public class FindDuplicateInArray {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 5 };

        bruteForce(array);
    }

    private static void bruteForce(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("DuplicateElement " + array[i]);
                }
            }
        }
    }

}