
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        System.out.println("First:");
        int x = reader.nextInt();
        System.out.println("Last:");
        int y = reader.nextInt();
        while (x <= y) {
            sum = sum + x;
            System.out.println(sum);
            x++;
        }
    }
}