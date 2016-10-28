
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        // program your solution here. Do not touch the above lines!
        int i = 0;
        int x = 1;
        while (i != numberDrawn) {
            System.out.println("Guess a number:");
            int y = reader.nextInt();
            if (y > numberDrawn) {
                System.out.println("The number is lesser, guesses made: "+x);
            } else if (y < numberDrawn) {
                System.out.println("The number is greater, guesses made: "+x);
            }
        
            x++;
            i = y;
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
