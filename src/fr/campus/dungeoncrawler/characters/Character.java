package fr.campus.dungeoncrawler.characters;
import fr.campus.dungeoncrawler.items.Weapon;
import fr.campus.dungeoncrawler.items.Potion;

public abstract class Character {
    protected String name;
    protected int healthLevel;
    protected  int attackLevel;
    protected Weapon weapon;
    protected Potion potion;

    public Character(String name, int healthLevel, int attackLevel, Weapon weapon, Potion potion){
        this.name = name;
        this.healthLevel = healthLevel;
        this.attackLevel = attackLevel;
        this.weapon = weapon;
        this.potion = potion;
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

    public Weapon getWeapon() {
        return weapon;
    }

    public Potion getPotion() {
        return potion;
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

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
    }
    @Override
    public String toString(){
        return "Character: " + name
                + "\nHealth: " + healthLevel
                + "\nAttack: " +weapon
                + "\nPotion: " + potion;
    }
}
