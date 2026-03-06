package fr.campus.dungeoncrawler.items;

public abstract class OffensiveEquipement {
    protected String name;
    protected int attackLevel;
    public OffensiveEquipement(String name, int attackLevel){
        this.name = name;
        this.attackLevel = attackLevel;
    }
    public String getName(){
        return name;
    }
    public int getAttackLevel(){
        return attackLevel;
    }
    @Override
    public String toString(){
        return name + "(attaque: " + attackLevel + ")";
    }
}
