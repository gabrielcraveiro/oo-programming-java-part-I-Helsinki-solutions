import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
        this.random = new Random((numberOfSides)+1);
    }

    public int roll() {
        return (int)this.random.nextInt(this.numberOfSides)+1;
    }
}
