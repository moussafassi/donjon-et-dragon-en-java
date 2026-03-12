package fr.campus.dungeoncrawler.game;
import java.util.Scanner;

import fr.campus.dungeoncrawler.characters.Character;
import fr.campus.dungeoncrawler.characters.Warrior;
import fr.campus.dungeoncrawler.characters.Wizard;

/**
 * Classe permettant d'avoir un menu interactif
 * permet de créer un personnage
 */
public class Menu {
    /**
     * scanner permet de lire les éntrées utilisateur depuisla consol
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * permet de verifier si l'utilisateur rentre bien une donnée valide.
     * @return la donnée renter par l'utilisateur
     */
    //vérifier la saisie
    public int readInt(){
        while(!scanner.hasNextInt()){
            System.out.println("Veuillez entre un nombre valide! ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * affiche le menu principal du jeu
     * @return une valeur correspondant au chois=x de l'utilisateur
     */

    // affiche le menu principal et retourne le choix
    public int displayMainMenu(){
        System.out.println("===Menu===");
        System.out.println("1 - Nouveau personnage");
        System.out.println("2 - Jouer");
        System.out.println("3 - Quitter");
        System.out.print("Votre choix : ");
        int choice = readInt();//lit un entier valide
        scanner.nextLine();// consomme le retour à la ligne
        return choice;
    }

    /**
     * permet de créer un personnage  avec le type et le nom
     * l'utilisateur peut choisir pour le moment avec warrior ou Wizard
     * @return le personnage créé ou null si l'utilisateur choist de quitter
     */
    //Crée un personnage en demandant le type et le nom
    public Character createCharacter() {
        while (true) {
            System.out.println("Choisissez votre personnage: ");
            System.out.println("1 - Warrior");
            System.out.println("2 - Wizard");
            System.out.println("3 - Quitter");
            System.out.print("Votre choix: ");
            int typeChoice = readInt();
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

    /**
     * Sous-menu pour gérer un personnage déjà créé
     * @param character le personnage gérer
     */
    //sous menu
    public void manageCharacter(Character character){
        boolean managing = true;
        boolean playNow = true;
        while (managing) {
            System.out.println("\n===Gérer le personnage ===");
            System.out.println("1 - Afficher toute les infos");
            System.out.println("2 - Modifier le nom");
            System.out.println("3 - jouer");
            System.out.println("4 - Retour au menu principal");
            System.out.print("Votre choix: ");
            int choice = readInt();//sécurise la saisie
            scanner.nextLine();// consomme le retour ligne
            switch (choice) {
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
                    playNow = true;
                    managing = false;
                    break;
                case 4:
                    managing = false;
                    break;
                default:
                    System.out.println(("Choix invalide !"));
            }
            return playNow;

        }

    }
}


