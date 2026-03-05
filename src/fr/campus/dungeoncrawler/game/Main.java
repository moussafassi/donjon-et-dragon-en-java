package fr.campus.dungeoncrawler.game;

import fr.campus.dungeoncrawler.items.Weapon;
import fr.campus.dungeoncrawler.items.Potion;

public class Main {
    public static void main(String[] args){
        //----Test des objets---
        Weapon sword = new Weapon("Sword", 10,"Weapon");
        Potion healtPotion = new Potion("Small Health potion", 15, "Health");
        Potion manaPotion = new Potion("Small Mana potion", 10, "Mana");
        Potion shield = new Potion("Reinforcement potion", 5, "Shield");
        System.out.println(sword);
        System.out.println(healtPotion);
        System.out.println(manaPotion);
        System.out.println(shield);
        //--- Lancement du jeu---
     Game game = new Game();
     game.start();
    }
}
