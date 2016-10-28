
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First:");
        int first = reader.nextInt();
        System.out.println("Last:");
        int last = reader.nextInt();
        while (last >= first) {
                                    System.out.println(first);

                        first++;

        }
    }
}