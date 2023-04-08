
import java.util.Arrays;

public class SortNamesInArray {
    public static void main(String[] args) {
        System.out.println("Adam".compareTo("Bartek"));
        String[] ListOfNames = { "James", "Robert", "John", "Michael", "David", "William", "Richard", "Joseph",
                "Thomas", "Charles", "Bartek" };
        NamesSorter(ListOfNames);
        System.out.println(Arrays.toString(ListOfNames));
    }

    private static void NamesSorter(String[] listOfNames) {
        String temp = "";
        for (int i = 0; i < java.lang.Math.pow(listOfNames.length, 2); i++) {
            for (int o = 0; o < listOfNames.length - 1; o++) {
                if (listOfNames[o].compareTo(listOfNames[o + 1]) > 0) {
                    temp = listOfNames[o];
                    listOfNames[o] = listOfNames[o + 1];
                    listOfNames[o + 1] = temp;
                }
            }
        }
    }
}
