
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int x[] = new int[array.length];
        for (int i = 0; i <= array.length - 1; i++) {
            x[i] = array[i];
        }
        return x;
    }

    public static int[] reverseCopy(int[] array) {
        int y[] = new int[array.length];
        int z = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            y[z] = array[i];
            z++;
        }
        return y;
    }
}
