public class MajorityInArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 2, 2, 2, 2, 2, 3, 4, 6, 4, 9, 3, 10, 6, 11, 2, 3, 13, 11, 16, 11 };
        findMajority(array);
    }

    private static void findMajority(int[] array) {
        int num = 0;
        int numberOfTimes = 0;
        int WhatNumber = 0;
        for (int i = 0; i < array.length; i++) {

            for (int o = 0; o < array.length; o++) {
                if (i == array[o]) {
                    num += 1;
                }
            }
            if (numberOfTimes < num) {
                numberOfTimes = num;
                WhatNumber = array[i];
            }

            num = 0;
        }
        System.out.println("Number " + "'" + WhatNumber + "'" + " repeated " + numberOfTimes + " times");
    }
}
