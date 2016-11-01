
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Counter c = new Counter(2, true);
        c.decrease();
        c.decrease();
        c.decrease();
        System.out.println(c.value());

        Counter x = new Counter(900, false);
        x.decrease();
        System.out.println(x.value());
        
    }
}
