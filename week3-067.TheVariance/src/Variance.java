import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static double sum(ArrayList<Integer> list) {
        double sum = 0;
        for (double number : list) {
            sum = sum + number;
        }
        return sum;
        
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double sum = 0.0;
        for(double a : list)
            sum += a;
        return sum/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double average = average(list);
        double temp = 0;
        for (double a : list) {
            temp += ((a-average)*(a-average));
        }
        return temp/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(5);
        list.add(7);
        list.add(5);
        
        System.out.println("The variance is: " + variance(list));
    }

}
