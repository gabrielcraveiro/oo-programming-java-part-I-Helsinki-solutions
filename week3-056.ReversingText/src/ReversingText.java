
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String reverso = "";
        int i = 0;
        while (i < text.length()) {
        int x = text.length()-1;
        char character = text.charAt(x-i);
        System.out.print(character);
        i++;
        reverso = reverso + character;
        }
        return reverso;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
        
    }
}
