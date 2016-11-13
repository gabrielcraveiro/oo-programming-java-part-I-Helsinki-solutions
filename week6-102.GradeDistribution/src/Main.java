
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Grade grade = new Grade();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner nota = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("Type exam score, -1 completes:");
        while (true) {
            int x = nota.nextInt();
            if (x >= 0 && x <= 60) {
                notas.add(x);
            } else if (x < 0) {
                break;
            }
        }
        
        grade.grades(notas);
       
    }
}
