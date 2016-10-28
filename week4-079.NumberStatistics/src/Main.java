
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Type numbers :");
            int x = reader.nextInt();
            if (x == -1) {
                break;
            } else if (x % 2 == 0) {
                even.addNumber(x);
            } else {
                odd.addNumber(x);
            }
            stats.addNumber(x);

        }

        System.out.println("Sum :" + stats.sum());
        System.out.println("Sum of even :" + even.sum());
        System.out.println("Sum of odds :" + odd.sum());
    }

}
