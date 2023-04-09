public class ReverseString {
    public static void main(String[] args) {
        String str = "Java is great!";
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString += str.charAt(i);
        }
        System.out.println(newString);

    }
}
