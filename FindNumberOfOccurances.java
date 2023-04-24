import java.util.Scanner;

public class FindNumberOfOccurances {
    public static void main(String[] args) {
        String word = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis posuere auctor est, id finibus sem varius id. Nam fermentum odio.";
        Scanner Obj = new Scanner(System.in);
        System.out.println("What letter do you seek?");
        String Letter = Obj.nextLine();
        System.out.println(LetterFinder(word, Letter));
    }

    private static int LetterFinder(String word, String Letter) {
        int counter = 0;
        char FirstLetter = Letter.charAt(0);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == FirstLetter) {
                ++counter;
            }
        }
        return counter;
    }
}
