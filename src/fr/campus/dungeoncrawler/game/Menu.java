package fr.campus.dungeoncrawler.game;
import java.util.Scanner;

import fr.campus.dungeoncrawler.characters.Character;
import fr.campus.dungeoncrawler.characters.Warrior;
import fr.campus.dungeoncrawler.characters.Wizard;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    // affiche le menu principal et retourne le choix
    public int displayMainMenu(){
        System.out.println("===Menu===");
        System.out.println("1 - Nouveau personnage");
        System.out.println("2 - Quitter");
        System.out.print("Votre choix : ");
        return scanner.nextInt();
    }
    //Crée un personnage en demandant le type et le nom
    public Character createCharacter() {
        while (true) {
            System.out.println("Choisissez votre personnage: ");
            System.out.println("1 - Warrior");
            System.out.println("2 - Wizard");
            System.out.println("3 - Quitter");
            System.out.print("Votre choix: ");
            int typeChoice = scanner.nextInt();
            scanner.nextLine();
            if (typeChoice == 3) {
                System.out.println("Retour au menu principal...");
                return null;
            }
            System.out.print("Entrez le nom de votre personnage: ");
            String name = scanner.nextLine();
            if (typeChoice == 1) {
                return new Warrior(name);
            } else if (typeChoice == 2) {
                return new Wizard(name);
            } else {
                System.out.println("choix invalide!");
            }
        }
    }
    //sous menu
    public void manageCharacter(Character character){
        boolean managing = true;
        while (managing){
            System.out.println("\n===Gérer le personnage ===");
            System.out.println("1 - Afficher toute les infos");
            System.out.println("2 - Modifier le nom");
            System.out.println("3 - Retour au menu principal");
            System.out.print("Votre choix: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println(character);
                    break;
                case 2:
                    System.out.print("Entrez le nouveau nom: ");
                    String newName = scanner.nextLine();
                    character.setName(newName);
                    System.out.println("Nom modifié");
                    break;
                case 3:
                    managing = false;
                    break;
                default:
                    System.out.println(("Choix invalide !"));
            }
        }
    }
}


