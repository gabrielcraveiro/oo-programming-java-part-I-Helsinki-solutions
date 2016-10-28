
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        while (true) {
            System.out.println("Type a number:");
            double x = reader.nextDouble();
            if (x>40 || x<-30) {
            }
            else {
                Graph.addNumber(x);
            System.out.print("Continue? ('no' to quit)? ");
            String command = reader.nextLine();
            if (command.equals("no")) {
                break;
            }
            }
            

       // Graph is used as follows:
        }
    }
}
    