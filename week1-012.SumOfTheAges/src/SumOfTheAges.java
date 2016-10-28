
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name:");
        String a1 = reader.nextLine();
        System.out.println("Type your age:");
        int age1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type your name:");
        String a2 = reader.nextLine();
        System.out.println("Type your age:");
        int age2 = Integer.parseInt(reader.nextLine());
        int sum = age1+age2;
        System.out.println(a1+" and "+a2+" are "+sum+" years old in the total" );
    }
}
