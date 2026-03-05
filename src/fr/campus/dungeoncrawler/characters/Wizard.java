package fr.campus.dungeoncrawler.characters;
import fr.campus.dungeoncrawler.items.Weapon;
import fr.campus.dungeoncrawler.items.Potion;

public class Wizard extends Character{
    public Wizard(String name){
        super(name,15, 20,
                new Weapon("wizard's Staff", 5,"Spell"),
                new Potion("Mana Potion", 10, "Mana"));
    }
}
