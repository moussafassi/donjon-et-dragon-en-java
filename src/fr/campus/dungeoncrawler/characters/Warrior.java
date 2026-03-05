package fr.campus.dungeoncrawler.characters;
import fr.campus.dungeoncrawler.items.Weapon;
import fr.campus.dungeoncrawler.items.Potion;

public class Warrior extends Character{
    public Warrior(String name){
        super(name, 25,15,
                new Weapon("Sword", 10,"Weapon"),
                new Potion("Reinforcement potion",5,"shield"));

    }

}
