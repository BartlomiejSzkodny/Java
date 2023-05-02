class Solution {
    public static void main(String[] args) {
        int[] array = { 1, 3, -2, -100, 40, -70, 40, 34, 25, 765, -90, -1 };
        System.out.println(Integer.toString(arraySign(array)));
    }

    public static int arraySign(int[] nums) {
        int answer = 1;
        for (int i : nums) {
            if (i != 0) {
                i /= Math.abs(i);
            }

            answer *= i;
        }
        return signFunc(answer);

    }

    public static int signFunc(int x) {
        if (x > 0) {
            return 1;
        } else if (x == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}