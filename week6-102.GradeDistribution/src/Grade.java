
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriell
 */
public class Grade {

    private int x;
    private ArrayList<Integer> lista;
    private int aprovados;

    public void grades(ArrayList<Integer> x) {
        this.lista = x;
        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + toStars(numberOfGrades(this.lista, i)));
        }
        System.out.println("Acceptance percentage: "+percentage());
    }

    public int numberOfGrades(ArrayList<Integer> z, int v) {
        int j = 0;
        for (int n : z) {
            if (v == 0) {
                if (n >= 0 && n < 30) {
                    j++;
                }
            }
            if (v == 1) {
                if (n >= 30 && n < 35) {
                    j++;
                }
            }
            if (v == 2) {
                if (n >= 35 && n < 40) {
                    j++;
                }
            }
            if (v == 3) {
                if (n >= 40 && n < 45) {
                    j++;
                }
            }
            if (v == 4) {
                if (n >= 45 && n < 50) {
                    j++;
                }
            }
            if (v == 5) {
                if (n >= 50 && n <= 60) {
                    j++;
                }
            }

        }
        return j;
    }

    public String toStars(int number) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < number; i++) {
            temp.append("*");
        }
        return temp.toString();
    }
    
    public double percentage() {
        
        for (int n : this.lista) {
            if (n > 29) {
                this.aprovados++;
            }
        }
        return (double)100*this.aprovados/this.lista.size();
    }

}
