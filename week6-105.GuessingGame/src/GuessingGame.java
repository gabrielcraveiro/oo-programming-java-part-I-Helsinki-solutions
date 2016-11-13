
import java.util.Scanner;

public class GuessingGame {

    int lowerLimit;
    int upperLimit;
    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
        this.lowerLimit = 0;
        this.upperLimit = 0;
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        // write the guessing logic here
        while (this.lowerLimit != this.upperLimit) {
            if (isGreaterThan(average(this.lowerLimit, this.upperLimit))) {
                this.lowerLimit = average(this.lowerLimit, this.upperLimit)+1;
            } else {
                this.upperLimit = average(this.lowerLimit, this.upperLimit);
            }
        }
        System.out.println("The number you're thinking of is " + this.upperLimit);

    }

    // implement here the methods isGreaterThan and average
    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + " ? (y/n)");
        String y = reader.nextLine();
        if (y.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
