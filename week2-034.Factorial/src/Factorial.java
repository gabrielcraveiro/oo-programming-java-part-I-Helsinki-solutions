import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int x = reader.nextInt();
        int i = 0;
        int counter = 1;
        while(i < x) {
            i++;
            counter = counter * i;
            System.out.println("Factorial is :"+counter);
        }
    }
}
