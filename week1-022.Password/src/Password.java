
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        boolean loop = true;
        while (loop = true) {
            System.out.println("Type the password:");
            String teste = reader.nextLine();
            if (password.equals(teste)) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("The secret is: jryy qbar!");
    }
}
