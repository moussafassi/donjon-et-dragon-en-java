package fr.campus.dungeoncrawler.characters;
import fr.campus.dungeoncrawler.items.Spell;
import fr.campus.dungeoncrawler.items.Potion;

/**
 * Classe représentant un Magicien (Wizard).
 * Hérite de character et a un équipement offensif magique.
 */

public class Wizard extends Character{
    /**
     * constructeur du Wizard
     * @param name Nom du magicien
     */
    public Wizard(String name){
        super(name,15, 20,
                new Spell("Boule de feu", 10, "wizard"),
                new Potion("Mana Potion", 15,0));

    }

    /**
     * Attaque spéciale du Wizard
     */
    @Override
    public void specialAttack(){
        System.out.println( name + "lance une attaque magique");
    }
}
