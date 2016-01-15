package kosmonautmanager.logic;

import java.util.ArrayList;
import kosmonautmanager.domain.Cosmonaut;

/**
 * Main game logic
 *
 * @author Hansformer
 */
public class Game {

    private String player;
    private CosmonautGenerator gene = new CosmonautGenerator();
    private ArrayList<Cosmonaut> crew;

    public Game(String player) {
        this.player = player;
    }

    public void newGame() {
        // Generate initial Cosmonauts for the player
        crew = gene.generateTen();

    }

    public void printCosmonauts(int count, boolean stats) {
        System.out.println("Available Cosmonauts for Mission:");
        System.out.println("-----------------------------------------------------------------");

        if (!stats) {
            for (int i = count; i < crew.size(); i++) {
                System.out.println(crew.get(i));
                System.out.println("------------------------------------------------");
            }
        }
    }

}
