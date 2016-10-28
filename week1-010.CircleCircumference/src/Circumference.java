
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
       // Program your solution here 
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius:");
        double radius = Integer.parseInt(reader.nextLine());
        double circumference=2*(Math.PI*radius);
        System.out.println("Circumference of the circle:"+circumference);
 
    }
}
