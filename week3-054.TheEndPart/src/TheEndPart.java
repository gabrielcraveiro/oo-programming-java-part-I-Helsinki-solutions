import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the end part: ");
        int length = reader.nextInt();
        int y = word.length()-length;
        System.out.println(y);
        System.out.println("Result:"+word.substring(y));
    }
}
