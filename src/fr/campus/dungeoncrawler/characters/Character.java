package fr.campus.dungeoncrawler.characters;
import fr.campus.dungeoncrawler.items.DefensiveEquipement;
import fr.campus.dungeoncrawler.items.OffensiveEquipement;

/**
 * Classe abstraite représentant un personnage du jeu
 * avec c'est caractéristique point de vie, une force et des équipements.
 */
public abstract class Character {
    protected String name;
    protected int healthLevel;
    protected  int attackLevel;
    protected OffensiveEquipement offensive;
    protected DefensiveEquipement defensive;

    /**
     * constructeur du personnage.
     * @param name Nom du personnage
     * @param healthLevel Niveau de vie du personnage
     * @param attackLevel Niveau d'attack
     * @param offensive Equipement offensive (Weapon ou Spell)
     * @param defensive Equipement défensive (potion ou shield)
     */

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

    /**
     * Méthode abstraite que chaque type de personnage doit implémenter.
     * permet de réaliser une attaque spéciale
     */
    public abstract void specialAttack();

    /**
     * Retourne une représentation textuelle complète du personnage.
     * @return chaine de caractères décrivant le personnage et ses équipements
     */

    @Override
    public String toString(){
        return "Character: " + name
                + ",Health: " + healthLevel
                + ",Strength: " + attackLevel
                + ",Offensive: " + offensive
                + ",Defensive: " + defensive;
    }
}
