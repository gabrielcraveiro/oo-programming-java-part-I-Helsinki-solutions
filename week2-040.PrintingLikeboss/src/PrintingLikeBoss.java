public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
    int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
            System.out.println(""); 

    }
    

    public static void printWhitespaces(int size) {
        // 40.1
        int i = 0;
        while (i < size) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
         int x = 1;
         int y = size-1;
        while (x <= size) {
            printWhitespaces(y);
            printStars(x);
            y--;
            x++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int z = 1;
        int y = height-1;
        int r = 0;
        while (z <= height) {
            printWhitespaces(y);
            printStars(z+r);
            y--;
            z++;    
            r++;
            
        }
                    printWhitespaces(height-2);
                    printStars(3);
                    printWhitespaces(height-2);
                    printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printTriangle(4);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(5);
    }
}
