import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        
        String reverso = "";
        int i = 0;
        while (i < text.length()) {
        int x = text.length()-1;
        char character = text.charAt(x-i);
        i++;
        reverso = reverso + character;
        }
        
        if (reverso.equals(text)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
