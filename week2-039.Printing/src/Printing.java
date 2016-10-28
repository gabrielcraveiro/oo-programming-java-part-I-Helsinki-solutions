public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times      
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
            System.out.println(""); 

    }

    public static void printSquare(int sideSize) {
        // 39.2
        int counter = 0 ;
        while (counter < sideSize) {
            printStars(sideSize);
            counter++;
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int contador = 0 ;
        while (contador < height) {
            printStars(width);   
            contador++;
    }
    }

    public static void printTriangle(int size) {
        // 39.4
        int x = 1;
        while (x <= size) {
            printStars(x);
            x++;
        }
        
        
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(5);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

}
