package fr.campus.dungeoncrawler.board;

public class Tile {
    private  int position;
    public  Tile(int position){
        this.position = position;
    }
    //getters
    public int getPosition(){
        return position;
    }
    @Override
    public String toString(){

        return "Case " + position;
    }
}
