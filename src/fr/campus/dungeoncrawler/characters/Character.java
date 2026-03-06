package fr.campus.dungeoncrawler.characters;
import fr.campus.dungeoncrawler.items.DefensiveEquipement;
import fr.campus.dungeoncrawler.items.OffensiveEquipement;
import fr.campus.dungeoncrawler.items.Weapon;
import fr.campus.dungeoncrawler.items.Potion;

public abstract class Character {
    protected String name;
    protected int healthLevel;
    protected  int attackLevel;
    protected OffensiveEquipement offensive;
    protected DefensiveEquipement defensive;

    public Character(String name, int healthLevel, int attackLevel, OffensiveEquipement offensive, DefensiveEquipement defensive){
        this.name = name;
        this.healthLevel = healthLevel;
        this.attackLevel = attackLevel;
        this.offensive = offensive;
        this.defensive = defensive;
    }
// Getters
    public String getName() {
        return name;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public OffensiveEquipement getOffensive() {
        return offensive;
    }

    public DefensiveEquipement getDefensive() {
        return defensive;
    }
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    // méthode abstraite que chaque enfant peut personnaliser
    public abstract void specialAttack();

    @Override
    public String toString(){
        return "Character: " + name
                + ",Health: " + healthLevel
                + ",Strength: " + attackLevel
                + ",Offensive: " + offensive
                + ",Defensive: " + defensive;
    }
}
