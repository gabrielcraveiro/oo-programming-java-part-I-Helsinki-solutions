/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriell
 */
public class Person {
    private String number;
    private String name;
    
    public Person(String name, String number) {
        this.number = number;
        this.name = name;
    }
    
    public void changeNumber(String novoNum) {
        this.number = novoNum;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return this.name + " number: "+this.number;
    }
    

}
                          