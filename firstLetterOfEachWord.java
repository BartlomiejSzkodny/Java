public class firstLetterOfEachWord {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over a lazy dog";
        FirstLetter(str);
    }

    private static void FirstLetter(String str) {
        System.out.println(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.println(str.charAt(i + 1));
            }
        }
    }
}
