
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
public class Phonebook {

    private ArrayList<Person> lista;

    public Phonebook() {
        this.lista = new ArrayList();
    }

    public void add(String name, String number) {
        Person xd = new Person(name, number);
        this.lista.add(xd);
    }

    public void printAll() {
        for (Person rotate : lista) {
            System.out.println(rotate);
        }
    }

    public String searchNumber(String name) {
        for (Person search : lista) {
            if (search.getName().contains(name)) {
                return search.getNumber();
            }
        }
        return "number not known";
    }

}
