package fr.campus.dungeoncrawler.items;

/**
 * Classe abstraite représentant un équpiement défensif
 * classe étendue par Shiel et Potion
 * un équipemnt défensive possède un nom et un niveau de défense
 */
public abstract class DefensiveEquipement {
    /** nom de l"équipement de défense */
    protected String name;
    /** niveau de défense */
    protected int defenseLevel;

    /**
     * constructeur de l'équipement défensive
     * @param name nom de l'équipement
     * @param defenseLevel niveau de l'équipemnent
     */
    public DefensiveEquipement(String name, int defenseLevel){
        this.name = name;
        this.defenseLevel = defenseLevel;
    }

    /**
     * Retourne le nom de l'équipement
     * @return Nom de l'équipement
     */
    public String getName(){
        return name;
    }

    /**
     * retourne le niveau de l'équipement
     * @return le niveau de l'équipement défensivve
     */
    public int getDefenseLevel(){
        return defenseLevel;
    }

    /**
     * retounre une répresentation littéral de l'équipement défensive
     * @return une chaine de caratère du type "Nom(défense: niveau)".
     */
    @Override
    public String toString(){
        return name + "(défense: " + defenseLevel + ")";
    }
}
