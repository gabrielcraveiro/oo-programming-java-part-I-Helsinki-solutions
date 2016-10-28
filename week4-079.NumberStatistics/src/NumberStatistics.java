
public class NumberStatistics {

    private int numbers;
    private int size;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.numbers = 0;
        this.size = 0;
    }

    public void addNumber(int number) {
        // code here
        this.numbers = this.numbers + number;
        this.size += 1;
    }

    public int amountOfNumbers() {
        // code here
        return this.size;
    }

    public int sum() {
        if (size == 0) {
            return 0;
        } else {
            return this.numbers;

        }
    }

    public double average() {
        if (amountOfNumbers() == 0) {
            return 0;
        } else {
            return (double)sum()*1.0 / amountOfNumbers();

        }
    }
    



}
