import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "MMCXVII";
        System.out.println(converter(s));
    }

    public static int converter(String s) {
        int num = 0;
        HashMap<Character, Integer> lib = new HashMap<Character, Integer>();

        lib.put('I', 1);
        lib.put('V', 5);
        lib.put('X', 10);
        lib.put('L', 50);
        lib.put('C', 100);
        lib.put('D', 500);
        lib.put('M', 1000);
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((lib.get(s.charAt(i)) * 4) < num) {
                num -= (lib.get(s.charAt(i)));
            } else
                num += lib.get(s.charAt(i));

        }
        return num;
    }
}
