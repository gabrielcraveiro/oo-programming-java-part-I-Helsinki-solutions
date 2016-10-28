
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        System.out.println("Until what?");
        int end = reader.nextInt();
        while (i < end) {
                        i++;

            sum = sum + i;
            System.out.println(sum);
        }
        
    }
}
