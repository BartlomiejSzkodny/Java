import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String stringTocheck = "abcbabbabcdeadabc";
        System.out.println(longestSubchecker(stringTocheck));
    }

    private static String longestSubchecker(String stringTocheck) {
        HashSet<Character> set = new HashSet<>();
        String Longest = "";
        String longestForNow = "";
        for (int i = 0; i < stringTocheck.length(); i++) {
            char c = stringTocheck.charAt(i);
            if (set.contains(c)) {
                longestForNow = "";
                set.clear();
            }
            longestForNow += c;
            set.add(c);
            if (longestForNow.length() > Longest.length()) {
                Longest = longestForNow;
            }
        }
        return Longest;
    }
}
