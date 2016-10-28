
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int i = -1;
        int number = reader.nextInt();
        int sum = 0;
        int counter = 0;
        while (i < number) {
            i++;
            int result = (int) Math.pow(2, i);
            sum = sum + result;
            System.out.println(sum);
        }

    }
}
