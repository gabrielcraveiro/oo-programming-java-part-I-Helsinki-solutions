
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
       
        // Implement your program here. Remember to ask the input from user.
         Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number:");
        int y = Integer.parseInt(reader.nextLine());
        double z = (double) x /y;
        System.out.println("Division: "+x+" / "+y+" = "+z);
    }
}
