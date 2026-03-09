package fr.campus.dungeoncrawler.utils;

import java.util.Random;

/**
 * Représent un dé virtuel pour les déplacement du plateau
 * valeur du dé compris entre 1 et 6
 */
public class Dice {
    /** Générateur de nombre aléatoires */
    private Random random = new Random();

    /**
     * lance le dé et retourne une valeur
     * @return retourne une valeur entre 1 et 6 qui sera le résultat du lancer
     */
    public int roll(){
        return random.nextInt(6)+1;// Retoune un nombre entre 1 et 6
    }
}
