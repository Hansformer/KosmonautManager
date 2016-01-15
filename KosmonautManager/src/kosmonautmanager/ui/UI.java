package kosmonautmanager.ui;

import java.util.Scanner;
import kosmonautmanager.logic.Game;

/**
 *
 * @author Hansformer
 */
public class UI {

    private Game game;
    private String cmsrName;
    private Scanner scanner = new Scanner(System.in);

    public UI() {
    }

    public void init() {
        System.out.println("\n\n\n\n\n                           C O S M O N A U T");
        System.out.println("                               - manager\n");

        System.out.println("\n                          Enter Comissar name");
        System.out.print("                              ");
        this.cmsrName = scanner.next();

        printCommands(0);
        mainMenu();

    }

    public void mainMenu() {

        while (true) {

            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                break;
            } else if (command.equalsIgnoreCase("help")) {
                printCommands(0);
            } else if (command.equalsIgnoreCase("game")) {
                game = new Game(cmsrName);
                game.newGame();
                gameMenu();
            }
            System.out.print(">");
        }
    }

    public void gameMenu() {
        boolean quit = false;

        while (!quit) {
            System.out.print(">");
            String command = scanner.nextLine();
            
            if (command.equalsIgnoreCase("quit")) {
                quit = true;
                break;
            }
            
        }
    }

    private void printCommands(int menu) {

        if (menu == 0) {
            System.out.println("Available commands:");
            System.out.println("------------------");
            System.out.println("Game: Begins a new game");
            System.out.println("Help: Prints list of commands");
            System.out.println("Quit: Closes the game");
        }

    }

}
