package fr.campus.dungeoncrawler.characters;
import fr.campus.dungeoncrawler.items.Spell;
import fr.campus.dungeoncrawler.items.Potion;

public class Wizard extends Character{
    public Wizard(String name){
        super(name,15, 20,
                new Spell("Boule de feu", 15),
                new Potion("Mana Potion", 10));
    }
    @Override
    public void specialAttack(){
        System.out.println( name + "lance une attaque magique");
    }
}
