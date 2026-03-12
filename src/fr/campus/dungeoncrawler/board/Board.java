package fr.campus.dungeoncrawler.board;
import java.util.ArrayList;
import java.util.Random;

import fr.campus.dungeoncrawler.items.Spell;
import fr.campus.dungeoncrawler.items.Weapon;
import fr.campus.dungeoncrawler.items.Potion;
import fr.campus.dungeoncrawler.characters.Enemy;


/**
 * Représente le plateau de jeu
 * Il contient 64 cases (Cell) dont les 4 premiéres sont personnalisées.
 */
public class Board {
    private ArrayList<Cell>cells;
    public static final int SIZE = 64; // nombre total de cases

    public Board() {
        cells = new ArrayList<>();
        Random random = new Random();
        //listes d'objets disponibles
        ArrayList<Weapon> weapons = new ArrayList<>();
        weapons.add(new Weapon("legendary sword",25, 2, "Warrior"));
        weapons.add(new Weapon("Epic sword", 18,5, "Warrior"));
        weapons.add(new Weapon("sword", 10, 10, "Warrior"));

        ArrayList<Potion> potions = new ArrayList<>();
        potions.add(new Potion("Health potion", 10, 10));
        potions.add(new Potion("Mana potion", 15, 10));

        //listes d'ennemie
        ArrayList<Enemy>enemies = new ArrayList<>();
        enemies.add(new Enemy("gobelin", 15, 5));
        enemies.add(new Enemy("Orc", 25, 10));
        enemies.add(new Enemy("Dragon",100,25));

        // listes de sort
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("super fire ball",15,"Wizard"));
        spells.add(new Spell("meteor", 25,"Wizard"));


        // 4 premières cases personnalisées
        cells.add(new EmptyCell(1));//case vide
        cells.add(new EnemyCell(2, enemies.get(0)));//case ennemi
        cells.add(new WeaponCell(3, weapons.get(0)));//case arme
        cells.add(new PotionCell(4, potions.get(0)));//case potion
        //les autres cases sont vides
        for (int i = 5; i <= SIZE; i++) {
            int type = random.nextInt(5);
            if (type == 0) {
                cells.add(new EmptyCell(i));
            } else if (type == 1) {
                Weapon weapon = weapons.get(random.nextInt(weapons.size()));
                if (weapon.getQuantity() > 0) {
                    cells.add(new WeaponCell(i, weapon));
                    weapon.decreaseQantity();
                } else {
                    cells.add(new EmptyCell(i));
                }
            } else if (type == 2) {
                Spell spell = spells.get(random.nextInt(spells.size()));
                cells.add(new SpellCell(i, spell));

            }else if (type == 3) {
                Enemy enemy = enemies.get(random.nextInt(enemies.size()));
                cells.add(new EnemyCell(i, enemy));

            } else {
                Potion potion = potions.get(random.nextInt(potions.size()));
                if (potion.getQuantity() > 0) {
                    cells.add(new PotionCell(i, potion));
                    potion.decreaseQantity();
                } else {
                    cells.add(new EmptyCell(i));
                }
            }
        }

        }



        /**
         * Retourne la taille du plateau
         * @return le nombre de case
         */
        public int getSize(){
            return cells.size();
        }

    /**
     * retourne la case correspondant à la position sur le plateau
     * @param position Position de la case(1 à Size)
     * @return La cell correspondante
     */
    public Cell getCell(int position){
            if (position >=1 && position <= SIZE){
                return cells.get(position - 1);
        }
            return null;
    }
}