package fr.campus.dungeoncrawler.items;

/**
 * classe abstraite représentant les équipements offensive
 * étendue par weapon et spell
 * il posséde un nom et un niveau d'arme
 */
public abstract class OffensiveEquipement {
    /** nome de l'equipement */
    protected String name;
    /** Niveau d'attaque de l'équipement */
    protected int attackLevel;

    /**
     * Constructeur de l'équipement offensive
     * @param name nom de l'équipement
     * @param attackLevel niveua de l'équipement
     */
    public OffensiveEquipement(String name, int attackLevel){
        this.name = name;
        this.attackLevel = attackLevel;
    }

    /**
     * Retourne le nom de l'équipement
     * @return Nom de l'équipement
     */
    public String getName(){
        return name;
    }

    /**
     * Retourne le niveau d'attaque de l'équipement
     * @return Niveau d'attaque
     */
    public int getAttackLevel(){
        return attackLevel;
    }

    /**
     * Retourne de manière littérale l'équipement offensive
     * @return une chaien de caractères du type "Nom(attaque: niveau)"
     */
    @Override
    public String toString(){
        return name + "(attaque: " + attackLevel + ")";
    }
}
