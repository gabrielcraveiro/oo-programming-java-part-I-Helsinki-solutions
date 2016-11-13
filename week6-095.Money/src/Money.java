
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money x = new Money(added.euros + this.euros, added.cents + this.cents);
        return x;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < this.euros) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decremented) {
        int centsDifference = this.cents - decremented.cents;
        int eurosDifference = this.euros - decremented.euros;
        if (centsDifference < 0) {
            centsDifference = 100 - Math.abs(centsDifference);
            eurosDifference--;
        }

        if (eurosDifference < 0) {
            centsDifference = 0;
            eurosDifference = 0;
        }

        Money result = new Money(eurosDifference, centsDifference);
        return result;

    }

}
