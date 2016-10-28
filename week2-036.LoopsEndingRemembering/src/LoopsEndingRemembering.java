
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        int sum = 0;
        int times = 0;
        int y = 2;
        int k = 0;
        int even = 0;
        int odd = 0;
        Scanner reader = new Scanner(System.in);
        while (true) {

            System.out.println("Type numbers:");
            int x = reader.nextInt();
            k = x % y;
            if (x == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is:" + sum);
                System.out.println("How many numbers:" + times);
                double average = sum/(double)times;
                System.out.println("Average :" + average);  
                System.out.println("Even numbers"+even);
                System.out.println("Odd numbers"+odd);
                break;
            }
            if (k == 0) {
               even++;
            }
            if (k != 0) {
               odd++;
            }
            sum = sum + x;
            times++;
        }

    }
}
