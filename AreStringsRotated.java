public class AreStringsRotated {
    public static void main(String[] args) {
        String str1 = "Java is great";
        String str2 = "taerg si avaJ";
        System.out.println(checkIftheSame(str1, str2));
    }

    private static boolean checkIftheSame(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(str2.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
