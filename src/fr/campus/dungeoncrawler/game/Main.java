package fr.campus.dungeoncrawler.game;

/**
 *Classe principale du projet Dugeon Crawler
 * contient la méthode main qui lance le jeu
 */
public class Main {
    /**
     * Point d'entrer du programme
     * crée une instance Game et démarre le jeu.
     * @param args Arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args){

        //--- Lancement du jeu---
     Game game = new Game();
     game.start();
    }
}
