package fr.campus.dungeoncrawler.utils;

import java.util.Random;

public class Dice {
    private Random random = new Random();
    public int roll(){
        return random.nextInt(6)+1;// Retoune un nombre entre 1 et 6
    }
}
