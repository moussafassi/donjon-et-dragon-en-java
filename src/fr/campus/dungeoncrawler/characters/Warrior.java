package fr.campus.dungeoncrawler.characters;
import fr.campus.dungeoncrawler.items.Weapon;
import fr.campus.dungeoncrawler.items.Shield;

public class Warrior extends Character{
    public Warrior(String name){
        super(name, 25,15,
                new Weapon("Sword", 10),
                new Shield("Bouclier",5));

    }
    @Override
    public void specialAttack(){
        System.out.println(name + "utilise son attaque spéciale : Coup puissant! ");
    }

}
