package fr.campus.dungeoncrawler.characters;
import fr.campus.dungeoncrawler.items.Weapon;
import fr.campus.dungeoncrawler.items.Shield;

/**
 * Claase représentant un Guerrier(warrior)
 * Hérite de character et a un équipement offensif physique
 */
public class Warrior extends Character{
    /**
     * constructeur du Wizard
     * @param name Nom du guerrier
     */
    public Warrior(String name){
        super(name, 25,15,
                new Weapon("Sword", 10),
                new Shield("Bouclier",5));

    }
    /**
     * Attaque spéciale du guerrier
     */
    @Override
    public void specialAttack(){
        System.out.println(name + "utilise son attaque spéciale : Coup puissant! ");
    }

}
