package fr.campus.dungeoncrawler.game;
import java.util.Scanner;
import fr.campus.dungeoncrawler.board.Board;
import fr.campus.dungeoncrawler.exceptions.OutOfBoardException;
import fr.campus.dungeoncrawler.utils.Dice;
import fr.campus.dungeoncrawler.characters.Character;



public class Game {
    private Menu menu = new Menu();

    public void start() {
        boolean running = true;
        while (running) {
            int choice = menu.displayMainMenu();
            switch (choice) {
                case 1:
                    Character character = menu.createCharacter();
                    if (character != null) {
                        System.out.println("Personnage créé: " + character);
                        menu.manageCharacter(character);//on gère le personnage et sous menu interactif
                    } else {
                        System.out.println("Retour au menu principal...");
                    }
                    break;
                case 2:
                    playBoard();
                    break;
                case 3:
                    running = false;
                    System.out.println("au revoir! ");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
    }

    private void playBoard() {
        Board board = new Board();
        Dice dice = new Dice();
        Scanner scanner = new Scanner(System.in);
        int position = 1;
        System.out.println("Début de la partie! ");
        while (position < board.getSize()) {
            System.out.println("Vous êtes sur la case " + position + "/" + board.getSize());
            System.out.println("appuyer sur Entrée pour lancer le dé");
            scanner.nextLine(); // attend que le joueur appuie sur entrée
            int roll = dice.roll();
            System.out.println("Vous lancez le dé et faites: " + roll);
            try {
                position += dice.roll();
                if (position > board.getSize()) {
                    throw new OutOfBoardException("le personnage dépasse la dernière case! ");
                }
            } catch (OutOfBoardException e) {
                System.out.println(e.getMessage());
                position = board.getSize();// ramène à la derniére case
            }

        //petite pause pour la lecture
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }
        System.out.println("Vous êtes arrivé au bout du plateau! ");
        System.out.println("1 - Rejouer");
        System.out.println("2 - Retour au menu principal");
        System.out.print("votre choix: ");

    int choice = menu.readInt();
        if(choice ==1)

    {
        playBoard();
        ;// relance la partie
    }else

    {
        System.out.println("Retour au menu principal...");
    }

    }
}
