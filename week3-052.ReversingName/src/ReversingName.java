import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        int i = 0;
        while (i < name.length()) {
            int x = name.length()-1;
            char character = name.charAt(x-i);
            System.out.print(character);
            i++;
        }
    }
}
