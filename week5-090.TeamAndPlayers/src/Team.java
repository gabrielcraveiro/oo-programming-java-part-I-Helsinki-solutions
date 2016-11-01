
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
public class Team {

    private String name;
    private ArrayList<Player> jogador;
    private int maxSize;

    public Team(String teamName) {
        this.name = teamName;
        this.jogador = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (!tamanhoMaximo()) {
            jogador.add(player);
        }
    }
    
    public boolean tamanhoMaximo() {
        if (jogador.size() >= this.maxSize) {
            return true;
        } else {
            return false;
        }
    }

    public void printPlayers() {
        for (Player x : jogador) {
            System.out.println(x);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return jogador.size();
    }

    public int goals() {
        int i = 0;
        for (Player x : jogador) {
            i += x.goals();
        }
        return i;
    }
}
