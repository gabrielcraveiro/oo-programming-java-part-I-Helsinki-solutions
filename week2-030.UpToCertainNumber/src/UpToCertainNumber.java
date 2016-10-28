
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 0;
        // Write your code here
        System.out.println("Type a number : ");
        int upto = reader.nextInt();
        while (number < upto) {
            number++;
            System.out.println(number);
        }
    }
}
