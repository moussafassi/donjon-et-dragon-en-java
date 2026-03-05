package fr.campus.dungeoncrawler.game;
import fr.campus.dungeoncrawler.characters.Character;

public class Game {
    private Menu menu = new Menu();
    public void start(){
        boolean running = true;
        while(running){
            int choice = menu.displayMainMenu();
            switch(choice){
                case 1:
                    Character character = menu.createCharacter();
                    if (character != null) {
                        System.out.println("Personnage créé: ");
                       menu.manageCharacter(character);//on gère le personnage
                    }else{
                        System.out.println("Retour au menu principal...");
                    }
                    break;
                case 2:
                    running = false;
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
    }
}
