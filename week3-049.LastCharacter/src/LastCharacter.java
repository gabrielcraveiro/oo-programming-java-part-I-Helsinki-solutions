import java.util.Scanner;


public class LastCharacter {


     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println("First Character :" + lastCharacter(name));
    }
    
    public static char lastCharacter(String text) {
        char character = text.charAt(text.length()-1);
        return character;
    }
    
}
