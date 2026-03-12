package fr.campus.dungeoncrawler.game;
import java.util.Scanner;

import fr.campus.dungeoncrawler.board.*;
import fr.campus.dungeoncrawler.exceptions.OutOfBoardException;
import fr.campus.dungeoncrawler.items.Potion;
import fr.campus.dungeoncrawler.items.Spell;
import fr.campus.dungeoncrawler.items.Weapon;
import fr.campus.dungeoncrawler.utils.Dice;
import fr.campus.dungeoncrawler.characters.Character;
import fr.campus.dungeoncrawler.board.WeaponCell;
import fr.campus.dungeoncrawler.board.PotionCell;
/**
 * Classe principale co,tenat la logique du jeu.
 *
 *Elle gère :
 *  - l'affichage du menu principal
 *  - la création et la gestion des personnages
 *  - le déroulement de la parties sur plateau
 */

public class Game {
    /** Objet permettant d'afficher les menus et gérer les entrées utilisateur */
    private Menu menu = new Menu();
    private Character character;

    /**
     * Démarre le jeu et affiche le menu principal.
     * la boucle continue tant que le joeur ne choisit pas de quitter.
     */

    public void start() {
        boolean running = true;
        while (running) {
            int choice = menu.displayMainMenu();
            switch (choice) {
                case 1:
                    character = menu.createCharacter();
                    if (character != null) {
                        boolean playNow = menu.manageCharacter(character);
                        if(playNow){
                            playBoard();
                        }

                    } else {
                        System.out.println("Retour au menu principal...");
                    }
                    break;
                case 2:
                    if(character == null){
                        System.out.println("Vous devez créer un personnage avant de jouer! ");
                    }else {
                        playBoard();
                    }
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

    /**
     * Lance une partie sur le plateau.
     *
     * Le joueur commence à la case 1 et avance en lançant un dé virtuel.
     * la partie se termine lorsquela dernière case du plateau est atteinte.
     *
     * si la position dépasse la dernière case,
     * une exception{@link OutOfBoardException} est levée puis gérée pour
     * ramener le personnage sur la derniére case.
     */

    private void playBoard() {
        Board board = new Board();
        Dice dice = new Dice();
        Scanner scanner = new Scanner(System.in);
        int position = 1;
        System.out.println("Début de la partie! ");

        while (position < board.getSize()) {
            // affiche le personnage
            System.out.println("\n=====Personnage=====" );
            System.out.println(character);
            System.out.println("=======================");
            //affiche la case actuelle et son contenu
            Cell currentCell = board.getCell(position);
            System.out.println("Vous êtes sur la case " + position + "/" + board.getSize());
            System.out.println(currentCell);//polymorphise message selon le type de case
           //changement d'arme si on trouve mieux
            if(currentCell instanceof WeaponCell) {
                WeaponCell weaponCell = (WeaponCell) currentCell;
                Weapon foundWeapon = weaponCell.getWeapon();
                System.out.println("Vous trouvez: " + foundWeapon);
                if (foundWeapon.getAllowedClass().equalsIgnoreCase(character.getClass().getSimpleName())) {


                if (foundWeapon.getAttackLevel() > character.getAttackLevel()) {
                    System.out.println("Vous équipez la nouvelle arme! ");
                    character.setOffensive(foundWeapon);
                } else {
                    System.out.println("Votre arme actuelle est meilleure.");
                }
                } else {
                System.out.println("Vous avez trouvé " + foundWeapon + " mais votre personnage ne peut l'utiliser.");
            }
        }
            // changement de sort si on trouve mieux
            if(currentCell instanceof SpellCell){
                SpellCell spellCell = (SpellCell) currentCell;
                Spell foundSpell = spellCell.getSpell();
                System.out.println("Vous trouvez: " + foundSpell);
                if(foundSpell.getAllowedClass().equalsIgnoreCase(character.getClass().getSimpleName())){

                    if (foundSpell.getAttackLevel() > character.getAttackLevel()){
                       System.out.println("Vous apprennez un nouveau sort! ");
                       character.setOffensive(foundSpell);
                    }else{
                        System.out.println("Vous connaissez déjà se sort");
                    }
                }else{
                   System.out.println("Vous avez trouvé " + foundSpell + "mais vous n'étes pas un Wizard dommage!");
                }
            }

            //stokage de la potion dans l'inventaire quand on en trouve une
            if(currentCell instanceof PotionCell){
                PotionCell potionCell =(PotionCell) currentCell;
                Potion foundPotion = potionCell.getPotion();
                System.out.println("Vous trouvez une potion! ");
                character.addPotion(foundPotion);
                character.showInventory();
            }


            //Pause avant  le lancement du dé
            System.out.println("\nQue voulez vous faire? ");
            System.out.println("1- lancer le dé");
            System.out.println("2- Voir l'inventaire");
            System.out.println("3- Quitter la partie");
            String input = scanner.nextLine(); // attend que le joueur appuie sur entrée
            if(input.equals("2")){
                character.showInventory();
                continue;
            }
            if (input.equals("3")){
                System.out.println("Vous quittez la partie...");
                return; // retourne au menu principal
            }
            if(!input.equals("1")){
                continue;
            }
            int roll = dice.roll();
            System.out.println("Vous lancez le dé et faites: " + roll);
            //Avancer
            position += roll;
            try {

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
        //le joueur est arrivé au bout
        System.out.println("Vous êtes arrivé au bout du plateau! ");
        //Choix de rejouer ou revenir au menu principal
        System.out.println("1 - Rejouer");
        System.out.println("2 - Retour au menu principal");
        System.out.print("votre choix: ");

    int choice = menu.readInt();
    scanner.nextLine();// consomme le retour à la ligne
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
