/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriell
 */
public class Birds {

    private String name;
    private String latin;
    private int obs;

    public Birds(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.obs = 0;
    }

    public String getName() {
        return name;
    }

    public void observed() {
        this.obs++;
    }

    public String toString() {
        return this.name + " (" + latin + "): " + this.obs + " observations";
    }
}
