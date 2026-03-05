package fr.campus.dungeoncrawler.items;

public class Potion {
    private String name;
    private String type; // potion health or mana, shield
    private int value; // ce qu'elle donne (hp , mana , Defense)
    public Potion(String name, int value, String type){
        this.name = name;
        this.type = type;
        this.value = value;
    }
    //Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public int getValue() {
        return value;
    }
    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString(){
        return name + "(" + type + ") - value: " + value;
    }
}
