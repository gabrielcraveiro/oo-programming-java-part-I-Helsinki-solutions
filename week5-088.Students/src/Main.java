
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("name: ");
            String nome = input.nextLine();
            if (nome.equals("")) {
                break;
            } else {
                System.out.println("stundentnumber: ");
                String numero = input.nextLine();
                list.add(new Student(nome, numero));
            }
        }
        for (Student sout : list) {
            System.out.println(sout);
        }

        System.out.println("Give search term: ");
        String search = input.nextLine();
        System.out.println("Result :");
        for (Student sout : list) {
            if (sout.getName().contains(search)) {
                System.out.println(sout);
            }
            else {
                
            }
        }

    }
}
