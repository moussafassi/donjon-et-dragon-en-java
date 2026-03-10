package fr.campus.dungeoncrawler.board;
import java.util.ArrayList;
import fr.campus.dungeoncrawler.items.Weapon;
import fr.campus.dungeoncrawler.items.Potion;

/**
 * Représente le plateau de jeu
 * Il contient 64 cases (Cell) dont les 4 premiéres sont personnalisées.
 */
public class Board {
    private ArrayList<Cell>cells;
    public static final int SIZE = 64; // nombre total de cases

    public Board() {
        cells = new ArrayList<>();
        // 4 premières cases personnalisées
        cells.add(new EmptyCell(1));//case vide
        cells.add(new EnemyCell(2));//case ennemi
        cells.add(new WeaponCell(3, new Weapon("épée magique", 15)));//case arme
        cells.add(new PotionCell(4, new Potion("potion de vie", 10)));//case potion
        //les autres cases sont vides
        for (int i = 5; i <= SIZE; i++) {
            cells.add(new EmptyCell(i));
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