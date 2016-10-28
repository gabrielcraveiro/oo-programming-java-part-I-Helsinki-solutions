import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String word = reader.nextLine();
        System.out.print("Type the second word: ");
        String innerWord = reader.nextLine();

        int index = word.indexOf(innerWord);

        if (index > -1) {
            System.out.println("The word " + innerWord + " is found in the word " + word + ".");
        }
        else {
            System.out.println("The word " + innerWord + " is not found in the word " + word + ".");
        }
    }
}