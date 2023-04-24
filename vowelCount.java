public class vowelCount {
    public static void main(String[] args) {
        String str = "Sometext";
        countVowels(str);
    }

    private static void countVowels(String str) {
        int counter = 0;
        int help = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                ++counter;
            } else {
                ++help;
            }
        }
        System.out.println(counter);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y');
    }
}
