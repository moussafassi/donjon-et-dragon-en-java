package fr.campus.dungeoncrawler.characters;

/**
 * Classe représentant les enemy
 * Hérite de character
 */
public class Enemy {
    private String name;
    private int healthLevel;
    private int attackLevel;
    public Enemy (String name, int healthLevel, int attackLevel){
        this.name = name;
        this.healthLevel = healthLevel;
        this.attackLevel = attackLevel;

    }

    public String getName() {
        return name;
    }

    public int getHealthLevel(){
        return healthLevel;
    }
    public int getAttackLevel(){
        return attackLevel;
    }
    @Override
    public String toString(){
        return name + "( Vies: " + healthLevel + ",Attaque: " + attackLevel + ")";
    }
}
