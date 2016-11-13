
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriell
 */
public class BirdsData {

    private ArrayList<Birds> Birds = new ArrayList();

    public BirdsData() {
        this.Birds = new ArrayList<Birds>();
    }

    public void addBird(String name, String latinName) {
        this.Birds.add(new Birds(name, latinName));
    }

    public ArrayList<Birds> birds() {
        return this.Birds;
    }

    public void statistics() {
        for (Birds b : Birds) {
            System.out.println(b);
        }
    }
}
