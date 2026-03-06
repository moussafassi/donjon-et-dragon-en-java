package fr.campus.dungeoncrawler.items;

public abstract class DefensiveEquipement {
    protected String name;
    protected int defenseLevel;
    public DefensiveEquipement(String name, int defenseLevel){
        this.name = name;
        this.defenseLevel = defenseLevel;
    }
    public String getName(){
        return name;
    }
    public int getDefenseLevel(){
        return defenseLevel;
    }
    @Override
    public String toString(){
        return name + "(défense: " + defenseLevel + ")";
    }
}
