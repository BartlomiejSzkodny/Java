public class WhatNumbersGiveSpecSum {
    public static void main(String[] args) {
        int array[] = { 1, 24, 5, 2, 56, 33, 87, 65, 25, 7, 8, 9, 6 };
        int sum = 25;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == (sum - array[i])) {
                    System.out.println(array[i] + " , " + array[j]);
                }
            }
        }
    }
}
