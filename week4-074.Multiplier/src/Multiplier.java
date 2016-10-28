/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriell
 */
public class Multiplier {
    private int x = 0;
    
    public Multiplier(int number) {
    this.x = number;
    }
    
    public int multiply(int otherNumber) {
        int result = this.x * otherNumber;
        return result;
    }
    
}
